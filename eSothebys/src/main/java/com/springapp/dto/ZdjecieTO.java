package com.springapp.dto;

import com.springapp.builder.ZdjecieBuilder;
import com.springapp.model.AukcjaEntity;

/**
 * Created by Alicja on 2015-01-26.
 */
public class ZdjecieTO {

    private int id;
    private String opis;
    private String attribute;
    private AukcjaEntity aukcja;

    public ZdjecieTO(ZdjecieBuilder builder) {
        this.id = builder.getId();
        this.opis = builder.getOpis();
        this.attribute = builder.getAttribute();
        this.aukcja = builder.getAukcja();
    }

    public int getId() {
        return id;
    }

    public String getOpis() {
        return opis;
    }

    public String getAttribute() {
        return attribute;
    }
    public AukcjaEntity getAukcja() {
        return aukcja;
    }
}
