package com.springapp.dao.specificDAO;

import com.springapp.model.CennikdostawEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Internet on 2015-02-05.
 */
@Repository
public class CennikDostawyDAOImpl implements CennikDostawyDAO {

    private static final String SELECT_CENNIK_DOSTAWY_BY_ID = "select c from CennikdostawEntity c where c.id = :id_cennikaDostaw";


    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public CennikdostawEntity getCennikDostawyById(int idCennikDostawy) {
        List<CennikdostawEntity> cennikDostawy = entityManager.createQuery(SELECT_CENNIK_DOSTAWY_BY_ID).setParameter("id_cennikaDostaw", idCennikDostawy).setMaxResults(1).getResultList();
        if (cennikDostawy.isEmpty()) {
            return null;
        }
        return cennikDostawy.get(0);
    }

}
