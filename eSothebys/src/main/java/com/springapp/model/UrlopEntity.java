package com.springapp.model;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Alicja on 2015-01-05.
 */
@Entity
@Table(name = "urlop", schema = "", catalog = "esothebys_db")
public class UrlopEntity {
    private int id;
    private Date dataRozpoczecia;
    private Date dataZakonczenia;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "DataRozpoczecia")
    public Date getDataRozpoczecia() {
        return dataRozpoczecia;
    }

    public void setDataRozpoczecia(Date dataRozpoczecia) {
        this.dataRozpoczecia = dataRozpoczecia;
    }

    @Basic
    @Column(name = "DataZakonczenia")
    public Date getDataZakonczenia() {
        return dataZakonczenia;
    }

    public void setDataZakonczenia(Date dataZakonczenia) {
        this.dataZakonczenia = dataZakonczenia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UrlopEntity that = (UrlopEntity) o;

        if (id != that.id) return false;
        if (dataRozpoczecia != null ? !dataRozpoczecia.equals(that.dataRozpoczecia) : that.dataRozpoczecia != null)
            return false;
        if (dataZakonczenia != null ? !dataZakonczenia.equals(that.dataZakonczenia) : that.dataZakonczenia != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (dataRozpoczecia != null ? dataRozpoczecia.hashCode() : 0);
        result = 31 * result + (dataZakonczenia != null ? dataZakonczenia.hashCode() : 0);
        return result;
    }
}
