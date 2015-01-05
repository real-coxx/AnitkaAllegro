package com.springapp.model;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Alicja on 2015-01-05.
 */
@Entity
@Table(name = "wniosekrejestracyjny", schema = "", catalog = "esothebys_db")
public class WniosekrejestracyjnyEntity {
    private int id;
    private String email;
    private Date dataUrodzenia;
    private String haslo;
    private Date dataZlozenia;
    private Integer wiek;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "DataUrodzenia")
    public Date getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(Date dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    @Basic
    @Column(name = "Haslo")
    public String getHaslo() {
        return haslo;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }

    @Basic
    @Column(name = "DataZlozenia")
    public Date getDataZlozenia() {
        return dataZlozenia;
    }

    public void setDataZlozenia(Date dataZlozenia) {
        this.dataZlozenia = dataZlozenia;
    }

    @Basic
    @Column(name = "Wiek")
    public Integer getWiek() {
        return wiek;
    }

    public void setWiek(Integer wiek) {
        this.wiek = wiek;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WniosekrejestracyjnyEntity that = (WniosekrejestracyjnyEntity) o;

        if (id != that.id) return false;
        if (dataUrodzenia != null ? !dataUrodzenia.equals(that.dataUrodzenia) : that.dataUrodzenia != null)
            return false;
        if (dataZlozenia != null ? !dataZlozenia.equals(that.dataZlozenia) : that.dataZlozenia != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (haslo != null ? !haslo.equals(that.haslo) : that.haslo != null) return false;
        if (wiek != null ? !wiek.equals(that.wiek) : that.wiek != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (dataUrodzenia != null ? dataUrodzenia.hashCode() : 0);
        result = 31 * result + (haslo != null ? haslo.hashCode() : 0);
        result = 31 * result + (dataZlozenia != null ? dataZlozenia.hashCode() : 0);
        result = 31 * result + (wiek != null ? wiek.hashCode() : 0);
        return result;
    }
}
