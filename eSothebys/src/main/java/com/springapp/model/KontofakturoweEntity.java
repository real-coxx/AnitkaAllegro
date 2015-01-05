package com.springapp.model;

import javax.persistence.*;

/**
 * Created by Alicja on 2015-01-05.
 */
@Entity
@Table(name = "kontofakturowe", schema = "", catalog = "esothebys_db")
public class KontofakturoweEntity {
    private int id;
    private String nip;
    private String nazwaDoFaktury;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Nip")
    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    @Basic
    @Column(name = "NazwaDoFaktury")
    public String getNazwaDoFaktury() {
        return nazwaDoFaktury;
    }

    public void setNazwaDoFaktury(String nazwaDoFaktury) {
        this.nazwaDoFaktury = nazwaDoFaktury;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KontofakturoweEntity that = (KontofakturoweEntity) o;

        if (id != that.id) return false;
        if (nazwaDoFaktury != null ? !nazwaDoFaktury.equals(that.nazwaDoFaktury) : that.nazwaDoFaktury != null)
            return false;
        if (nip != null ? !nip.equals(that.nip) : that.nip != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nip != null ? nip.hashCode() : 0);
        result = 31 * result + (nazwaDoFaktury != null ? nazwaDoFaktury.hashCode() : 0);
        return result;
    }
}
