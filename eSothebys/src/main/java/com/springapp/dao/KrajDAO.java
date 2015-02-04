package com.springapp.dao;

import com.springapp.model.KrajEntity;

import java.util.List;

/**
 * Created by Alicja on 2015-01-05.
 */
public interface KrajDAO {
    public List<KrajEntity> getKraje();

    public KrajEntity getKrajById(int idKraju);
}
