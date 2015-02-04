package com.springapp.model;

import javax.persistence.*;

/**
 * Created by Alicja on 2015-01-05.
 */
@Entity
@Table(name = "adres", schema = "", catalog = "esothebys_db")
public class AdresEntity {
    private int id;
    private String ulicaZNumerem;
    private String kodPocztow;
    private String miejscowosc;
    private Integer uzytkownik2ID;
    private Integer kraj2ID;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "UlicaZNumerem")
    public String getUlicaZNumerem() {
        return ulicaZNumerem;
    }

    public void setUlicaZNumerem(String ulicaZNumerem) {
        this.ulicaZNumerem = ulicaZNumerem;
    }

    @Basic
    @Column(name = "KodPocztow")
    public String getKodPocztow() {
        return kodPocztow;
    }

    public void setKodPocztow(String kodPocztow) {
        this.kodPocztow = kodPocztow;
    }

    @Basic
    @Column(name = "Miejscowosc")
    public String getMiejscowosc() {
        return miejscowosc;
    }

    public void setMiejscowosc(String miejscowosc) {
        this.miejscowosc = miejscowosc;
    }

    @Basic
    @Column(name = "Uzytkownik2ID")
    public Integer getUzytkownik2ID() {
        return uzytkownik2ID;
    }

    public void setUzytkownik2ID(Integer uzytkownik2ID) {
        this.uzytkownik2ID = uzytkownik2ID;
    }

    @Basic
    @Column(name = "kraj2ID")
    public Integer getKraj2ID() {
        return kraj2ID;
    }

    public void setKraj2ID(Integer kraj2ID) {
        this.kraj2ID = kraj2ID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdresEntity that = (AdresEntity) o;

        if (id != that.id) return false;
        if (kodPocztow != null ? !kodPocztow.equals(that.kodPocztow) : that.kodPocztow != null) return false;
        if (miejscowosc != null ? !miejscowosc.equals(that.miejscowosc) : that.miejscowosc != null) return false;
        if (ulicaZNumerem != null ? !ulicaZNumerem.equals(that.ulicaZNumerem) : that.ulicaZNumerem != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (ulicaZNumerem != null ? ulicaZNumerem.hashCode() : 0);
        result = 31 * result + (kodPocztow != null ? kodPocztow.hashCode() : 0);
        result = 31 * result + (miejscowosc != null ? miejscowosc.hashCode() : 0);
        return result;
    }
}
