package com.springapp.service;

import com.springapp.dao.specificDAO.KrajDAO;
import com.springapp.model.KrajEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Alicja on 2015-01-05.
 */
@Service
public class KrajServiceImpl implements KrajService{

    @Autowired
    private KrajDAO krajDAO;

    @Transactional
    public List<KrajEntity> getKraje() {
        return krajDAO.getKraje();
    }

    @Override
    public List<KrajEntity> getKrajeBezWojewodztw() {
        return null;
    }

    @Override
    public boolean czyKrajMaWojewodztwa(long krajId) {
        return false;
    }
}
