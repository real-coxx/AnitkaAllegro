package com.springapp.dao.specificDAO;

import com.springapp.model.ZdjecieEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Alicja on 2015-01-26.
 */
@Repository
public class ZdjecieDAOImpl implements ZdjecieDAO{

    @PersistenceContext
    private EntityManager entityManager;

    private static final String SELECT_ZDJECIE_BY_ID = "select z from ZdjecieEntity z where z.id = :id_zdjecia";

    @Override
    public ZdjecieEntity getZdjecieByID(int idZdjecia) {
        List<ZdjecieEntity> zdjecie = entityManager.createQuery(SELECT_ZDJECIE_BY_ID).setParameter("id_zdjecia", idZdjecia).setMaxResults(1).getResultList();
        if (zdjecie.isEmpty()) {
            return null;
        }
        return zdjecie.get(0);
    }
}
