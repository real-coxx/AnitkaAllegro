package com.springapp.dao;

import com.springapp.model.SzczegolydostawyEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Alicja on 2015-02-01.
 */
@Repository
public class SzczegolyDostawyDAOImpl implements SzczegolyDostawyDAO {

    private static final String SELECT_SZCZEGOLY_DOSTAWY_BY_CENNIK = "select sd from SzczegolydostawyEntity sd where sd.cennikDostaw.id = :id_cennik_dostaw";

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<SzczegolydostawyEntity> getSzczegolyDostawyByCennik(int idCennikDostaw) {
        List<SzczegolydostawyEntity> szczegolyDostawy = entityManager.createQuery(SELECT_SZCZEGOLY_DOSTAWY_BY_CENNIK).setParameter("id_cennik_dostaw", idCennikDostaw).getResultList();

        return szczegolyDostawy;
    }
}
