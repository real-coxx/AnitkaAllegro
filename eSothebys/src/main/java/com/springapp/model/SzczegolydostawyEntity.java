package com.springapp.model;

import javax.persistence.*;

/**
 * Created by Alicja on 2015-01-05.
 */
@Entity
@Table(name = "szczegolydostawy", schema = "", catalog = "esothebys_db")
public class SzczegolydostawyEntity {
    private int id;
    private Double kosztPierwszejSztuki;
    private Double kosztKolejnejSztuki;
    private Integer liczbaWPaczce;
    private SposobdostawyEntity sposobDostawy;
    private CennikdostawEntity cennikDostaw;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "KosztPierwszejSztuki")
    public Double getKosztPierwszejSztuki() {
        return kosztPierwszejSztuki;
    }

    public void setKosztPierwszejSztuki(Double kosztPierwszejSztuki) {
        this.kosztPierwszejSztuki = kosztPierwszejSztuki;
    }

    @Basic
    @Column(name = "KosztKolejnejSztuki")
    public Double getKosztKolejnejSztuki() {
        return kosztKolejnejSztuki;
    }

    public void setKosztKolejnejSztuki(Double kosztKolejnejSztuki) {
        this.kosztKolejnejSztuki = kosztKolejnejSztuki;
    }

    @Basic
    @Column(name = "LiczbaWPaczce")
    public Integer getLiczbaWPaczce() {
        return liczbaWPaczce;
    }

    public void setLiczbaWPaczce(Integer liczbaWPaczce) {
        this.liczbaWPaczce = liczbaWPaczce;
    }

    @OneToOne (cascade=CascadeType.ALL)
    @JoinColumn(name="SposobDostawy")
    public SposobdostawyEntity getSposobDostawy() {
        return sposobDostawy;
    }

    public void setSposobDostawy(SposobdostawyEntity sposobDostawy) {
        this.sposobDostawy = sposobDostawy;
    }

    @OneToOne (cascade=CascadeType.ALL)
    @JoinColumn(name="CennikDostaw")
    public CennikdostawEntity getCennikDostaw() {
        return cennikDostaw;
    }

    public void setCennikDostaw(CennikdostawEntity cennikDostaw) {
        this.cennikDostaw = cennikDostaw;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SzczegolydostawyEntity that = (SzczegolydostawyEntity) o;

        if (id != that.id) return false;
        if (kosztKolejnejSztuki != null ? !kosztKolejnejSztuki.equals(that.kosztKolejnejSztuki) : that.kosztKolejnejSztuki != null)
            return false;
        if (kosztPierwszejSztuki != null ? !kosztPierwszejSztuki.equals(that.kosztPierwszejSztuki) : that.kosztPierwszejSztuki != null)
            return false;
        if (liczbaWPaczce != null ? !liczbaWPaczce.equals(that.liczbaWPaczce) : that.liczbaWPaczce != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (kosztPierwszejSztuki != null ? kosztPierwszejSztuki.hashCode() : 0);
        result = 31 * result + (kosztKolejnejSztuki != null ? kosztKolejnejSztuki.hashCode() : 0);
        result = 31 * result + (liczbaWPaczce != null ? liczbaWPaczce.hashCode() : 0);
        return result;
    }
}
