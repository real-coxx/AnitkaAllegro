package com.springapp.dto;

import com.springapp.builder.AdresBuilder;
import com.springapp.model.DanedowysylkiEntity;
import com.springapp.model.KrajEntity;
import com.springapp.model.WartoscEntity;
import com.springapp.model.WojewodztwoEntity;

/**
 * Created by Alicja on 2015-02-02.
 */
public class AdresTO {

    private int id;
    private String ulicaZNumerem;
    private String kodPocztow;
    private String miejscowosc;
    private Integer uzytkownik2ID;
    private KrajEntity kraj;
    private DanedowysylkiEntity daneDoWysylki;
    private WojewodztwoEntity wojewodztwo;

    public AdresTO(AdresBuilder builder) {
        this.id = builder.getId();
        this.ulicaZNumerem = builder.getUlicaZNumerem();
        this.kodPocztow = builder.getKodPocztow();
        this.miejscowosc = builder.getMiejscowosc();
        this.uzytkownik2ID = builder.getUzytkownik2ID();
        this.kraj = builder.getKraj();
        this.daneDoWysylki = builder.getDaneDoWysylki();
        this.wojewodztwo = builder.getWojewodztwo();
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

    public KrajEntity getKrajEntity() {
        return kraj;
    }

    public DanedowysylkiEntity getDaneDoWysylki() {
        return daneDoWysylki;
    }

    public WojewodztwoEntity getWojewodztwo() {
        return wojewodztwo;
    }
}
