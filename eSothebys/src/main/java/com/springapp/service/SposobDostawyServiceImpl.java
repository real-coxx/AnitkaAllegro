package com.springapp.service;

import com.springapp.builder.SposobDostawyBuilder;
import com.springapp.dao.SposobDostawyDAO;
import com.springapp.dto.SposobDostawyTO;
import com.springapp.model.SposobdostawyEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Alicja on 2015-02-01.
 */
@Service
public class SposobDostawyServiceImpl implements SposobDostawyService {

    @Autowired
    SposobDostawyDAO sposobDostawyDAO;

    @Override
    public SposobDostawyTO getSposobDostawyById(int idSposobDostawy) {

        SposobdostawyEntity sposobdostawyEntity = sposobDostawyDAO.getSposobDostawyById(idSposobDostawy);

        SposobDostawyBuilder builder = new SposobDostawyBuilder();
        builder.setNazwa(sposobdostawyEntity.getNazwa())
                .setCzasDostawy(sposobdostawyEntity.getCzasDostawy())
                .setRodzajPlatnosci(sposobdostawyEntity.getRodzajPlatnosci());

        SposobDostawyTO sposobDostawyTO = new SposobDostawyTO(builder);

        return sposobDostawyTO;
    }
}
