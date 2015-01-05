package com.springapp.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Alicja on 2015-01-05.
 */
public class Uzytkownik2PowiadomienieEntityPK implements Serializable {
    private int uzytkownik2Id;
    private int powiadomienie2Id;

    @Column(name = "Uzytkownik2ID")
    @Id
    public int getUzytkownik2Id() {
        return uzytkownik2Id;
    }

    public void setUzytkownik2Id(int uzytkownik2Id) {
        this.uzytkownik2Id = uzytkownik2Id;
    }

    @Column(name = "Powiadomienie2ID")
    @Id
    public int getPowiadomienie2Id() {
        return powiadomienie2Id;
    }

    public void setPowiadomienie2Id(int powiadomienie2Id) {
        this.powiadomienie2Id = powiadomienie2Id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Uzytkownik2PowiadomienieEntityPK that = (Uzytkownik2PowiadomienieEntityPK) o;

        if (powiadomienie2Id != that.powiadomienie2Id) return false;
        if (uzytkownik2Id != that.uzytkownik2Id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = uzytkownik2Id;
        result = 31 * result + powiadomienie2Id;
        return result;
    }
}
