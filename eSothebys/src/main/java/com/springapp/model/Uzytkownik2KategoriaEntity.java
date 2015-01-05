package com.springapp.model;

import javax.persistence.*;

/**
 * Created by Alicja on 2015-01-05.
 */
@Entity
@Table(name = "uzytkownik2_kategoria", schema = "", catalog = "esothebys_db")
@IdClass(Uzytkownik2KategoriaEntityPK.class)
public class Uzytkownik2KategoriaEntity {
    private int uzytkownik2Id;
    private int kategoria2Id;

    @Id
    @Column(name = "Uzytkownik2ID")
    public int getUzytkownik2Id() {
        return uzytkownik2Id;
    }

    public void setUzytkownik2Id(int uzytkownik2Id) {
        this.uzytkownik2Id = uzytkownik2Id;
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

        Uzytkownik2KategoriaEntity that = (Uzytkownik2KategoriaEntity) o;

        if (kategoria2Id != that.kategoria2Id) return false;
        if (uzytkownik2Id != that.uzytkownik2Id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = uzytkownik2Id;
        result = 31 * result + kategoria2Id;
        return result;
    }
}
