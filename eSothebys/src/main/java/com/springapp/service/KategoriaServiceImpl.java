package com.springapp.service;

import com.springapp.builder.KategoriaBuilder;
import com.springapp.dao.KategoriaDAO;
import com.springapp.dto.KategoriaTO;
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
                .setKategoria2ID(kategoriaEntity.getKategoria2ID());

        KategoriaTO kategoriaTO = new KategoriaTO(builder);
        return kategoriaTO;
    }

    @Override
    public List<String> getNazwyNadkategorii(int idKategorii) {
        KategoriaEntity kategoriaEntity = kategoriaDAO.getKategoriaById(idKategorii);
        KategoriaEntity biezacaNadkategoria;
        int idBiezacejNadkategorii = kategoriaEntity.getKategoria2ID();
        List<String> kategoriaTOList = new ArrayList<String>();

        if (idBiezacejNadkategorii != 0)
        {
            return kategoriaTOList;
        }
        boolean czyMaNadkategorie = true;

        while (czyMaNadkategorie) {
            biezacaNadkategoria = kategoriaDAO.getKategoriaById(idKategorii);
            kategoriaTOList.add(biezacaNadkategoria.getNazwa());
            idBiezacejNadkategorii = biezacaNadkategoria.getKategoria2ID();
            if (idBiezacejNadkategorii != 0)
            {
                break;
            }
        }
        return kategoriaTOList;
    }
}
