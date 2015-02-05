package com.springapp.dao;

import com.springapp.model.DanedowysylkiEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Alicja on 2015-02-05.
 */
@Repository
public class DaneDoWysylkiDAOImpl implements DaneDoWysylkiDAO {

    private static final String SELECT_DANE_DO_WYSYLKI_BY_ID = "select d from DanedowysylkiEntity d where d.id = :id_danych";

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public DanedowysylkiEntity getDaneDoWysylkiById(int idDane) {
        List<DanedowysylkiEntity> danedowysylki = entityManager.createQuery(SELECT_DANE_DO_WYSYLKI_BY_ID)
                .setParameter("id_danych", idDane).setMaxResults(1).getResultList();
        if (danedowysylki.isEmpty()) {
            return null;
        }
        return danedowysylki.get(0);
    }
}
