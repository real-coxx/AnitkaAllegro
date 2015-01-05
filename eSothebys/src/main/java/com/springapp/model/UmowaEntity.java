package com.springapp.model;

import javax.persistence.*;

/**
 * Created by Alicja on 2015-01-05.
 */
@Entity
@Table(name = "umowa", schema = "", catalog = "esothebys_db")
public class UmowaEntity {
    private int id;
    private Integer liczbaSztuk;
    private Integer prowizja;

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
    @Column(name = "Prowizja")
    public Integer getProwizja() {
        return prowizja;
    }

    public void setProwizja(Integer prowizja) {
        this.prowizja = prowizja;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UmowaEntity that = (UmowaEntity) o;

        if (id != that.id) return false;
        if (liczbaSztuk != null ? !liczbaSztuk.equals(that.liczbaSztuk) : that.liczbaSztuk != null) return false;
        if (prowizja != null ? !prowizja.equals(that.prowizja) : that.prowizja != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (liczbaSztuk != null ? liczbaSztuk.hashCode() : 0);
        result = 31 * result + (prowizja != null ? prowizja.hashCode() : 0);
        return result;
    }
}
