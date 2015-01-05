package com.springapp.dao;

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

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<KrajEntity> getKraje() {
        Query query = entityManager.createQuery(SELECT_QUERY);
        List<KrajEntity> kraje = (List<KrajEntity>) query.getResultList();
        return kraje;
    }
}
