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
    private AukcjaEntity aukcja;
    private UzytkownikEntity kupujacy;
    private UmowaEntity umowa;
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

    @OneToOne (cascade=CascadeType.ALL)
    @JoinColumn(name="Aukcja")
    public AukcjaEntity getAukcja() {
        return aukcja;
    }

    public void setAukcja(AukcjaEntity aukcja) {
        this.aukcja = aukcja;
    }

    @OneToOne (cascade=CascadeType.ALL)
    @JoinColumn(name="Kupujacy")
    public UzytkownikEntity getKupujacy() {
        return kupujacy;
    }

    public void setKupujacy(UzytkownikEntity kupujacy) {
        this.kupujacy = kupujacy;
    }

    @OneToOne (cascade=CascadeType.ALL)
    @JoinColumn(name="Umowa")
    public UmowaEntity getUmowa() {
        return umowa;
    }

    public void setUmowa(UmowaEntity umowa) {
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
        return result;
    }
}
