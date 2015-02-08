package com.springapp.builder;

import com.springapp.dto.SposobDostawyTO;

/**
 * Created by Internet on 2015-02-08.
 */
public class SzczegolyDostawyBuilder {
    private SposobDostawyTO sposobDostawy;
    private Double kosztPierwszejSztuki;
    private double kosztKolejnejSztuki;
    private int liczbaWPaczce;

    public void setSposobDostawy(SposobDostawyTO sposobDostawy) {
        this.sposobDostawy = sposobDostawy;
    }

    public void setKosztPierwszejSztuki(double kosztPierwszejSztuki) {
        this.kosztPierwszejSztuki = kosztPierwszejSztuki;
    }

    public void setKosztKolejnejSztuki(double kosztKolejnejSztuki) {
        this.kosztKolejnejSztuki = kosztKolejnejSztuki;
    }

    public void setLiczbaWPaczce(int liczbaWPaczce) {
        this.liczbaWPaczce = liczbaWPaczce;
    }
}
