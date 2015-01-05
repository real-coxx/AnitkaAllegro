package com.springapp.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Alicja on 2015-01-05.
 */
public class Uzytkownik2UzytkownikEntityPK implements Serializable {
    private int uzytkownik2Id;
    private int uzytkownik2Id2;

    @Column(name = "Uzytkownik2ID")
    @Id
    public int getUzytkownik2Id() {
        return uzytkownik2Id;
    }

    public void setUzytkownik2Id(int uzytkownik2Id) {
        this.uzytkownik2Id = uzytkownik2Id;
    }

    @Column(name = "Uzytkownik2ID2")
    @Id
    public int getUzytkownik2Id2() {
        return uzytkownik2Id2;
    }

    public void setUzytkownik2Id2(int uzytkownik2Id2) {
        this.uzytkownik2Id2 = uzytkownik2Id2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Uzytkownik2UzytkownikEntityPK that = (Uzytkownik2UzytkownikEntityPK) o;

        if (uzytkownik2Id != that.uzytkownik2Id) return false;
        if (uzytkownik2Id2 != that.uzytkownik2Id2) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = uzytkownik2Id;
        result = 31 * result + uzytkownik2Id2;
        return result;
    }
}
