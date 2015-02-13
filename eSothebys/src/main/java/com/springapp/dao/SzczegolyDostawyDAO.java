package com.springapp.dao;

import com.springapp.model.SzczegolydostawyEntity;

import java.util.List;

/**
 * Created by Alicja on 2015-02-01.
 */
public interface SzczegolyDostawyDAO {

    public List<SzczegolydostawyEntity> getSzczegolyDostawyByCennik(int idCennikDostaw);
}
