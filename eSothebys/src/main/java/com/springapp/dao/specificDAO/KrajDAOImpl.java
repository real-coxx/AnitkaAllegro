package com.springapp.dao.specificDAO;

import com.springapp.model.KrajEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by Alicja on 2015-01-05.
 */
@Repository
public final class KrajDAOImpl implements KrajDAO{

    private static final String SELECT_QUERY = "select k from KrajEntity k";

    private static final String SELECT_KRAJ_BY_ID = "select k from KrajEntity k where k.id = :id_kraju";

    private static final String SELECT_KRAJ_BY_NAZWA = "select k from KrajEntity k where k.nazwa = :nazwa_kraju";

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<KrajEntity> getKraje() {
        Query query = entityManager.createQuery(SELECT_QUERY);
        List<KrajEntity> kraje = (List<KrajEntity>) query.getResultList();
        return kraje;
    }

    @Override
    public KrajEntity getKrajById(int idKraju) {
        List<KrajEntity> kraj = entityManager.createQuery(SELECT_KRAJ_BY_ID).setParameter("id_kraju", idKraju).setMaxResults(1).getResultList();
        if (kraj.isEmpty()) {
            return null;
        }
        return kraj.get(0);
    }

    @Override
    public KrajEntity getKrajByNazwa(String nazwaKraju) {
        List<KrajEntity> kraj = entityManager.createQuery(SELECT_KRAJ_BY_NAZWA).setParameter("nazwa_kraju", nazwaKraju).setMaxResults(1).getResultList();
        if (kraj.isEmpty()) {
            return null;
        }
        return kraj.get(0);
    }
}
