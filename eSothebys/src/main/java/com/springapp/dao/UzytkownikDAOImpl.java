package com.springapp.dao;

import com.springapp.model.UzytkownikEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Alicja on 2015-01-22.
 */
@Repository
public class UzytkownikDAOImpl implements UzytkownikDAO {

    private static final String SELECT_UZYTKOWNIK_BY_ID = "select u from UzytkownikEntity u where u.id = :id_uzytkownika";

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public UzytkownikEntity getUzytkownikById(int idUzytkownika) {
        List<UzytkownikEntity> uzyttkownik= entityManager.createQuery(SELECT_UZYTKOWNIK_BY_ID).setParameter("id_uzytkownika", idUzytkownika).setMaxResults(1).getResultList();
        if (uzyttkownik.isEmpty()) {
            return null;
        }
        return uzyttkownik.get(0);
    }
}
