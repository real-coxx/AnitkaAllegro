package com.springapp.service;

import com.springapp.builder.AdresBuilder;
import com.springapp.dao.AdresDAO;
import com.springapp.dao.KrajDAO;
import com.springapp.dto.AdresTO;
import com.springapp.model.AdresEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Alicja on 2015-02-02.
 */
@Service
public class AdresServiceImpl implements AdresService {

    @Autowired
    AdresDAO adresDAO;

    @Autowired
    KrajDAO krajDAO;

    @Override
    public AdresTO getAdresDoWysylkiByIdUzytkownika(int idUzytkownika, int adresZamieszkaniaId) {
        AdresEntity entity = adresDAO.getAdresDoWysylkiByIdUzytkownika(idUzytkownika, adresZamieszkaniaId);

//        AdresBuilder builder = new AdresBuilder();
//        builder.setId(entity.getId())
//                .setUlicaZNumerem(entity.getUlicaZNumerem())
//                .setKodPocztow(entity.getKodPocztow())
//                .setMiejscowosc(entity.getMiejscowosc())
////                .setKraj(krajDAO.getKrajById(entity))
//                .setUzytkownik2ID(entity.getUzytkownik2ID());
//
//        AdresTO adresTO = new AdresTO(builder);
//        return adresTO;
        return null;
    }
}
