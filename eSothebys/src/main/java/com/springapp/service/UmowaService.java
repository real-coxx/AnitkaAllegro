package com.springapp.service;

import com.springapp.model.*;

/**
 * Created by Alicja on 2015-02-06.
 */
public interface UmowaService {

    public void dodajUmowe(UmowaEntity umowaEntity, AukcjaEntity aukcjaEntity, UzytkownikEntity kupujacyEntity,
                           OfertaEntity ofertaEntity, int liczbaSztuk, DanedowysylkiEntity danedowysylkiEntity);
}
