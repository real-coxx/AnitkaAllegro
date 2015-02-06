package com.springapp.service;

import com.springapp.dto.AukcjaTO;
import com.springapp.model.AukcjaEntity;

/**
 * Created by Alicja on 2015-01-19.
 */
public interface AukcjaService {

    public AukcjaTO getAukcjaByIdForSkladanieOferty(int idAukcji);

    public void modyfikujAukcjePoKupnie(AukcjaEntity aukcjaEntity, int liczbaSztuk);

    public void zwiekszLiczbeOdwiedzin(int idAukcji);
}
