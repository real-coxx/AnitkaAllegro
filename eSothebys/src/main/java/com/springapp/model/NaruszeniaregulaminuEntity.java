package com.springapp.model;

import javax.persistence.*;

/**
 * Created by Alicja on 2015-01-05.
 */
@Entity
@Table(name = "naruszeniaregulaminu", schema = "", catalog = "esothebys_db")
public class NaruszeniaregulaminuEntity {
    private int id;
    private Integer dataZgloszenia;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "DataZgloszenia")
    public Integer getDataZgloszenia() {
        return dataZgloszenia;
    }

    public void setDataZgloszenia(Integer dataZgloszenia) {
        this.dataZgloszenia = dataZgloszenia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NaruszeniaregulaminuEntity that = (NaruszeniaregulaminuEntity) o;

        if (id != that.id) return false;
        if (dataZgloszenia != null ? !dataZgloszenia.equals(that.dataZgloszenia) : that.dataZgloszenia != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (dataZgloszenia != null ? dataZgloszenia.hashCode() : 0);
        return result;
    }
}
