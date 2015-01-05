package com.springapp.model;

import javax.persistence.*;

/**
 * Created by Alicja on 2015-01-05.
 */
@Entity
@Table(name = "wartosc", schema = "", catalog = "esothebys_db")
public class WartoscEntity {
    private int id;
    private String wartoscNominalna;
    private String zakresDolny;
    private String zakresGorny;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "WartoscNominalna")
    public String getWartoscNominalna() {
        return wartoscNominalna;
    }

    public void setWartoscNominalna(String wartoscNominalna) {
        this.wartoscNominalna = wartoscNominalna;
    }

    @Basic
    @Column(name = "ZakresDolny")
    public String getZakresDolny() {
        return zakresDolny;
    }

    public void setZakresDolny(String zakresDolny) {
        this.zakresDolny = zakresDolny;
    }

    @Basic
    @Column(name = "ZakresGorny")
    public String getZakresGorny() {
        return zakresGorny;
    }

    public void setZakresGorny(String zakresGorny) {
        this.zakresGorny = zakresGorny;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WartoscEntity that = (WartoscEntity) o;

        if (id != that.id) return false;
        if (wartoscNominalna != null ? !wartoscNominalna.equals(that.wartoscNominalna) : that.wartoscNominalna != null)
            return false;
        if (zakresDolny != null ? !zakresDolny.equals(that.zakresDolny) : that.zakresDolny != null) return false;
        if (zakresGorny != null ? !zakresGorny.equals(that.zakresGorny) : that.zakresGorny != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (wartoscNominalna != null ? wartoscNominalna.hashCode() : 0);
        result = 31 * result + (zakresDolny != null ? zakresDolny.hashCode() : 0);
        result = 31 * result + (zakresGorny != null ? zakresGorny.hashCode() : 0);
        return result;
    }
}
