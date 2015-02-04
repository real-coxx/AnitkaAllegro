package com.springapp.builder;

import com.springapp.dto.SposobDostawyTO;

/**
 * Created by Alicja on 2015-02-01.
 */
public class SzczegolyDostawyBuilder {

    private int id;
    private Double kosztPierwszejSztuki;
    private Double kosztKolejnejSztuki;
    private Integer liczbaWPaczce;
    private Integer sposobDostawyID;
    private Integer cennikDostawID;
    private SposobDostawyTO sposobDostawyTO;

    public SzczegolyDostawyBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public SzczegolyDostawyBuilder setKosztPierwszejSztuki(Double kosztPierwszejSztuki) {
        this.kosztPierwszejSztuki = kosztPierwszejSztuki;
        return this;
    }

    public SzczegolyDostawyBuilder setKosztKolejnejSztuki(Double kosztKolejnejSztuki) {
        this.kosztKolejnejSztuki = kosztKolejnejSztuki;
        return this;
    }

    public SzczegolyDostawyBuilder setLiczbaWPaczce(Integer liczbaWPaczce) {
        this.liczbaWPaczce = liczbaWPaczce;
        return this;
    }

    public SzczegolyDostawyBuilder setSposobDostawyID(Integer sposobDostawyID) {
        this.sposobDostawyID = sposobDostawyID;
        return this;
    }

    public SzczegolyDostawyBuilder setCennikDostawID(Integer cennikDostawID) {
        this.cennikDostawID = cennikDostawID;
        return this;
    }

    public SzczegolyDostawyBuilder setSposobDostawyTO(SposobDostawyTO sposobDostawyTO) {
        this.sposobDostawyTO = sposobDostawyTO;
        return this;
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
