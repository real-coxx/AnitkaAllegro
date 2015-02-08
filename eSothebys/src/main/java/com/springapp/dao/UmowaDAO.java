package com.springapp.dao;

import com.springapp.model.UmowaEntity;

/**
 * Created by Alicja on 2015-02-06.
 */
public interface UmowaDAO {

    public UmowaEntity getUmowaById(int idUmowy);

    public void dodajUmowe(UmowaEntity umowaEntity);
}
