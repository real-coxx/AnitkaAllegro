package com.springapp.model;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Alicja on 2015-01-05.
 */
@Entity
@Table(name = "oferta", schema = "", catalog = "esothebys_db")
public class OfertaEntity {
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
    private Integer aukcja;
    private Integer uzytkownik;
    private Integer umowa;
    private int typOferty;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "LiczbaSztuk")
    public Integer getLiczbaSztuk() {
        return liczbaSztuk;
    }

    public void setLiczbaSztuk(Integer liczbaSztuk) {
        this.liczbaSztuk = liczbaSztuk;
    }

    @Basic
    @Column(name = "TerminZlozenia")
    public Date getTerminZlozenia() {
        return terminZlozenia;
    }

    public void setTerminZlozenia(Date terminZlozenia) {
        this.terminZlozenia = terminZlozenia;
    }

    @Basic
    @Column(name = "TerminOdrzucenia")
    public Date getTerminOdrzucenia() {
        return terminOdrzucenia;
    }

    public void setTerminOdrzucenia(Date terminOdrzucenia) {
        this.terminOdrzucenia = terminOdrzucenia;
    }

    @Basic
    @Column(name = "PowodOdrzucenia")
    public String getPowodOdrzucenia() {
        return powodOdrzucenia;
    }

    public void setPowodOdrzucenia(String powodOdrzucenia) {
        this.powodOdrzucenia = powodOdrzucenia;
    }

    @Basic
    @Column(name = "Oferta")
    public Integer getOferta() {
        return oferta;
    }

    public void setOferta(Integer oferta) {
        this.oferta = oferta;
    }

    @Basic
    @Column(name = "MaksymalnaKwota")
    public Integer getMaksymalnaKwota() {
        return maksymalnaKwota;
    }

    public void setMaksymalnaKwota(Integer maksymalnaKwota) {
        this.maksymalnaKwota = maksymalnaKwota;
    }

    @Basic
    @Column(name = "Discriminator")
    public String getDiscriminator() {
        return discriminator;
    }

    public void setDiscriminator(String discriminator) {
        this.discriminator = discriminator;
    }

    @Basic
    @Column(name = "Aukcja2Index")
    public Integer getAukcja2Index() {
        return aukcja2Index;
    }

    public void setAukcja2Index(Integer aukcja2Index) {
        this.aukcja2Index = aukcja2Index;
    }

    @Basic
    @Column(name = "Column")
    public Integer getColumn() {
        return column;
    }

    public void setColumn(Integer column) {
        this.column = column;
    }

    @Basic
    @Column(name = "Column2")
    public Integer getColumn2() {
        return column2;
    }

    public void setColumn2(Integer column2) {
        this.column2 = column2;
    }

    @Basic
    @Column(name = "Aukcja2ID")
    public Integer getAukcja() {
        return aukcja;
    }

    public void setAukcja(Integer aukcja) {
        this.aukcja = aukcja;
    }

    @Basic
    @Column(name = "Uzytkownik2ID")
    public Integer getUzytkownik() {
        return uzytkownik;
    }

    public void setUzytkownik(Integer uzytkownik) {
        this.uzytkownik = uzytkownik;
    }

    @Basic
    @Column(name = "Umowa2ID")
    public Integer getUmowa() {
        return umowa;
    }

    public void setUmowa(Integer umowa) {
        this.umowa = umowa;
    }

    @Basic
    @Column(name = "typOferty")
    public Integer getTypOferty() {
        return typOferty;
    }

    public void setTypOferty(Integer typOferty) {
        this.typOferty = typOferty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OfertaEntity that = (OfertaEntity) o;

        if (id != that.id) return false;
        if (aukcja2Index != null ? !aukcja2Index.equals(that.aukcja2Index) : that.aukcja2Index != null) return false;
        if (column != null ? !column.equals(that.column) : that.column != null) return false;
        if (column2 != null ? !column2.equals(that.column2) : that.column2 != null) return false;
        if (discriminator != null ? !discriminator.equals(that.discriminator) : that.discriminator != null)
            return false;
        if (liczbaSztuk != null ? !liczbaSztuk.equals(that.liczbaSztuk) : that.liczbaSztuk != null) return false;
        if (maksymalnaKwota != null ? !maksymalnaKwota.equals(that.maksymalnaKwota) : that.maksymalnaKwota != null)
            return false;
        if (oferta != null ? !oferta.equals(that.oferta) : that.oferta != null) return false;
        if (powodOdrzucenia != null ? !powodOdrzucenia.equals(that.powodOdrzucenia) : that.powodOdrzucenia != null)
            return false;
        if (terminOdrzucenia != null ? !terminOdrzucenia.equals(that.terminOdrzucenia) : that.terminOdrzucenia != null)
            return false;
        if (terminZlozenia != null ? !terminZlozenia.equals(that.terminZlozenia) : that.terminZlozenia != null)
            return false;
        if (terminZlozenia != null ? !terminZlozenia.equals(that.terminZlozenia) : that.terminZlozenia != null)
            return false;


        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (liczbaSztuk != null ? liczbaSztuk.hashCode() : 0);
        result = 31 * result + (terminZlozenia != null ? terminZlozenia.hashCode() : 0);
        result = 31 * result + (terminOdrzucenia != null ? terminOdrzucenia.hashCode() : 0);
        result = 31 * result + (powodOdrzucenia != null ? powodOdrzucenia.hashCode() : 0);
        result = 31 * result + (oferta != null ? oferta.hashCode() : 0);
        result = 31 * result + (maksymalnaKwota != null ? maksymalnaKwota.hashCode() : 0);
        result = 31 * result + (discriminator != null ? discriminator.hashCode() : 0);
        result = 31 * result + (aukcja2Index != null ? aukcja2Index.hashCode() : 0);
        result = 31 * result + (column != null ? column.hashCode() : 0);
        result = 31 * result + (column2 != null ? column2.hashCode() : 0);
        return result;
    }
}
