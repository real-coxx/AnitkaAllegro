package com.springapp.service;

import com.springapp.dto.AukcjaTO;
import com.springapp.dto.UzytkownikTO;

import java.io.IOException;

/**
 * Created by Alicja on 2015-02-06.
 */
public interface OgolnyService {

    public void potwierdzKupno(AukcjaTO aukcjaTO, UzytkownikTO kupujacy, int liczbaSztuk,String imie, String nazwisko, String ulica, String kod,
                               String miejscowosc, String kraj, String firma, String telefon, String cenaCalkowita, String wiadomosc) throws IOException;
    public void zwiekszLiczbeOdwiedzin(int idAukcji);
}
