package com.springapp.model;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Alicja on 2015-01-05.
 */
@Entity
@Table(name = "wniosekzmianyimieniainazwiska", schema = "", catalog = "esothebys_db")
public class WniosekzmianyimieniainazwiskaEntity {
    private int id;
    private String imie;
    private String nazwisko;
    private Integer powod;
    private Date dataZlozenia;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Imie")
    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    @Basic
    @Column(name = "Nazwisko")
    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Basic
    @Column(name = "Powod")
    public Integer getPowod() {
        return powod;
    }

    public void setPowod(Integer powod) {
        this.powod = powod;
    }

    @Basic
    @Column(name = "DataZlozenia")
    public Date getDataZlozenia() {
        return dataZlozenia;
    }

    public void setDataZlozenia(Date dataZlozenia) {
        this.dataZlozenia = dataZlozenia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WniosekzmianyimieniainazwiskaEntity that = (WniosekzmianyimieniainazwiskaEntity) o;

        if (id != that.id) return false;
        if (dataZlozenia != null ? !dataZlozenia.equals(that.dataZlozenia) : that.dataZlozenia != null) return false;
        if (imie != null ? !imie.equals(that.imie) : that.imie != null) return false;
        if (nazwisko != null ? !nazwisko.equals(that.nazwisko) : that.nazwisko != null) return false;
        if (powod != null ? !powod.equals(that.powod) : that.powod != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (imie != null ? imie.hashCode() : 0);
        result = 31 * result + (nazwisko != null ? nazwisko.hashCode() : 0);
        result = 31 * result + (powod != null ? powod.hashCode() : 0);
        result = 31 * result + (dataZlozenia != null ? dataZlozenia.hashCode() : 0);
        return result;
    }
}
