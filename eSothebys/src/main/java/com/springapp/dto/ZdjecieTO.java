package com.springapp.dto;

import com.springapp.builder.ZdjecieBuilder;

/**
 * Created by Alicja on 2015-01-26.
 */
public class ZdjecieTO {

    private int id;
    private String opis;
    private String attribute;

    public ZdjecieTO(ZdjecieBuilder builder) {
        this.id = builder.getId();
        this.opis = builder.getOpis();
        this.attribute = builder.getAttribute();
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
}
