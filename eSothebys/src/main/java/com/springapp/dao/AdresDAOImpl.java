package com.springapp.dao;

import com.springapp.model.AdresEntity;
import com.springapp.model.AukcjaEntity;
import com.springapp.model.DanedowysylkiEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Alicja on 2015-02-02.
 */

@Repository
public class AdresDAOImpl implements AdresDAO {

    private static final String SELECT_ADRES_BY_UZYTKOWNIK_ID = "select a from AdresEntity a " +
            "where a.uzytkownik2ID = :id_uzytkownika and a.id != :id_adres_zamieszkania";
    private static final String UPDATE_ADRES = "update AdresEntity a set a.ulicaZNumerem = :ulica " +
            ", a.kodPocztow = :kod, a.miejscowosc = :miejscowosc where a.id = :id_adres";

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public AdresEntity getAdresDoWysylkiByIdUzytkownika(int idUzytkownika, int adresZamieszkaniaId) {
        List<AdresEntity> adres = entityManager.createQuery(SELECT_ADRES_BY_UZYTKOWNIK_ID)
                .setParameter("id_uzytkownika", idUzytkownika)
                .setParameter("id_adres_zamieszkania", adresZamieszkaniaId)
                .setMaxResults(1).getResultList();
        if (adres.isEmpty()) {
            return null;
        }
        return adres.get(0);
    }

    @Override
    public void modyfikujAdres(DanedowysylkiEntity danedowysylkiEntity, String ulica, String kod, String miejscowosc, int adresId) {
        entityManager.createQuery(UPDATE_ADRES)
                .setParameter("ulica", ulica)
                .setParameter("kod", kod)
                .setParameter("miejscowosc", miejscowosc)
                .setParameter("id_adres", adresId)
                .executeUpdate();
    }
}
