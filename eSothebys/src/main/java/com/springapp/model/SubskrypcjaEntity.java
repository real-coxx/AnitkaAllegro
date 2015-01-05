package com.springapp.model;

import javax.persistence.*;

/**
 * Created by Alicja on 2015-01-05.
 */
@Entity
@Table(name = "subskrypcja", schema = "", catalog = "esothebys_db")
public class SubskrypcjaEntity {
    private int id;
    private Integer czestotliwoscSubskrypcji;
    private Integer wyswietlenie;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "CzestotliwoscSubskrypcji")
    public Integer getCzestotliwoscSubskrypcji() {
        return czestotliwoscSubskrypcji;
    }

    public void setCzestotliwoscSubskrypcji(Integer czestotliwoscSubskrypcji) {
        this.czestotliwoscSubskrypcji = czestotliwoscSubskrypcji;
    }

    @Basic
    @Column(name = "Wyswietlenie")
    public Integer getWyswietlenie() {
        return wyswietlenie;
    }

    public void setWyswietlenie(Integer wyswietlenie) {
        this.wyswietlenie = wyswietlenie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SubskrypcjaEntity that = (SubskrypcjaEntity) o;

        if (id != that.id) return false;
        if (czestotliwoscSubskrypcji != null ? !czestotliwoscSubskrypcji.equals(that.czestotliwoscSubskrypcji) : that.czestotliwoscSubskrypcji != null)
            return false;
        if (wyswietlenie != null ? !wyswietlenie.equals(that.wyswietlenie) : that.wyswietlenie != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (czestotliwoscSubskrypcji != null ? czestotliwoscSubskrypcji.hashCode() : 0);
        result = 31 * result + (wyswietlenie != null ? wyswietlenie.hashCode() : 0);
        return result;
    }
}
