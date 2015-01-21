package com.springapp.dao;

import com.springapp.model.KategoriaEntity;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Alicja on 2015-01-21.
 */

@Service
public class KategoriaDAOImpl implements KategoriaDAO {

    private static final String SELECT_KATEGORIA_BY_ID = "select k from KategoriaEntity k where k.id = :id_kategorii";

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public KategoriaEntity getKategoriaById(int idKategorii) {
        List<KategoriaEntity> kategoria = entityManager.createQuery(SELECT_KATEGORIA_BY_ID).setParameter("id_kategorii", idKategorii).setMaxResults(1).getResultList();
        if (kategoria.isEmpty()) {
            return null;
        }
        return kategoria.get(0);
    }
}
