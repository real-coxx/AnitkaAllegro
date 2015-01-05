package com.springapp.model;

import javax.persistence.*;

/**
 * Created by Alicja on 2015-01-05.
 */
@Entity
@Table(name = "rabat", schema = "", catalog = "esothebys_db")
public class RabatEntity {
    private int id;
    private Integer wartosc;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Wartosc")
    public Integer getWartosc() {
        return wartosc;
    }

    public void setWartosc(Integer wartosc) {
        this.wartosc = wartosc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RabatEntity that = (RabatEntity) o;

        if (id != that.id) return false;
        if (wartosc != null ? !wartosc.equals(that.wartosc) : that.wartosc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (wartosc != null ? wartosc.hashCode() : 0);
        return result;
    }
}
