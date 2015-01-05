package com.springapp.model;

import javax.persistence.*;

/**
 * Created by Alicja on 2015-01-05.
 */
@Entity
@Table(name = "opcjadodatkowa", schema = "", catalog = "esothebys_db")
public class OpcjadodatkowaEntity {
    private int id;
    private String nazwa;
    private boolean podlegaRabatowi;
    private String ograniczeniaCenyUzytkownika;
    private String discriminator;

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
    @Column(name = "PodlegaRabatowi")
    public boolean isPodlegaRabatowi() {
        return podlegaRabatowi;
    }

    public void setPodlegaRabatowi(boolean podlegaRabatowi) {
        this.podlegaRabatowi = podlegaRabatowi;
    }

    @Basic
    @Column(name = "OgraniczeniaCenyUzytkownika")
    public String getOgraniczeniaCenyUzytkownika() {
        return ograniczeniaCenyUzytkownika;
    }

    public void setOgraniczeniaCenyUzytkownika(String ograniczeniaCenyUzytkownika) {
        this.ograniczeniaCenyUzytkownika = ograniczeniaCenyUzytkownika;
    }

    @Basic
    @Column(name = "Discriminator")
    public String getDiscriminator() {
        return discriminator;
    }

    public void setDiscriminator(String discriminator) {
        this.discriminator = discriminator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OpcjadodatkowaEntity that = (OpcjadodatkowaEntity) o;

        if (id != that.id) return false;
        if (podlegaRabatowi != that.podlegaRabatowi) return false;
        if (discriminator != null ? !discriminator.equals(that.discriminator) : that.discriminator != null)
            return false;
        if (nazwa != null ? !nazwa.equals(that.nazwa) : that.nazwa != null) return false;
        if (ograniczeniaCenyUzytkownika != null ? !ograniczeniaCenyUzytkownika.equals(that.ograniczeniaCenyUzytkownika) : that.ograniczeniaCenyUzytkownika != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nazwa != null ? nazwa.hashCode() : 0);
        result = 31 * result + (podlegaRabatowi ? 1 : 0);
        result = 31 * result + (ograniczeniaCenyUzytkownika != null ? ograniczeniaCenyUzytkownika.hashCode() : 0);
        result = 31 * result + (discriminator != null ? discriminator.hashCode() : 0);
        return result;
    }
}
