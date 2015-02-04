package com.springapp.dao;

import com.springapp.model.AdresEntity;
import com.springapp.model.AukcjaEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Alicja on 2015-02-02.
 */

@Repository
public class AdresDAOImpl implements AdresDAO {

    private static final String SELECT_ADRES_BY_UZYTKOWNIK_ID = "select a from AdresEntity a where a.uzytkownik2ID = :id_uzytkownika";

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public AdresEntity getAdresByUzytkownikId(int idUzytkownika) {
        List<AdresEntity> adres = entityManager.createQuery(SELECT_ADRES_BY_UZYTKOWNIK_ID).setParameter("id_uzytkownika", idUzytkownika).setMaxResults(1).getResultList();
        if (adres.isEmpty()) {
            return null;
        }
        return adres.get(0);
    }
}
