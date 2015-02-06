package com.springapp.builder;

import com.springapp.dto.AukcjaTO;
import com.springapp.dto.UzytkownikTO;
import com.springapp.model.AukcjaEntity;
import com.springapp.model.UmowaEntity;
import com.springapp.model.UzytkownikEntity;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by Alicja on 2015-01-22.
 */
public class OfertaBuilder {

    private int id;
    private Integer liczbaSztuk;
    private Timestamp terminZlozenia;
    private Timestamp terminOdrzucenia;
    private String powodOdrzucenia;
    private Double oferta;
    private Double maksymalnaKwota;
    private AukcjaEntity aukcja;
    private UzytkownikEntity kupujacy;
    private UmowaEntity umowa;
    private int typOferty;

    public OfertaBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public OfertaBuilder setLiczbaSztuk(Integer liczbaSztuk) {
        this.liczbaSztuk = liczbaSztuk;
        return this;
    }

    public OfertaBuilder setTerminZlozenia(Timestamp terminZlozenia) {
        this.terminZlozenia = terminZlozenia;
        return this;
    }

    public OfertaBuilder setTerminOdrzucenia(Timestamp terminOdrzucenia) {
        this.terminOdrzucenia = terminOdrzucenia;
        return this;
    }

    public OfertaBuilder setPowodOdrzucenia(String powodOdrzucenia) {
        this.powodOdrzucenia = powodOdrzucenia;
        return this;
    }

    public OfertaBuilder setOferta(Double oferta) {
        this.oferta = oferta;
        return this;
    }

    public OfertaBuilder setMaksymalnaKwota(Double maksymalnaKwota) {
        this.maksymalnaKwota = maksymalnaKwota;
        return this;
    }

    public OfertaBuilder setAukcja(AukcjaEntity aukcja) {
        this.aukcja = aukcja;
        return this;
    }

    public OfertaBuilder setKupujacy(UzytkownikEntity kupujacy) {
        this.kupujacy = kupujacy;
        return this;
    }

    public OfertaBuilder setUmowa(UmowaEntity umowa) {
        this.umowa = umowa;
        return this;
    }

    public OfertaBuilder setTypOferty(int typOferty) {
        this.typOferty = typOferty;
        return this;
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

    public Timestamp getTerminOdrzucenia() {
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
