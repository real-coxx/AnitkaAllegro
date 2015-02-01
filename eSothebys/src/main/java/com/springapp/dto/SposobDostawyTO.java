package com.springapp.dto;

import com.springapp.builder.SposobDostawyBuilder;

/**
 * Created by Alicja on 2015-02-01.
 */
public class SposobDostawyTO {

    private int id;
    private String nazwa;
    private Integer czasDostawy;
    private String rodzajPlatnosci;
    private Boolean edytowalny;

    public SposobDostawyTO(SposobDostawyBuilder builder) {
        this.id = builder.getId();
        this.nazwa= builder.getNazwa();
        this.czasDostawy = builder.getCzasDostawy();
        this.rodzajPlatnosci = builder.getRodzajPlatnosci();
        this.edytowalny = builder.getEdytowalny();
    }

    public int getId() {
        return id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public Integer getCzasDostawy() {
        return czasDostawy;
    }

    public String getRodzajPlatnosci() {
        return rodzajPlatnosci;
    }

    public Boolean getEdytowalny() {
        return edytowalny;
    }
}
