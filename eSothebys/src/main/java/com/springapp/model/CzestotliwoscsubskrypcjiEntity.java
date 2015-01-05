package com.springapp.model;

import javax.persistence.*;

/**
 * Created by Alicja on 2015-01-05.
 */
@Entity
@Table(name = "czestotliwoscsubskrypcji", schema = "", catalog = "esothebys_db")
public class CzestotliwoscsubskrypcjiEntity {
    private int id;
    private Integer codziennie;
    private Integer co2Dzien;
    private Integer co3Dni;
    private Integer razWTygodniu;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Codziennie")
    public Integer getCodziennie() {
        return codziennie;
    }

    public void setCodziennie(Integer codziennie) {
        this.codziennie = codziennie;
    }

    @Basic
    @Column(name = "Co2dzien")
    public Integer getCo2Dzien() {
        return co2Dzien;
    }

    public void setCo2Dzien(Integer co2Dzien) {
        this.co2Dzien = co2Dzien;
    }

    @Basic
    @Column(name = "Co3dni")
    public Integer getCo3Dni() {
        return co3Dni;
    }

    public void setCo3Dni(Integer co3Dni) {
        this.co3Dni = co3Dni;
    }

    @Basic
    @Column(name = "RazWTygodniu")
    public Integer getRazWTygodniu() {
        return razWTygodniu;
    }

    public void setRazWTygodniu(Integer razWTygodniu) {
        this.razWTygodniu = razWTygodniu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CzestotliwoscsubskrypcjiEntity that = (CzestotliwoscsubskrypcjiEntity) o;

        if (id != that.id) return false;
        if (co2Dzien != null ? !co2Dzien.equals(that.co2Dzien) : that.co2Dzien != null) return false;
        if (co3Dni != null ? !co3Dni.equals(that.co3Dni) : that.co3Dni != null) return false;
        if (codziennie != null ? !codziennie.equals(that.codziennie) : that.codziennie != null) return false;
        if (razWTygodniu != null ? !razWTygodniu.equals(that.razWTygodniu) : that.razWTygodniu != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (codziennie != null ? codziennie.hashCode() : 0);
        result = 31 * result + (co2Dzien != null ? co2Dzien.hashCode() : 0);
        result = 31 * result + (co3Dni != null ? co3Dni.hashCode() : 0);
        result = 31 * result + (razWTygodniu != null ? razWTygodniu.hashCode() : 0);
        return result;
    }
}
