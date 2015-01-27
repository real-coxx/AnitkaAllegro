package com.springapp.dao;

import com.springapp.model.OfertaEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Alicja on 2015-01-22.
 */
@Repository
public class OfertaDAOImpl implements OfertaDAO {

    private static final String SELECT_OFERTA_BY_ID = "select o from OfertaEntity o where o.id = :id_oferty";
    private static final String SELECT_OFERTA_BY_AUKCJA = "select o from OfertaEntity o where o.aukcja = :id_aukcji";

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public OfertaEntity getOfertaById(int idOferty) {
        List<OfertaEntity> oferta = entityManager.createQuery(SELECT_OFERTA_BY_ID).setParameter("id_oferty", idOferty).setMaxResults(1).getResultList();
        if (oferta.isEmpty()) {
            return null;
        }
        return oferta.get(0);
    }

    @Override
    public List<OfertaEntity> findOfertyByAukcja(int idAukcji) {
        List<OfertaEntity> oferty = entityManager.createQuery(SELECT_OFERTA_BY_AUKCJA).setParameter("id_aukcji", idAukcji).getResultList();
        if (oferty.isEmpty()) {
            return null;
        }
        return oferty;
    }
}
