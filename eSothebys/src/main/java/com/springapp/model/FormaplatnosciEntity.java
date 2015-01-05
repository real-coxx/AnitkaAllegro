package com.springapp.model;

import javax.persistence.*;

/**
 * Created by Alicja on 2015-01-05.
 */
@Entity
@Table(name = "formaplatnosci", schema = "", catalog = "esothebys_db")
public class FormaplatnosciEntity {
    private int id;
    private Integer przyOdbiorze;
    private Integer payU;
    private Integer przelew;

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
    @Column(name = "PayU")
    public Integer getPayU() {
        return payU;
    }

    public void setPayU(Integer payU) {
        this.payU = payU;
    }

    @Basic
    @Column(name = "Przelew")
    public Integer getPrzelew() {
        return przelew;
    }

    public void setPrzelew(Integer przelew) {
        this.przelew = przelew;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FormaplatnosciEntity that = (FormaplatnosciEntity) o;

        if (id != that.id) return false;
        if (payU != null ? !payU.equals(that.payU) : that.payU != null) return false;
        if (przelew != null ? !przelew.equals(that.przelew) : that.przelew != null) return false;
        if (przyOdbiorze != null ? !przyOdbiorze.equals(that.przyOdbiorze) : that.przyOdbiorze != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (przyOdbiorze != null ? przyOdbiorze.hashCode() : 0);
        result = 31 * result + (payU != null ? payU.hashCode() : 0);
        result = 31 * result + (przelew != null ? przelew.hashCode() : 0);
        return result;
    }
}
