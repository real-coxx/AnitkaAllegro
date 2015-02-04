package com.springapp.service;

import com.springapp.builder.SzczegolyDostawyBuilder;
import com.springapp.dao.SposobDostawyDAO;
import com.springapp.dao.SzczegolyDostawyDAO;
import com.springapp.dto.SposobDostawyTO;
import com.springapp.dto.SzczegolyDostawyTO;
import com.springapp.helpers.RodzajPlatnosci;
import com.springapp.model.SzczegolydostawyEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Alicja on 2015-02-01.
 */
@Service
public class SzczegolyDostawyServiceImpl implements SzczegolyDostawyService {

    @Autowired
    SzczegolyDostawyDAO szczegolyDostawyDAO;

    @Autowired
    SposobDostawyService sposobDostawyService;

    @Override
    public List<SzczegolyDostawyTO> getSzczegolyDostawyByCennikDostaw(int idCennikDostaw) {

        SposobDostawyTO sposobDostawyTO;
        List<SzczegolyDostawyTO> szczegolyDostawyTOs = new ArrayList<SzczegolyDostawyTO>();
        List<SzczegolydostawyEntity> szczegolydostawyEntities = szczegolyDostawyDAO.getSzczegolyDostawyByCennik(idCennikDostaw);

        SzczegolyDostawyBuilder builder = new SzczegolyDostawyBuilder();

        for (SzczegolydostawyEntity szczegolydostawyEntity : szczegolydostawyEntities) {

            sposobDostawyTO = sposobDostawyService.getSposobDostawyById(szczegolydostawyEntity.getSposobDostawyID());
            builder.setId(szczegolydostawyEntity.getId())
                    .setKosztPierwszejSztuki(szczegolydostawyEntity.getKosztPierwszejSztuki())
                    .setKosztKolejnejSztuki(szczegolydostawyEntity.getKosztKolejnejSztuki())
                    .setLiczbaWPaczce(szczegolydostawyEntity.getLiczbaWPaczce())
                    .setSposobDostawyTO(sposobDostawyTO);

            SzczegolyDostawyTO szczegolyDostawyTO = new SzczegolyDostawyTO(builder);
            szczegolyDostawyTOs.add(szczegolyDostawyTO);
        }
        return szczegolyDostawyTOs;
    }

    @Override
    public HashMap<String, Double> getMenuWyboruSposobuDostawy(int idCennikDostaw, int iloscSztuk) {

        HashMap<String, Double> menu = new HashMap<String, Double>();
        List<SzczegolyDostawyTO> szczegolyDostawyTOs = getSzczegolyDostawyByCennikDostaw(idCennikDostaw);

        for (SzczegolyDostawyTO szczeolyDostawyTO : szczegolyDostawyTOs) {
            String rodzajPlatnosci = RodzajPlatnosci.getPelnaNazwa(szczeolyDostawyTO.getSposobDostawyTO().getRodzajPlatnosci());
            String sposobDostawy = szczeolyDostawyTO.getSposobDostawyTO().getNazwa();
            double kosztWysylki = getKosztWysylki(iloscSztuk, szczeolyDostawyTO);
            String kosztWysylkiString = Double.toString(kosztWysylki);
            String wpis = rodzajPlatnosci + ": " + sposobDostawy + " " + kosztWysylkiString + " zł";

            menu.put(wpis, kosztWysylki);
        }
        return menu;
    }

    private double getKosztWysylki(int iloscSztuk, SzczegolyDostawyTO szczegolyDostawyTO) {
        double kosztWysylki = 0;
        if (iloscSztuk == 1) {
            return szczegolyDostawyTO.getKosztPierwszejSztuki();
        }
        int liczbaPaczek = (int) iloscSztuk/szczegolyDostawyTO.getLiczbaWPaczce();
        for (int i=0; i<liczbaPaczek; i++){
            kosztWysylki += szczegolyDostawyTO.getKosztPierwszejSztuki();
            for (int j=0; j<iloscSztuk-1; j++) {
                kosztWysylki += szczegolyDostawyTO.getKosztKolejnejSztuki();
            }
        }
        int pozostaleSztuki = iloscSztuk%szczegolyDostawyTO.getLiczbaWPaczce();
        if (pozostaleSztuki != 0) {
            kosztWysylki += szczegolyDostawyTO.getKosztPierwszejSztuki();
            for (int j=0; j<pozostaleSztuki-1; j++) {
                kosztWysylki += szczegolyDostawyTO.getKosztKolejnejSztuki();
            }
        }

        return kosztWysylki;
    }
}
