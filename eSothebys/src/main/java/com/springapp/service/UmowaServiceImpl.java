package com.springapp.service;

import com.springapp.dao.UmowaDAO;
import com.springapp.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Alicja on 2015-02-06.
 */
@Service
public class UmowaServiceImpl implements UmowaService {

    @Autowired
    UmowaDAO umowaDAO;

    @Override
    public void dodajUmowe(UmowaEntity umowaEntity, AukcjaEntity aukcjaEntity, UzytkownikEntity kupujacyEntity,
                           OfertaEntity ofertaEntity, int liczbaSztuk, DanedowysylkiEntity danedowysylkiEntity) {
        umowaEntity.setAukcja(aukcjaEntity);
        umowaEntity.setSprzedajacy(aukcjaEntity.getSprzedawca());
        umowaEntity.setKupujacy(kupujacyEntity);
        umowaEntity.setZwyciezkaOferta(ofertaEntity);
        umowaEntity.setLiczbaSztuk(liczbaSztuk);
        umowaEntity.setProwizja(10.25);
        umowaEntity.setDaneDoWysylki(danedowysylkiEntity);

        umowaDAO.dodajUmowe(umowaEntity);
    }
}
