package com.springapp.dao;

import com.springapp.model.AukcjaEntity;

/**
 * Created by Alicja on 2015-01-19.
 */
public interface AukcjaDAO {

    public AukcjaEntity getAukcjaById(int idAukcji);
    public void modyfikujAukcjePoKupnie(AukcjaEntity aukcjaEntity, int liczbaSztuk);
    public void zmienStanAukcji(AukcjaEntity aukcjaEntity, String stan);
    public void zwiekszLiczbeOdwiedzin(int idAukcji);

}