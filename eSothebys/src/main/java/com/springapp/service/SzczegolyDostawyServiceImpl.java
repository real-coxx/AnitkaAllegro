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
    public List<String> getMenuWyboruSposobuDostawy(int idCennikDostaw, int iloscSztuk) {

        List<String> menu = new ArrayList<String>();
        List<SzczegolyDostawyTO> szczegolyDostawyTOs = getSzczegolyDostawyByCennikDostaw(idCennikDostaw);

        for (SzczegolyDostawyTO szczeolyDostawyTO : szczegolyDostawyTOs) {
            String rodzajPlatnosci = RodzajPlatnosci.getPelnaNazwa(szczeolyDostawyTO.getSposobDostawyTO().getRodzajPlatnosci());
            String sposobDostawy = szczeolyDostawyTO.getSposobDostawyTO().getNazwa();
            String kosztWysylki = getKosztWysylki(iloscSztuk, szczeolyDostawyTO);
            String wpis = rodzajPlatnosci + ": " + sposobDostawy + " " + kosztWysylki + " zł";
            menu.add(wpis);
        }
        return menu;
    }

    private String getKosztWysylki(int iloscSztuk, SzczegolyDostawyTO szczegolyDostawyTO) {
        if (iloscSztuk == 1) {
            return Double.toString(szczegolyDostawyTO.getKosztPierwszejSztuki());
        }
        double kosztWysylki = szczegolyDostawyTO.getKosztPierwszejSztuki();
        for (int i=0; i<iloscSztuk-1; i++) {
            kosztWysylki += szczegolyDostawyTO.getKosztKolejnejSztuki();
        }
        return Double.toString(kosztWysylki);
    }
}
