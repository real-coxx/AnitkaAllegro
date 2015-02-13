package com.springapp.service;

import com.springapp.dto.KrajTO;
import com.springapp.model.KrajEntity;

import java.util.List;

/**
 * Created by Alicja on 2015-01-05.
 */
public interface KrajService {
    public List<KrajEntity> getKraje();

    public List<KrajEntity> getKrajeBezWojewodztw();

    boolean czyKrajMaWojewodztwa(long krajId);
}
