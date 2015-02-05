package com.springapp.dto;

import com.springapp.builder.OfertaBuilder;
import com.springapp.model.AukcjaEntity;
import com.springapp.model.UmowaEntity;
import com.springapp.model.UzytkownikEntity;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by Alicja on 2015-01-22.
 */
public class OfertaTO {

    private int id;
    private Integer liczbaSztuk;
    private Timestamp terminZlozenia;
    private Date terminOdrzucenia;
    private String powodOdrzucenia;
    private Double oferta;
    private Double maksymalnaKwota;
    private AukcjaEntity aukcja;
    private UzytkownikEntity kupujacy;
    private UmowaEntity umowa;
    private int typOferty;

    public OfertaTO(OfertaBuilder builder) {
        this.id = builder.getId();
        this.liczbaSztuk= builder.getLiczbaSztuk();
        this.terminZlozenia = builder.getTerminZlozenia();
        this.terminOdrzucenia = builder.getTerminOdrzucenia();
        this.powodOdrzucenia = builder.getPowodOdrzucenia();
        this.oferta = builder.getOferta();
        this.maksymalnaKwota = builder.getMaksymalnaKwota();
        this.aukcja = builder.getAukcja();
        this.kupujacy = builder.getKupujacy();
        this.umowa = builder.getUmowa();
        this.typOferty = builder.getTypOferty();
    }

    public int getId() {
        return id;
    }

    public Integer getLiczbaSztuk() {
        return liczbaSztuk;
    }

    public Timestamp getTerminZlozenia() {
        return terminZlozenia;
    }

    public Date getTerminOdrzucenia() {
        return terminOdrzucenia;
    }

    public String getPowodOdrzucenia() {
        return powodOdrzucenia;
    }

    public Double getOferta() {
        return oferta;
    }

    public Double getMaksymalnaKwota() {
        return maksymalnaKwota;
    }

    public AukcjaEntity getAukcja() {
        return aukcja;
    }

    public UzytkownikEntity getKupujacy() {
        return kupujacy;
    }

    public UmowaEntity getUmowa() {
        return umowa;
    }

    public int getTypOferty() {
        return typOferty;
    }
}
