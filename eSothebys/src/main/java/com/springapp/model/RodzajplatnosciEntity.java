package com.springapp.model;

import javax.persistence.*;

/**
 * Created by Alicja on 2015-01-05.
 */
@Entity
@Table(name = "rodzajplatnosci", schema = "", catalog = "esothebys_db")
public class RodzajplatnosciEntity {
    private int id;
    private Integer przyOdbiorze;
    private Integer zGory;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "PrzyOdbiorze")
    public Integer getPrzyOdbiorze() {
        return przyOdbiorze;
    }

    public void setPrzyOdbiorze(Integer przyOdbiorze) {
        this.przyOdbiorze = przyOdbiorze;
    }

    @Basic
    @Column(name = "ZGory")
    public Integer getzGory() {
        return zGory;
    }

    public void setzGory(Integer zGory) {
        this.zGory = zGory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RodzajplatnosciEntity that = (RodzajplatnosciEntity) o;

        if (id != that.id) return false;
        if (przyOdbiorze != null ? !przyOdbiorze.equals(that.przyOdbiorze) : that.przyOdbiorze != null) return false;
        if (zGory != null ? !zGory.equals(that.zGory) : that.zGory != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (przyOdbiorze != null ? przyOdbiorze.hashCode() : 0);
        result = 31 * result + (zGory != null ? zGory.hashCode() : 0);
        return result;
    }
}
