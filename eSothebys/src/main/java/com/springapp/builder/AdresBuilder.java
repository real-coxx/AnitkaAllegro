package com.springapp.builder;

import com.springapp.model.KrajEntity;

/**
 * Created by Alicja on 2015-02-02.
 */
public class AdresBuilder {

    private int id;
    private String ulicaZNumerem;
    private String kodPocztow;
    private String miejscowosc;
    private Integer uzytkownik2ID;
    private Integer kraj2ID;
    private KrajEntity krajEntity;

    public AdresBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public AdresBuilder setUlicaZNumerem(String ulicaZNumerem) {
        this.ulicaZNumerem = ulicaZNumerem;
        return this;
    }

    public AdresBuilder setKodPocztow(String kodPocztow) {
        this.kodPocztow = kodPocztow;
        return this;
    }

    public AdresBuilder setMiejscowosc(String miejscowosc) {
        this.miejscowosc = miejscowosc;
        return this;
    }

    public AdresBuilder setUzytkownik2ID(Integer uzytkownik2ID) {
        this.uzytkownik2ID = uzytkownik2ID;
        return this;
    }

    public AdresBuilder setKraj2ID(Integer kraj2ID) {
        this.kraj2ID = kraj2ID;
        return this;
    }

    public AdresBuilder setKrajEntity(KrajEntity krajEntity) {
        this.krajEntity = krajEntity;
        return this;
    }

    public int getId() {
        return id;
    }

    public String getUlicaZNumerem() {
        return ulicaZNumerem;
    }

    public String getKodPocztow() {
        return kodPocztow;
    }

    public String getMiejscowosc() {
        return miejscowosc;
    }

    public Integer getUzytkownik2ID() {
        return uzytkownik2ID;
    }

    public Integer getKraj2ID() {
        return kraj2ID;
    }

    public KrajEntity getKrajEntity() {
        return krajEntity;
    }
}
