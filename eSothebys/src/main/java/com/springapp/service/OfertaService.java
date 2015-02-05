package com.springapp.service;

import com.springapp.dto.AukcjaTO;
import com.springapp.dto.OfertaTO;
import com.springapp.dto.UzytkownikTO;
import com.springapp.helpers.LicytacjaWOsobachISztukach;
import com.springapp.model.OfertaEntity;

import java.util.List;

/**
 * Created by Alicja on 2015-01-22.
 */
public interface OfertaService {

    public OfertaTO getOfertaByIdDoOfertKupna(int idOferty);

    public List<OfertaTO> findOfertyByAukcjaDoOfertKupna(int idAukcji);

    public LicytacjaWOsobachISztukach getKupTerazISztuki(int idAukcji);

    public LicytacjaWOsobachISztukach getLicytacja(int idAukcji);

    public void dodajOferte(AukcjaTO aukcjaTO, int liczbaSztuk, UzytkownikTO kupujacy);
}
