package com.springapp.model;

import javax.persistence.*;

/**
 * Created by Alicja on 2015-01-05.
 */
@Entity
@Table(name = "powodzgloszenia", schema = "", catalog = "esothebys_db")
public class PowodzgloszeniaEntity {
    private int id;
    private String tresc;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Tresc")
    public String getTresc() {
        return tresc;
    }

    public void setTresc(String tresc) {
        this.tresc = tresc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PowodzgloszeniaEntity that = (PowodzgloszeniaEntity) o;

        if (id != that.id) return false;
        if (tresc != null ? !tresc.equals(that.tresc) : that.tresc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (tresc != null ? tresc.hashCode() : 0);
        return result;
    }
}
