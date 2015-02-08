package com.springapp.builder;

import com.springapp.model.DanedowysylkiEntity;
import com.springapp.model.KrajEntity;
import com.springapp.model.WojewodztwoEntity;

/**
 * Created by Alicja on 2015-02-02.
 */
public class AdresBuilder {

    private int id;
    private String ulicaZNumerem;
    private String kodPocztow;
    private String miejscowosc;
    private Integer uzytkownik2ID;
    private KrajEntity kraj;
    private DanedowysylkiEntity daneDoWysylki;
    private WojewodztwoEntity wojewodztwo;

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

    public AdresBuilder setKraj(KrajEntity kraj) {
        this.kraj = kraj;
        return this;
    }

    public AdresBuilder setDaneDoWysylki(DanedowysylkiEntity daneDoWysylki) {
        this.daneDoWysylki = daneDoWysylki;
        return this;
    }

    public AdresBuilder setWojewodztwo(WojewodztwoEntity wojewodztwo) {
        this.wojewodztwo = wojewodztwo;
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

    public KrajEntity getKraj() {
        return kraj;
    }

    public DanedowysylkiEntity getDaneDoWysylki() {
        return daneDoWysylki;
    }

    public WojewodztwoEntity getWojewodztwo() {
        return wojewodztwo;
    }
}
