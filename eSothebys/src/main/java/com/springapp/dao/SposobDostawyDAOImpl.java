package com.springapp.dao;

import com.springapp.model.SposobdostawyEntity;
import com.springapp.model.UzytkownikEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Alicja on 2015-02-01.
 */
@Repository
public class SposobDostawyDAOImpl implements SposobDostawyDAO {

    private static final String SELECT_SPOSOB_DOSTAWY_BY_ID = "select sd from SposobdostawyEntity sd where sd.id = :id_sposobu_dostawy";

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public SposobdostawyEntity getSposobDostawyById(int idSposobDostawy) {
        List<SposobdostawyEntity> sposobDostawy = entityManager.createQuery(SELECT_SPOSOB_DOSTAWY_BY_ID).setParameter("id_sposobu_dostawy", idSposobDostawy).setMaxResults(1).getResultList();
        if (sposobDostawy.isEmpty()) {
            return null;
        }
        return sposobDostawy.get(0);
    }
}
