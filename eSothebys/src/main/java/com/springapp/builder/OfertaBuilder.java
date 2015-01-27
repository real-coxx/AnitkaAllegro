package com.springapp.builder;

import com.springapp.dto.AukcjaTO;
import com.springapp.model.AukcjaEntity;
import com.springapp.model.UmowaEntity;
import com.springapp.model.UzytkownikEntity;

import java.sql.Date;
import java.util.List;

/**
 * Created by Alicja on 2015-01-22.
 */
public class OfertaBuilder {

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

    public OfertaBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public OfertaBuilder setLiczbaSztuk(Integer liczbaSztuk) {
        this.liczbaSztuk = liczbaSztuk;
        return this;
    }

    public OfertaBuilder setTerminZlozenia(Date terminZlozenia) {
        this.terminZlozenia = terminZlozenia;
        return this;
    }

    public OfertaBuilder setTerminOdrzucenia(Date terminOdrzucenia) {
        this.terminOdrzucenia = terminOdrzucenia;
        return this;
    }

    public OfertaBuilder setPowodOdrzucenia(String powodOdrzucenia) {
        this.powodOdrzucenia = powodOdrzucenia;
        return this;
    }

    public OfertaBuilder setOferta(Integer oferta) {
        this.oferta = oferta;
        return this;
    }

    public OfertaBuilder setMaksymalnaKwota(Integer maksymalnaKwota) {
        this.maksymalnaKwota = maksymalnaKwota;
        return this;
    }

    public OfertaBuilder setDiscriminator(String discriminator) {
        this.discriminator = discriminator;
        return this;
    }

    public OfertaBuilder setAukcja2Index(Integer aukcja2Index) {
        this.aukcja2Index = aukcja2Index;
        return this;
    }

    public OfertaBuilder setColumn(Integer column) {
        this.column = column;
        return this;
    }

    public OfertaBuilder setColumn2(Integer column2) {
        this.column2 = column2;
        return this;
    }

    public OfertaBuilder setAukcja(AukcjaTO aukcja) {
        this.aukcja = aukcja;
        return this;
    }

    public OfertaBuilder setUzytkownik(UzytkownikEntity uzytkownik) {
        this.uzytkownik = uzytkownik;
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
