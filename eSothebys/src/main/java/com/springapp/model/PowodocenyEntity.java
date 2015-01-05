package com.springapp.model;

import javax.persistence.*;

/**
 * Created by Alicja on 2015-01-05.
 */
@Entity
@Table(name = "powodoceny", schema = "", catalog = "esothebys_db")
public class PowodocenyEntity {
    private int id;
    private String powod;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Powod")
    public String getPowod() {
        return powod;
    }

    public void setPowod(String powod) {
        this.powod = powod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PowodocenyEntity that = (PowodocenyEntity) o;

        if (id != that.id) return false;
        if (powod != null ? !powod.equals(that.powod) : that.powod != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (powod != null ? powod.hashCode() : 0);
        return result;
    }
}
