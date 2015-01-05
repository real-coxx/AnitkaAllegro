package com.springapp.model;

import javax.persistence.*;

/**
 * Created by Alicja on 2015-01-05.
 */
@Entity
@Table(name = "oplatazaopcjedodatkowa", schema = "", catalog = "esothebys_db")
public class OplatazaopcjedodatkowaEntity {
    private int id;
    private String formułaWyliczeniaOpłaty;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "FormułaWyliczeniaOpłaty")
    public String getFormułaWyliczeniaOpłaty() {
        return formułaWyliczeniaOpłaty;
    }

    public void setFormułaWyliczeniaOpłaty(String formułaWyliczeniaOpłaty) {
        this.formułaWyliczeniaOpłaty = formułaWyliczeniaOpłaty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OplatazaopcjedodatkowaEntity that = (OplatazaopcjedodatkowaEntity) o;

        if (id != that.id) return false;
        if (formułaWyliczeniaOpłaty != null ? !formułaWyliczeniaOpłaty.equals(that.formułaWyliczeniaOpłaty) : that.formułaWyliczeniaOpłaty != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (formułaWyliczeniaOpłaty != null ? formułaWyliczeniaOpłaty.hashCode() : 0);
        return result;
    }
}
