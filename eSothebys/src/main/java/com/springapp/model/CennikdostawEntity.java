package com.springapp.model;

import javax.persistence.*;

/**
 * Created by Alicja on 2015-01-05.
 */
@Entity
@Table(name = "cennikdostaw", schema = "", catalog = "esothebys_db")
public class CennikdostawEntity {
    private int id;
    private String nazwa;
    private Boolean szablon;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Nazwa")
    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    @Basic
    @Column(name = "Szablon")
    public Boolean getSzablon() {
        return szablon;
    }

    public void setSzablon(Boolean szablon) {
        this.szablon = szablon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CennikdostawEntity that = (CennikdostawEntity) o;

        if (id != that.id) return false;
        if (nazwa != null ? !nazwa.equals(that.nazwa) : that.nazwa != null) return false;
        if (szablon != null ? !szablon.equals(that.szablon) : that.szablon != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nazwa != null ? nazwa.hashCode() : 0);
        result = 31 * result + (szablon != null ? szablon.hashCode() : 0);
        return result;
    }
}
