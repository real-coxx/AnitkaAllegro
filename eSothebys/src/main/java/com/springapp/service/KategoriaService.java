package com.springapp.service;

import com.springapp.dto.KategoriaTO;
import com.springapp.model.KategoriaEntity;

import java.util.List;

/**
 * Created by Alicja on 2015-01-21.
 */
public interface KategoriaService {

    public KategoriaTO getKategoriaById(int idKategorii);

    public List<String> getNazwyNadkategorii(int idKategorii);
}
