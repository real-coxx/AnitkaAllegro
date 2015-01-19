package com.springapp.dao;

import com.springapp.model.AukcjaEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by Alicja on 2015-01-19.
 */
@Repository
public class AukcjaDAOImpl implements AukcjaDAO {

    private static final String SELECT_AUKCJA_BY_ID = "select a from AukcjaEntity a where a.id = :id_aukcji";

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public AukcjaEntity getAukcjaById(int idAukcji) {
        List<AukcjaEntity> aukcja = entityManager.createQuery(SELECT_AUKCJA_BY_ID).setParameter("id_aukcji", idAukcji).setMaxResults(1).getResultList();
        if (aukcja.isEmpty()) {
            return null;
        }
        return aukcja.get(0);
    }
}
