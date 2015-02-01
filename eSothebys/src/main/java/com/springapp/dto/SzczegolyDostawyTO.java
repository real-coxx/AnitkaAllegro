package com.springapp.dto;

import com.springapp.builder.SzczegolyDostawyBuilder;

/**
 * Created by Alicja on 2015-02-01.
 */
public class SzczegolyDostawyTO {

    private int id;
    private Integer kosztPierwszejSztuki;
    private Integer kosztKolejnejSztuki;
    private Integer liczbaWPaczce;
    private Integer sposobDostawyID;
    private Integer cennikDostawID;
    private SposobDostawyTO sposobDostawyTO;

    public SzczegolyDostawyTO(SzczegolyDostawyBuilder builder) {
        this.id = builder.getId();
        this.kosztPierwszejSztuki = builder.getKosztPierwszejSztuki();
        this.kosztKolejnejSztuki = builder.getKosztKolejnejSztuki();
        this.liczbaWPaczce = builder.getLiczbaWPaczce();
        this.sposobDostawyID = builder.getSposobDostawyID();
        this.cennikDostawID = builder.getCennikDostawID();
        this.sposobDostawyTO = builder.getSposobDostawyTO();
    }

    public int getId() {
        return id;
    }

    public Integer getKosztPierwszejSztuki() {
        return kosztPierwszejSztuki;
    }

    public Integer getKosztKolejnejSztuki() {
        return kosztKolejnejSztuki;
    }

    public Integer getLiczbaWPaczce() {
        return liczbaWPaczce;
    }

    public Integer getSposobDostawyID() {
        return sposobDostawyID;
    }

    public Integer getCennikDostawID() {
        return cennikDostawID;
    }

    public SposobDostawyTO getSposobDostawyTO() {
        return sposobDostawyTO;
    }
}
