package com.springapp.service;

import com.springapp.builder.UzytkownikBuilder;
import com.springapp.dao.UzytkownikDAO;
import com.springapp.dto.UzytkownikTO;
import com.springapp.model.UzytkownikEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Alicja on 2015-02-02.
 */
@Service
public class UzytkownikServiceImpl implements UzytkownikService {

    @Autowired
    UzytkownikDAO uzytkownikDAO;

    @Override
    public UzytkownikTO getUzytkownikById(int idUzytkownika) {
        UzytkownikEntity entity = uzytkownikDAO.getUzytkownikById(idUzytkownika);

        UzytkownikBuilder builder = new UzytkownikBuilder();
        builder.setId(entity.getId())
                .setImie(entity.getImie())
                .setNazwisko(entity.getNazwisko())
                .setEmail(entity.getEmail());

        UzytkownikTO uzytkownikTO = new UzytkownikTO(builder);
        return uzytkownikTO;
    }
}
