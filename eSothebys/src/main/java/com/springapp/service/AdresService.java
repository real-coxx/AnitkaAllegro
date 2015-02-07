package com.springapp.service;

import com.springapp.dto.AdresTO;

/**
 * Created by Alicja on 2015-02-02.
 */
public interface AdresService {

    public AdresTO getAdresDoWysylkiByIdUzytkownika(int idUzytkownika, int adresZamieszkaniaId);
}
