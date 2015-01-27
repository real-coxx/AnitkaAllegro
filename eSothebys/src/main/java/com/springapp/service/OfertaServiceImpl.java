package com.springapp.service;

import com.springapp.builder.AukcjaBuilder;
import com.springapp.builder.OfertaBuilder;
import com.springapp.dao.AukcjaDAO;
import com.springapp.dao.OfertaDAO;
import com.springapp.dao.UzytkownikDAO;
import com.springapp.dto.AukcjaTO;
import com.springapp.dto.OfertaTO;
import com.springapp.helpers.Constants;
import com.springapp.helpers.LicytacjaWOsobachISztukach;
import com.springapp.model.AukcjaEntity;
import com.springapp.model.OfertaEntity;
import com.springapp.model.UzytkownikEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    @Override
    public OfertaTO getOfertaByIdDoOfertKupna(int idOferty) {
        OfertaEntity ofertaEntity = ofertaDAO.getOfertaById(idOferty);
        AukcjaEntity aukcjaEntity = aukcjaDAO.getAukcjaById(ofertaEntity.getAukcja());
        UzytkownikEntity uzytkownikEntity = uzytkownikDAO.getUzytkownikById(ofertaEntity.getUzytkownik());

        AukcjaBuilder aukcjaBuilder = new AukcjaBuilder();
        aukcjaBuilder.setId(aukcjaEntity.getId())
                .setCenaKupTeraz(aukcjaEntity.getCenaKupTeraz());

        AukcjaTO aukcjaTO = new AukcjaTO(aukcjaBuilder);

        OfertaBuilder builder = new OfertaBuilder();
        builder.setId(ofertaEntity.getId())
                .setAukcja(aukcjaTO)
                .setUzytkownik(uzytkownikEntity);

        OfertaTO ofertaTO = new OfertaTO(builder);
        return ofertaTO;
    }

    @Override
    public List<OfertaTO> findOfertyByAukcjaDoOfertKupna(int idAukcji) {
        List<OfertaEntity> ofertaEntities = ofertaDAO.findOfertyByAukcja(idAukcji);
        List<OfertaTO> oferty = new ArrayList<OfertaTO>();

        for (OfertaEntity ofertaEntity : ofertaEntities) {

            AukcjaEntity aukcjaEntity = aukcjaDAO.getAukcjaById(ofertaEntity.getAukcja());
            UzytkownikEntity uzytkownikEntity = uzytkownikDAO.getUzytkownikById(ofertaEntity.getUzytkownik());

            AukcjaBuilder aukcjaBuilder = new AukcjaBuilder();
            aukcjaBuilder.setId(aukcjaEntity.getId())
                    .setCenaKupTeraz(aukcjaEntity.getCenaKupTeraz());
            AukcjaTO aukcjaTO = new AukcjaTO(aukcjaBuilder);

            String logigKupujacego = uzytkownikEntity.getLogin();
            String zamaskowanyUzytkownik = logigKupujacego.charAt(0)+"..."+logigKupujacego.charAt(logigKupujacego.length()-1);
            uzytkownikEntity.setLogin(zamaskowanyUzytkownik);

            OfertaBuilder builder = new OfertaBuilder();
            builder.setId(ofertaEntity.getId())
                    .setLiczbaSztuk(ofertaEntity.getLiczbaSztuk())
                    .setTerminZlozenia(ofertaEntity.getTerminZlozenia())
                    .setTypOferty(ofertaEntity.getTypOferty())
                    .setAukcja(aukcjaTO)
                    .setUzytkownik(uzytkownikEntity);

            OfertaTO ofertaTO = new OfertaTO(builder);
            oferty.add(ofertaTO);
        }
        return oferty;
    }

    @Override
    public LicytacjaWOsobachISztukach getKupTerazISztuki(int idAukcji) {
        List<OfertaTO> wszystkieOferty =  findOfertyByAukcjaDoOfertKupna(idAukcji);
        LicytacjaWOsobachISztukach kupTerazWLiczbach = new LicytacjaWOsobachISztukach();

        for (OfertaTO ofertaTO : wszystkieOferty) {
            if(ofertaTO.getTypOferty() == Constants.KUP_TERAZ) {
                kupTerazWLiczbach.setIloscOsob(kupTerazWLiczbach.getIloscOsob() + 1);
                kupTerazWLiczbach.setIloscSztuk(kupTerazWLiczbach.getIloscSztuk() + ofertaTO.getLiczbaSztuk());
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
}
