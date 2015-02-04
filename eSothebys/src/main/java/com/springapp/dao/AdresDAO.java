package com.springapp.dao;

import com.springapp.model.AdresEntity;

/**
 * Created by Alicja on 2015-02-02.
 */
public interface AdresDAO {

    public AdresEntity getAdresByUzytkownikId(int idUzytkownika);
}
