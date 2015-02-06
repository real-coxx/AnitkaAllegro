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
    private static final String UPDATE_AUKCJA_PO_KUPNIE = "update AukcjaEntity a set a.liczbaDostepnychPrzedmiotow" +
            " = a.liczbaDostepnychPrzedmiotow - :ilosc_sztuk where a.id = :id_aukcji";
    private static final String UPDATE_STAN_AUKCJI = "update AukcjaEntity a set a.stan = :stan_aukcji " +
            "where a.id = :id_aukcji";
    private static final String UPDATE_LICZBA_ODWIEDZIN = "update AukcjaEntity a set a.liczbaOdwiedzin = a.liczbaOdwiedzin + 1 " +
            "where a.id = :id_aukcji";

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

    @Override
    public void modyfikujAukcjePoKupnie(AukcjaEntity aukcjaEntity, int liczbaSztuk) {
        entityManager.createQuery(UPDATE_AUKCJA_PO_KUPNIE)
                .setParameter("ilosc_sztuk", liczbaSztuk)
                .setParameter("id_aukcji", aukcjaEntity.getId())
                .executeUpdate();
    }

    @Override
    public void zmienStanAukcji(AukcjaEntity aukcjaEntity, String stan) {
        entityManager.createQuery(UPDATE_STAN_AUKCJI)
                .setParameter("stan_aukcji", stan)
                .setParameter("id_aukcji", aukcjaEntity.getId())
                .executeUpdate();
    }

    @Override
    public void zwiekszLiczbeOdwiedzin(int idAukcji) {
        entityManager.createQuery(UPDATE_LICZBA_ODWIEDZIN)
                .setParameter("id_aukcji", idAukcji)
                .executeUpdate();
    }
}
