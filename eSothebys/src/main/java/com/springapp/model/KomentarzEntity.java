package com.springapp.model;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Alicja on 2015-01-05.
 */
@Entity
@Table(name = "komentarz", schema = "", catalog = "esothebys_db")
public class KomentarzEntity {
    private int id;
    private Integer rodzaj;
    private String tresc;
    private Date dataWystawienia;
    private Boolean uniewazniony;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Rodzaj")
    public Integer getRodzaj() {
        return rodzaj;
    }

    public void setRodzaj(Integer rodzaj) {
        this.rodzaj = rodzaj;
    }

    @Basic
    @Column(name = "Tresc")
    public String getTresc() {
        return tresc;
    }

    public void setTresc(String tresc) {
        this.tresc = tresc;
    }

    @Basic
    @Column(name = "DataWystawienia")
    public Date getDataWystawienia() {
        return dataWystawienia;
    }

    public void setDataWystawienia(Date dataWystawienia) {
        this.dataWystawienia = dataWystawienia;
    }

    @Basic
    @Column(name = "Uniewazniony")
    public Boolean getUniewazniony() {
        return uniewazniony;
    }

    public void setUniewazniony(Boolean uniewazniony) {
        this.uniewazniony = uniewazniony;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KomentarzEntity that = (KomentarzEntity) o;

        if (id != that.id) return false;
        if (dataWystawienia != null ? !dataWystawienia.equals(that.dataWystawienia) : that.dataWystawienia != null)
            return false;
        if (rodzaj != null ? !rodzaj.equals(that.rodzaj) : that.rodzaj != null) return false;
        if (tresc != null ? !tresc.equals(that.tresc) : that.tresc != null) return false;
        if (uniewazniony != null ? !uniewazniony.equals(that.uniewazniony) : that.uniewazniony != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (rodzaj != null ? rodzaj.hashCode() : 0);
        result = 31 * result + (tresc != null ? tresc.hashCode() : 0);
        result = 31 * result + (dataWystawienia != null ? dataWystawienia.hashCode() : 0);
        result = 31 * result + (uniewazniony != null ? uniewazniony.hashCode() : 0);
        return result;
    }
}
