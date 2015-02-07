package com.springapp.dao;

import com.springapp.model.AdresEntity;
import com.springapp.model.DanedowysylkiEntity;

/**
 * Created by Alicja on 2015-02-02.
 */
public interface AdresDAO {

    public AdresEntity getAdresDoWysylkiByIdUzytkownika(int idUzytkownika, int adresZamieszkaniaId);
    public void modyfikujAdres(DanedowysylkiEntity danedowysylkiEntity, String ulica, String kod, String miejscowosc, int adresId);
}
