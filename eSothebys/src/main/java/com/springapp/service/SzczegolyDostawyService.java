package com.springapp.service;

import com.springapp.dto.SzczegolyDostawyTO;

import java.util.List;

/**
 * Created by Alicja on 2015-02-01.
 */
public interface SzczegolyDostawyService {

    public List<SzczegolyDostawyTO> getSzczegolyDostawyByCennikDostaw(int idCennikDostaw);
    public List<String> getMenuWyboruSposobuDostawy (int idCennikDostaw, int iloscSztuk);
}
