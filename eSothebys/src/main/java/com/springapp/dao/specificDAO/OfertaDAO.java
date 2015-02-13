package com.springapp.dao.specificDAO;

import com.springapp.model.OfertaEntity;

import java.util.List;

/**
 * Created by Alicja on 2015-01-22.
 */
public interface OfertaDAO {

    public OfertaEntity getOfertaById(int idOferty);

    public List<OfertaEntity> findOfertyByAukcja(int idAukcji);

    public void dodajOferte(OfertaEntity ofertaEntity);
}
