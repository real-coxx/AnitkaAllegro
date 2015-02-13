package com.springapp.service;

import com.springapp.builder.AukcjaBuilder;
import com.springapp.builder.OfertaBuilder;
import com.springapp.builder.UzytkownikBuilder;
import com.springapp.dao.specificDAO.*;
import com.springapp.dto.AukcjaTO;
import com.springapp.dto.OfertaTO;
import com.springapp.dto.UzytkownikTO;
import com.springapp.helpers.Constants;
import com.springapp.helpers.LicytacjaWOsobachISztukach;
import com.springapp.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alicja on 2015-01-22.
 */
@Service
public class OfertaServiceImpl implements OfertaService {

    @Autowired
    OfertaDAO ofertaDAO;

    @Autowired
    AukcjaDAO aukcjaDAO;

    @Autowired
    UzytkownikDAO uzytkownikDAO;

    @Autowired
    DaneDoWysylkiDAO daneDoWysylkiDAO;

    @Autowired
    UmowaDAO umowaDAO;

    @Override
    public OfertaTO getOfertaByIdDoOfertKupna(int idOferty) {
        OfertaEntity ofertaEntity = ofertaDAO.getOfertaById(idOferty);
        AukcjaEntity aukcjaEntity = aukcjaDAO.getAukcjaById(ofertaEntity.getAukcja().getId());
        UzytkownikEntity uzytkownikEntity = uzytkownikDAO.getUzytkownikById(ofertaEntity.getKupujacy().getId());

        UzytkownikBuilder uzytkownikBuilder = new UzytkownikBuilder();
        UzytkownikTO uzytkownikTO = new UzytkownikTO(uzytkownikBuilder);

        AukcjaBuilder aukcjaBuilder = new AukcjaBuilder();
        aukcjaBuilder.setId(aukcjaEntity.getId())
                .setCenaKupTeraz(aukcjaEntity.getCenaKupTeraz());

        AukcjaTO aukcjaTO = new AukcjaTO(aukcjaBuilder);

        OfertaBuilder builder = new OfertaBuilder();
        builder.setId(ofertaEntity.getId())
                .setAukcja(aukcjaEntity)
                .setKupujacy(uzytkownikEntity);

        OfertaTO ofertaTO = new OfertaTO(builder);
        return ofertaTO;
    }

    @Override
    public List<OfertaTO> findOfertyByAukcjaDoOfertKupna(int idAukcji) {
        List<OfertaEntity> ofertaEntities = ofertaDAO.findOfertyByAukcja(idAukcji);
        List<OfertaTO> oferty = new ArrayList<OfertaTO>();
        AukcjaEntity aukcjaEntity = aukcjaDAO.getAukcjaById(idAukcji);

        for (OfertaEntity ofertaEntity : ofertaEntities) {

            UzytkownikEntity kupujacyEntity = ofertaEntity.getKupujacy();
            String loginKupujacego = kupujacyEntity.getLogin();
            String zamaskowanyUzytkownik = loginKupujacego.charAt(0)+"..."+loginKupujacego.charAt(loginKupujacego.length()-1);
            kupujacyEntity.setLogin(zamaskowanyUzytkownik);

            OfertaBuilder builder = new OfertaBuilder();
            builder.setId(ofertaEntity.getId())
                    .setLiczbaSztuk(ofertaEntity.getLiczbaSztuk())
                    .setTerminZlozenia(ofertaEntity.getTerminZlozenia())
                    .setTypOferty(ofertaEntity.getTypOferty())
                    .setAukcja(aukcjaEntity)
                    .setKupujacy(kupujacyEntity);

            OfertaTO ofertaTO = new OfertaTO(builder);
            oferty.add(ofertaTO);
        }
        return oferty;
    }

    @Override
    public LicytacjaWOsobachISztukach getKupTerazISztuki(int idAukcji) {
        List<OfertaTO> wszystkieOferty =  findOfertyByAukcjaDoOfertKupna(idAukcji);
        LicytacjaWOsobachISztukach kupTerazWLiczbach = new LicytacjaWOsobachISztukach();
        String terminOdrzuceniaDefalt = new Timestamp(1970,01,01,01,00,01,0).toString();

        for (OfertaTO ofertaTO : wszystkieOferty) {
            if(ofertaTO.getTypOferty() == Constants.KUP_TERAZ) {
                if(null == ofertaTO.getTerminOdrzucenia() || ofertaTO.getTerminOdrzucenia().equals(terminOdrzuceniaDefalt)){
                    kupTerazWLiczbach.setIloscOsob(kupTerazWLiczbach.getIloscOsob() + 1);
                    kupTerazWLiczbach.setIloscSztuk(kupTerazWLiczbach.getIloscSztuk() + ofertaTO.getLiczbaSztuk());
                }
            }
        }
        kupTerazWLiczbach.sprawdzOdmianeOsobDlaKupTeraz();
        kupTerazWLiczbach.sprawdzOdmianeSztukDlaKupTeraz();
        return kupTerazWLiczbach;
    }

    @Override
    public LicytacjaWOsobachISztukach getLicytacja(int idAukcji) {
        List<OfertaTO> wszystkieOferty =  findOfertyByAukcjaDoOfertKupna(idAukcji);
        LicytacjaWOsobachISztukach licytacjaWLiczbach = new LicytacjaWOsobachISztukach();

        for (OfertaTO ofertaTO : wszystkieOferty) {
            if(ofertaTO.getTypOferty() == Constants.LICYTACJA) {
                licytacjaWLiczbach.setIloscOsob(licytacjaWLiczbach.getIloscOsob() + 1);
            }
        }
        licytacjaWLiczbach.sprawdzOdmianeOsobDlaLicytacji();
        return licytacjaWLiczbach;
    }

    @Override
    public void dodajOferte(OfertaEntity ofertaEntity, AukcjaEntity aukcjaEntity, UzytkownikEntity kupujacyEntity, int liczbaSztuk) {
        java.util.Date date= new java.util.Date();
        Timestamp terminZlozenia = new Timestamp(date.getTime());

        ofertaEntity.setAukcja(aukcjaEntity);
        ofertaEntity.setKupujacy(kupujacyEntity);
        ofertaEntity.setLiczbaSztuk(liczbaSztuk);
        ofertaEntity.setTerminZlozenia(terminZlozenia);
        ofertaEntity.setTypOferty(Constants.KUP_TERAZ);

        ofertaDAO.dodajOferte(ofertaEntity);
    }
}
