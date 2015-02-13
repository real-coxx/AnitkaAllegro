package com.springapp.dao;

import com.springapp.model.DanedowysylkiEntity;
import com.springapp.model.UzytkownikEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Alicja on 2015-02-05.
 */
@Repository
public class DaneDoWysylkiDAOImpl implements DaneDoWysylkiDAO {

    private static final String SELECT_DANE_DO_WYSYLKI_BY_ID = "select d from DanedowysylkiEntity d where d.id = :id_danych";
    private static final String SELECT_DANE_O_INNYM_ADRESIE_NIZ_ZAMIESZKANIA =
            "select d from DanedowysylkiEntity d where d.uzytkownik.id = :id_uzytkownika and d.adresDoWysylki != d.uzytkownik.adres";
    private static final String UPDATE_DANE = "update DanedowysylkiEntity d set d.imie = :imie, d.nazwisko = :nazwisko " +
            ", d.firma = :firma where d.id = :id_dane_do_wysylki";

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public DanedowysylkiEntity getDaneDoWysylkiById(int idDane) {
        List<DanedowysylkiEntity> danedowysylki = entityManager.createQuery(SELECT_DANE_DO_WYSYLKI_BY_ID)
                .setParameter("id_danych", idDane).setMaxResults(1).getResultList();
        if (danedowysylki.isEmpty()) {
            return null;
        }
        return danedowysylki.get(0);
    }

    @Override
    public DanedowysylkiEntity getDaneOInnymAdresieNizZamieszkania(UzytkownikEntity uzytkownik) {
        List<DanedowysylkiEntity> danedowysylki = entityManager.createQuery(SELECT_DANE_O_INNYM_ADRESIE_NIZ_ZAMIESZKANIA)
                .setParameter("id_uzytkownika", uzytkownik.getId()).setMaxResults(1).getResultList();
        if (danedowysylki.isEmpty()) {
            return null;
        }
        return danedowysylki.get(0);
    }

    @Override
    public void modyfikujDaneDoWysylki(String imie, String nazwisko, String firma, int daneDoWysylkiId) {
        entityManager.createQuery(UPDATE_DANE)
                .setParameter("imie", imie)
                .setParameter("nazwisko", nazwisko)
                .setParameter("firma", firma)
                .setParameter("id_dane_do_wysylki", daneDoWysylkiId)
                .executeUpdate();
    }
}
