package com.springapp.dto;

import com.springapp.builder.AdresBuilder;
import com.springapp.model.KrajEntity;

/**
 * Created by Alicja on 2015-02-02.
 */
public class AdresTO {

    private int id;
    private String ulicaZNumerem;
    private String kodPocztow;
    private String miejscowosc;
    private Integer uzytkownik2ID;
    private Integer kraj2ID;
    private KrajEntity krajEntity;

    public AdresTO(AdresBuilder builder) {
        this.id = builder.getId();
        this.ulicaZNumerem = builder.getUlicaZNumerem();
        this.kodPocztow = builder.getKodPocztow();
        this.miejscowosc = builder.getMiejscowosc();
        this.uzytkownik2ID = builder.getUzytkownik2ID();
        this.kraj2ID = builder.getKraj2ID();
        this.krajEntity = builder.getKrajEntity();
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
