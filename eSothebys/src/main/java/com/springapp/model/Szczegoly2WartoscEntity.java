package com.springapp.model;

import javax.persistence.*;

/**
 * Created by Alicja on 2015-01-05.
 */
@Entity
@Table(name = "szczegoly2_wartosc", schema = "", catalog = "esothebys_db")
@IdClass(Szczegoly2WartoscEntityPK.class)
public class Szczegoly2WartoscEntity {
    private int szczegoly2Id;
    private int wartosc2Id;

    @Id
    @Column(name = "Szczegoly2ID")
    public int getSzczegoly2Id() {
        return szczegoly2Id;
    }

    public void setSzczegoly2Id(int szczegoly2Id) {
        this.szczegoly2Id = szczegoly2Id;
    }

    @Id
    @Column(name = "Wartosc2ID")
    public int getWartosc2Id() {
        return wartosc2Id;
    }

    public void setWartosc2Id(int wartosc2Id) {
        this.wartosc2Id = wartosc2Id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Szczegoly2WartoscEntity that = (Szczegoly2WartoscEntity) o;

        if (szczegoly2Id != that.szczegoly2Id) return false;
        if (wartosc2Id != that.wartosc2Id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = szczegoly2Id;
        result = 31 * result + wartosc2Id;
        return result;
    }
}
