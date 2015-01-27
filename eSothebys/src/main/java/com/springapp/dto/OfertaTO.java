package com.springapp.dto;

import com.springapp.builder.OfertaBuilder;
import com.springapp.model.AukcjaEntity;
import com.springapp.model.UmowaEntity;
import com.springapp.model.UzytkownikEntity;

import java.sql.Date;
import java.util.List;

/**
 * Created by Alicja on 2015-01-22.
 */
public class OfertaTO {

    private int id;
    private Integer liczbaSztuk;
    private Date terminZlozenia;
    private Date terminOdrzucenia;
    private String powodOdrzucenia;
    private Integer oferta;
    private Integer maksymalnaKwota;
    private String discriminator;
    private Integer aukcja2Index;
    private Integer column;
    private Integer column2;
    private AukcjaTO aukcja;
    private UzytkownikEntity uzytkownik;
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
        this.discriminator = builder.getDiscriminator();
        this.aukcja2Index = builder.getAukcja2Index();
        this.column = builder.getColumn();
        this.column2 = builder.getColumn2();
        this.aukcja = builder.getAukcja();
        this.uzytkownik = builder.getUzytkownik();
        this.umowa = builder.getUmowa();
        this.typOferty = builder.getTypOferty();
    }

    public int getId() {
        return id;
    }

    public Integer getLiczbaSztuk() {
        return liczbaSztuk;
    }

    public Date getTerminZlozenia() {
        return terminZlozenia;
    }

    public Date getTerminOdrzucenia() {
        return terminOdrzucenia;
    }

    public String getPowodOdrzucenia() {
        return powodOdrzucenia;
    }

    public Integer getOferta() {
        return oferta;
    }

    public Integer getMaksymalnaKwota() {
        return maksymalnaKwota;
    }

    public String getDiscriminator() {
        return discriminator;
    }

    public Integer getAukcja2Index() {
        return aukcja2Index;
    }

    public Integer getColumn() {
        return column;
    }

    public Integer getColumn2() {
        return column2;
    }

    public AukcjaTO getAukcja() {
        return aukcja;
    }

    public UzytkownikEntity getUzytkownik() {
        return uzytkownik;
    }

    public UmowaEntity getUmowa() {
        return umowa;
    }

    public int getTypOferty() {
        return typOferty;
    }
}
