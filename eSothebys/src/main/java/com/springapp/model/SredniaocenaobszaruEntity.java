package com.springapp.model;

import javax.persistence.*;

/**
 * Created by Alicja on 2015-01-05.
 */
@Entity
@Table(name = "sredniaocenaobszaru", schema = "", catalog = "esothebys_db")
public class SredniaocenaobszaruEntity {
    private int id;
    private Integer punkty;
    private Integer oceniany;
    private Integer obszar;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Punkty")
    public Integer getPunkty() {
        return punkty;
    }

    public void setPunkty(Integer punkty) {
        this.punkty = punkty;
    }

    @Basic
    @Column(name = "Oceniany")
    public Integer getOceniany() {
        return oceniany;
    }

    public void setOceniany(Integer oceniany) {
        this.oceniany = oceniany;
    }

    @Basic
    @Column(name = "Obszar")
    public Integer getObszar() {
        return obszar;
    }

    public void setObszar(Integer obszar) {
        this.obszar = obszar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SredniaocenaobszaruEntity that = (SredniaocenaobszaruEntity) o;

        if (id != that.id) return false;
        if (obszar != null ? !obszar.equals(that.obszar) : that.obszar != null) return false;
        if (oceniany != null ? !oceniany.equals(that.oceniany) : that.oceniany != null) return false;
        if (punkty != null ? !punkty.equals(that.punkty) : that.punkty != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (punkty != null ? punkty.hashCode() : 0);
        result = 31 * result + (oceniany != null ? oceniany.hashCode() : 0);
        result = 31 * result + (obszar != null ? obszar.hashCode() : 0);
        return result;
    }
}
