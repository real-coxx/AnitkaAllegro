package com.springapp.builder;

import com.springapp.model.AukcjaEntity;

/**
 * Created by Alicja on 2015-01-26.
 */
public class ZdjecieBuilder {

    private int id;
    private String opis;
    private String attribute;
    private AukcjaEntity aukcja;

    public ZdjecieBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public ZdjecieBuilder setOpis(String opis) {
        this.opis = opis;
        return this;
    }

    public ZdjecieBuilder setAttribute(String attribute) {
        this.attribute = attribute;
        return this;
    }

    public ZdjecieBuilder setAukcja(AukcjaEntity aukcja) {
        this.aukcja = aukcja;
        return this;
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
