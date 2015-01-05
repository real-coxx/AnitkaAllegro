package com.springapp.model;

import javax.persistence.*;

/**
 * Created by Alicja on 2015-01-05.
 */
@Entity
@Table(name = "parametr", schema = "", catalog = "esothebys_db")
public class ParametrEntity {
    private int id;
    private String nazwa;
    private Integer typ;
    private String jednostka;
    private Boolean obligatoryjny;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Nazwa")
    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    @Basic
    @Column(name = "Typ")
    public Integer getTyp() {
        return typ;
    }

    public void setTyp(Integer typ) {
        this.typ = typ;
    }

    @Basic
    @Column(name = "Jednostka")
    public String getJednostka() {
        return jednostka;
    }

    public void setJednostka(String jednostka) {
        this.jednostka = jednostka;
    }

    @Basic
    @Column(name = "Obligatoryjny")
    public Boolean getObligatoryjny() {
        return obligatoryjny;
    }

    public void setObligatoryjny(Boolean obligatoryjny) {
        this.obligatoryjny = obligatoryjny;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ParametrEntity that = (ParametrEntity) o;

        if (id != that.id) return false;
        if (jednostka != null ? !jednostka.equals(that.jednostka) : that.jednostka != null) return false;
        if (nazwa != null ? !nazwa.equals(that.nazwa) : that.nazwa != null) return false;
        if (obligatoryjny != null ? !obligatoryjny.equals(that.obligatoryjny) : that.obligatoryjny != null)
            return false;
        if (typ != null ? !typ.equals(that.typ) : that.typ != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nazwa != null ? nazwa.hashCode() : 0);
        result = 31 * result + (typ != null ? typ.hashCode() : 0);
        result = 31 * result + (jednostka != null ? jednostka.hashCode() : 0);
        result = 31 * result + (obligatoryjny != null ? obligatoryjny.hashCode() : 0);
        return result;
    }
}
