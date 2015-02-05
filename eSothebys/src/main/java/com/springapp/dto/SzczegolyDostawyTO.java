package com.springapp.dto;

import com.springapp.builder.SzczegolyDostawyBuilder;
import com.springapp.model.CennikdostawEntity;
import com.springapp.model.SposobdostawyEntity;

/**
 * Created by Alicja on 2015-02-01.
 */
public class SzczegolyDostawyTO {

    private int id;
    private Double kosztPierwszejSztuki;
    private Double kosztKolejnejSztuki;
    private Integer liczbaWPaczce;
    private SposobdostawyEntity sposobDostawy;
    private CennikdostawEntity cennikDostaw;

    public SzczegolyDostawyTO(SzczegolyDostawyBuilder builder) {
        this.id = builder.getId();
        this.kosztPierwszejSztuki = builder.getKosztPierwszejSztuki();
        this.kosztKolejnejSztuki = builder.getKosztKolejnejSztuki();
        this.liczbaWPaczce = builder.getLiczbaWPaczce();
        this.sposobDostawy = builder.getSposobDostawy();
        this.cennikDostaw = builder.getCennikDostaw();
    }

    public int getId() {
        return id;
    }

    public Double getKosztPierwszejSztuki() {
        return kosztPierwszejSztuki;
    }

    public Double getKosztKolejnejSztuki() {
        return kosztKolejnejSztuki;
    }

    public Integer getLiczbaWPaczce() {
        return liczbaWPaczce;
    }

    public SposobdostawyEntity getSposobDostawy() {
        return sposobDostawy;
    }
    public CennikdostawEntity getCennikDostaw() {
        return cennikDostaw;
    }
}
