package com.springapp.model;

import javax.persistence.*;

/**
 * Created by Alicja on 2015-01-05.
 */
@Entity
@Table(name = "parametr2_kategoria", schema = "", catalog = "esothebys_db")
@IdClass(Parametr2KategoriaEntityPK.class)
public class Parametr2KategoriaEntity {
    private int parametr2Id;
    private int kategoria2Id;

    @Id
    @Column(name = "Parametr2ID")
    public int getParametr2Id() {
        return parametr2Id;
    }

    public void setParametr2Id(int parametr2Id) {
        this.parametr2Id = parametr2Id;
    }

    @Id
    @Column(name = "Kategoria2ID")
    public int getKategoria2Id() {
        return kategoria2Id;
    }

    public void setKategoria2Id(int kategoria2Id) {
        this.kategoria2Id = kategoria2Id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Parametr2KategoriaEntity that = (Parametr2KategoriaEntity) o;

        if (kategoria2Id != that.kategoria2Id) return false;
        if (parametr2Id != that.parametr2Id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = parametr2Id;
        result = 31 * result + kategoria2Id;
        return result;
    }
}
