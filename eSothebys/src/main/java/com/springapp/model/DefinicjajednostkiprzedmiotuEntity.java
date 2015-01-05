package com.springapp.model;

import javax.persistence.*;

/**
 * Created by Alicja on 2015-01-05.
 */
@Entity
@Table(name = "definicjajednostkiprzedmiotu", schema = "", catalog = "esothebys_db")
public class DefinicjajednostkiprzedmiotuEntity {
    private int id;
    private Integer sztuka;
    private Integer komplet;
    private Integer para;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Sztuka")
    public Integer getSztuka() {
        return sztuka;
    }

    public void setSztuka(Integer sztuka) {
        this.sztuka = sztuka;
    }

    @Basic
    @Column(name = "Komplet")
    public Integer getKomplet() {
        return komplet;
    }

    public void setKomplet(Integer komplet) {
        this.komplet = komplet;
    }

    @Basic
    @Column(name = "Para")
    public Integer getPara() {
        return para;
    }

    public void setPara(Integer para) {
        this.para = para;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DefinicjajednostkiprzedmiotuEntity that = (DefinicjajednostkiprzedmiotuEntity) o;

        if (id != that.id) return false;
        if (komplet != null ? !komplet.equals(that.komplet) : that.komplet != null) return false;
        if (para != null ? !para.equals(that.para) : that.para != null) return false;
        if (sztuka != null ? !sztuka.equals(that.sztuka) : that.sztuka != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (sztuka != null ? sztuka.hashCode() : 0);
        result = 31 * result + (komplet != null ? komplet.hashCode() : 0);
        result = 31 * result + (para != null ? para.hashCode() : 0);
        return result;
    }
}
