package com.springapp.service;

import com.springapp.builder.ZdjecieBuilder;
import com.springapp.dao.specificDAO.ZdjecieDAO;
import com.springapp.dto.ZdjecieTO;
import com.springapp.model.ZdjecieEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Alicja on 2015-01-26.
 */
@Service
public class ZdjecieServiceImpl implements ZdjecieService {

    @Autowired
    ZdjecieDAO zdjecieDAO;

    @Override
    public ZdjecieTO getZdjecieById(int idZdjecia) {
        ZdjecieEntity zdjecieEntity = zdjecieDAO.getZdjecieByID(idZdjecia);

        ZdjecieBuilder builder = new ZdjecieBuilder();
        builder.setId(zdjecieEntity.getId())
                .setAttribute(zdjecieEntity.getAttribute());

        ZdjecieTO zdjecieTO = new ZdjecieTO(builder);
        return zdjecieTO;
    }
}
