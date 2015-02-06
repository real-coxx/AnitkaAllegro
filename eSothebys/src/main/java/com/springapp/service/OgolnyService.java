package com.springapp.service;

import com.springapp.dto.AukcjaTO;
import com.springapp.dto.UzytkownikTO;

/**
 * Created by Alicja on 2015-02-06.
 */
public interface OgolnyService {

    public void potwierdzKupno(AukcjaTO aukcjaTO, UzytkownikTO kupujacy, int liczbaSztuk);
    public void zwiekszLiczbeOdwiedzin(int idAukcji);
}
