package com.springapp.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Alicja on 2015-01-05.
 */
public class Szczegoly2WartoscEntityPK implements Serializable {
    private int szczegoly2Id;
    private int wartosc2Id;

    @Column(name = "Szczegoly2ID")
    @Id
    public int getSzczegoly2Id() {
        return szczegoly2Id;
    }

    public void setSzczegoly2Id(int szczegoly2Id) {
        this.szczegoly2Id = szczegoly2Id;
    }

    @Column(name = "Wartosc2ID")
    @Id
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

        Szczegoly2WartoscEntityPK that = (Szczegoly2WartoscEntityPK) o;

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
