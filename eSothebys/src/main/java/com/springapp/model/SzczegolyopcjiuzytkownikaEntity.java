package com.springapp.model;

import javax.persistence.*;

/**
 * Created by Alicja on 2015-01-05.
 */
@Entity
@Table(name = "szczegolyopcjiuzytkownika", schema = "", catalog = "esothebys_db")
public class SzczegolyopcjiuzytkownikaEntity {
    private int id;
    private Integer wprowadzonaWartosc;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "WprowadzonaWartosc")
    public Integer getWprowadzonaWartosc() {
        return wprowadzonaWartosc;
    }

    public void setWprowadzonaWartosc(Integer wprowadzonaWartosc) {
        this.wprowadzonaWartosc = wprowadzonaWartosc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SzczegolyopcjiuzytkownikaEntity that = (SzczegolyopcjiuzytkownikaEntity) o;

        if (id != that.id) return false;
        if (wprowadzonaWartosc != null ? !wprowadzonaWartosc.equals(that.wprowadzonaWartosc) : that.wprowadzonaWartosc != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (wprowadzonaWartosc != null ? wprowadzonaWartosc.hashCode() : 0);
        return result;
    }
}
