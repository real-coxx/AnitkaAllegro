package com.springapp.model;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Alicja on 2015-01-05.
 */
@Entity
@Table(name = "graficznaocenasprzedazy", schema = "", catalog = "esothebys_db")
public class GraficznaocenasprzedazyEntity {
    private int id;
    private Date dataWystawienia;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "DataWystawienia")
    public Date getDataWystawienia() {
        return dataWystawienia;
    }

    public void setDataWystawienia(Date dataWystawienia) {
        this.dataWystawienia = dataWystawienia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GraficznaocenasprzedazyEntity that = (GraficznaocenasprzedazyEntity) o;

        if (id != that.id) return false;
        if (dataWystawienia != null ? !dataWystawienia.equals(that.dataWystawienia) : that.dataWystawienia != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (dataWystawienia != null ? dataWystawienia.hashCode() : 0);
        return result;
    }
}
