package com.springapp.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Alicja on 2015-01-05.
 */
public class Aukcja2UzytkownikEntityPK implements Serializable {
    private int aukcja2Id;
    private int uzytkownik2Id;

    @Column(name = "Aukcja2ID")
    @Id
    public int getAukcja2Id() {
        return aukcja2Id;
    }

    public void setAukcja2Id(int aukcja2Id) {
        this.aukcja2Id = aukcja2Id;
    }

    @Column(name = "Uzytkownik2ID")
    @Id
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

        Aukcja2UzytkownikEntityPK that = (Aukcja2UzytkownikEntityPK) o;

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
