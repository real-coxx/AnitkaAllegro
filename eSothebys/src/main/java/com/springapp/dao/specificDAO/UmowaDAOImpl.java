package com.springapp.dao.specificDAO;

import com.springapp.model.UmowaEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Alicja on 2015-02-06.
 */
@Repository
public class UmowaDAOImpl implements UmowaDAO {

    private static final String SELECT_UMOWA_BY_ID = "select u from UmowaEntity u where u.id = :id_umowy";

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public UmowaEntity getUmowaById(int idUmowy) {
        List<UmowaEntity> umowa = entityManager.createQuery(SELECT_UMOWA_BY_ID).setParameter("id_umowy", idUmowy).setMaxResults(1).getResultList();
        if (umowa.isEmpty()) {
            return null;
        }
        return umowa.get(0);
    }

    @Override
    public void dodajUmowe(UmowaEntity umowaEntity) {
        entityManager.persist(umowaEntity);
    }
}
