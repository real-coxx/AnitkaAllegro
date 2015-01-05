package com.springapp.model;

import javax.persistence.*;

/**
 * Created by Alicja on 2015-01-05.
 */
@Entity
@Table(name = "aukcja2_uzytkownik", schema = "", catalog = "esothebys_db")
@IdClass(Aukcja2UzytkownikEntityPK.class)
public class Aukcja2UzytkownikEntity {
    private int aukcja2Id;
    private int uzytkownik2Id;

    @Id
    @Column(name = "Aukcja2ID")
    public int getAukcja2Id() {
        return aukcja2Id;
    }

    public void setAukcja2Id(int aukcja2Id) {
        this.aukcja2Id = aukcja2Id;
    }

    @Id
    @Column(name = "Uzytkownik2ID")
    public int getUzytkownik2Id() {
        return uzytkownik2Id;
    }

    public void setUzytkownik2Id(int uzytkownik2Id) {
        this.uzytkownik2Id = uzytkownik2Id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Aukcja2UzytkownikEntity that = (Aukcja2UzytkownikEntity) o;

        if (aukcja2Id != that.aukcja2Id) return false;
        if (uzytkownik2Id != that.uzytkownik2Id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = aukcja2Id;
        result = 31 * result + uzytkownik2Id;
        return result;
    }
}
