package com.springapp.service;

import com.springapp.builder.KategoriaBuilder;
import com.springapp.dao.KategoriaDAO;
import com.springapp.dto.KategoriaTO;
import com.springapp.helpers.Constants;
import com.springapp.model.KategoriaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alicja on 2015-01-21.
 */

@Service
public class KategoriaServiceImpl implements KategoriaService {

    @Autowired
    KategoriaDAO kategoriaDAO;

    @Override
    public KategoriaTO getKategoriaById(int idKategorii) {
        KategoriaEntity kategoriaEntity = kategoriaDAO.getKategoriaById(idKategorii);

        KategoriaBuilder builder = new KategoriaBuilder();
        builder.setNazwa(kategoriaEntity.getNazwa())
                .setNadrzedna(kategoriaEntity);

        KategoriaTO kategoriaTO = new KategoriaTO(builder);
        return kategoriaTO;
    }

    @Override
    public List<String> getNazwyNadkategorii(int idKategorii) {
        KategoriaEntity kategoriaEntity = kategoriaDAO.getKategoriaById(idKategorii);
        KategoriaEntity biezacaNadkategoria;
        int idBiezacejNadkategorii = kategoriaEntity.getNadrzedna().getId();
        List<String> kategoriaTOList = new ArrayList<String>();

        if (idBiezacejNadkategorii != Constants.ID_GLOWNEJ_NADKATEGORII)
        {
            while (true) {
                biezacaNadkategoria = kategoriaDAO.getKategoriaById(idBiezacejNadkategorii);
                kategoriaTOList.add(biezacaNadkategoria.getNazwa());
                idBiezacejNadkategorii = biezacaNadkategoria.getNadrzedna().getId();
                if (idBiezacejNadkategorii == Constants.ID_GLOWNEJ_NADKATEGORII)
                {
                    break;
                }
            }
        }
        return kategoriaTOList;
    }
}
