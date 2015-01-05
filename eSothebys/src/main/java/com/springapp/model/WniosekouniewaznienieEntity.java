package com.springapp.model;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Alicja on 2015-01-05.
 */
@Entity
@Table(name = "wniosekouniewaznienie", schema = "", catalog = "esothebys_db")
public class WniosekouniewaznienieEntity {
    private int id;
    private Date dataZlozenia;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "DataZlozenia")
    public Date getDataZlozenia() {
        return dataZlozenia;
    }

    public void setDataZlozenia(Date dataZlozenia) {
        this.dataZlozenia = dataZlozenia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WniosekouniewaznienieEntity that = (WniosekouniewaznienieEntity) o;

        if (id != that.id) return false;
        if (dataZlozenia != null ? !dataZlozenia.equals(that.dataZlozenia) : that.dataZlozenia != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (dataZlozenia != null ? dataZlozenia.hashCode() : 0);
        return result;
    }
}
