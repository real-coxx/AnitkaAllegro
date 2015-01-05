package com.springapp.model;

import javax.persistence.*;

/**
 * Created by Alicja on 2015-01-05.
 */
@Entity
@Table(name = "uzytkownik2_obszarsprzedazy", schema = "", catalog = "esothebys_db")
@IdClass(Uzytkownik2ObszarsprzedazyEntityPK.class)
public class Uzytkownik2ObszarsprzedazyEntity {
    private int uzytkownik2Id;
    private int obszarSprzedazy2Id;

    @Id
    @Column(name = "Uzytkownik2ID")
    public int getUzytkownik2Id() {
        return uzytkownik2Id;
    }

    public void setUzytkownik2Id(int uzytkownik2Id) {
        this.uzytkownik2Id = uzytkownik2Id;
    }

    @Id
    @Column(name = "ObszarSprzedazy2ID")
    public int getObszarSprzedazy2Id() {
        return obszarSprzedazy2Id;
    }

    public void setObszarSprzedazy2Id(int obszarSprzedazy2Id) {
        this.obszarSprzedazy2Id = obszarSprzedazy2Id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Uzytkownik2ObszarsprzedazyEntity that = (Uzytkownik2ObszarsprzedazyEntity) o;

        if (obszarSprzedazy2Id != that.obszarSprzedazy2Id) return false;
        if (uzytkownik2Id != that.uzytkownik2Id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = uzytkownik2Id;
        result = 31 * result + obszarSprzedazy2Id;
        return result;
    }
}
