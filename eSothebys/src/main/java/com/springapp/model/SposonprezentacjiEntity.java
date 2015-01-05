package com.springapp.model;

import javax.persistence.*;

/**
 * Created by Alicja on 2015-01-05.
 */
@Entity
@Table(name = "sposonprezentacji", schema = "", catalog = "esothebys_db")
public class SposonprezentacjiEntity {
    private int id;
    private Integer jakoTekstIObrazek;
    private Integer jakoTekst;
    private Integer jakoObrazek;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "JakoTekstIObrazek")
    public Integer getJakoTekstIObrazek() {
        return jakoTekstIObrazek;
    }

    public void setJakoTekstIObrazek(Integer jakoTekstIObrazek) {
        this.jakoTekstIObrazek = jakoTekstIObrazek;
    }

    @Basic
    @Column(name = "JakoTekst")
    public Integer getJakoTekst() {
        return jakoTekst;
    }

    public void setJakoTekst(Integer jakoTekst) {
        this.jakoTekst = jakoTekst;
    }

    @Basic
    @Column(name = "JakoObrazek")
    public Integer getJakoObrazek() {
        return jakoObrazek;
    }

    public void setJakoObrazek(Integer jakoObrazek) {
        this.jakoObrazek = jakoObrazek;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SposonprezentacjiEntity that = (SposonprezentacjiEntity) o;

        if (id != that.id) return false;
        if (jakoObrazek != null ? !jakoObrazek.equals(that.jakoObrazek) : that.jakoObrazek != null) return false;
        if (jakoTekst != null ? !jakoTekst.equals(that.jakoTekst) : that.jakoTekst != null) return false;
        if (jakoTekstIObrazek != null ? !jakoTekstIObrazek.equals(that.jakoTekstIObrazek) : that.jakoTekstIObrazek != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (jakoTekstIObrazek != null ? jakoTekstIObrazek.hashCode() : 0);
        result = 31 * result + (jakoTekst != null ? jakoTekst.hashCode() : 0);
        result = 31 * result + (jakoObrazek != null ? jakoObrazek.hashCode() : 0);
        return result;
    }
}
