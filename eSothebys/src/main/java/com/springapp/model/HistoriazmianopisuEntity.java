package com.springapp.model;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Alicja on 2015-01-05.
 */
@Entity
@Table(name = "historiazmianopisu", schema = "", catalog = "esothebys_db")
public class HistoriazmianopisuEntity {
    private int id;
    private String tresc;
    private Date dataModyfikacji;

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

    @Basic
    @Column(name = "DataModyfikacji")
    public Date getDataModyfikacji() {
        return dataModyfikacji;
    }

    public void setDataModyfikacji(Date dataModyfikacji) {
        this.dataModyfikacji = dataModyfikacji;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HistoriazmianopisuEntity that = (HistoriazmianopisuEntity) o;

        if (id != that.id) return false;
        if (dataModyfikacji != null ? !dataModyfikacji.equals(that.dataModyfikacji) : that.dataModyfikacji != null)
            return false;
        if (tresc != null ? !tresc.equals(that.tresc) : that.tresc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (tresc != null ? tresc.hashCode() : 0);
        result = 31 * result + (dataModyfikacji != null ? dataModyfikacji.hashCode() : 0);
        return result;
    }
}
