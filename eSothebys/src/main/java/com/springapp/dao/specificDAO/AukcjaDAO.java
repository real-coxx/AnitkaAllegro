package com.springapp.dao.specificDAO;

import com.springapp.dao.abstractDAO.AbstractDAO;
import com.springapp.model.AukcjaEntity;

/**
 * Created by Alicja on 2015-01-19.
 */
public interface AukcjaDAO extends AbstractDAO<AukcjaEntity, Long> {

    public AukcjaEntity getAukcjaById(int idAukcji);

    public void addAukcja(AukcjaEntity aukcja);
}
