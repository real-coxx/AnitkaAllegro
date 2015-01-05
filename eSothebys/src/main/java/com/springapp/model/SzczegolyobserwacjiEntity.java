package com.springapp.model;

import javax.persistence.*;

/**
 * Created by Alicja on 2015-01-05.
 */
@Entity
@Table(name = "szczegolyobserwacji", schema = "", catalog = "esothebys_db")
public class SzczegolyobserwacjiEntity {
    private int id;
    private Integer przypomnienie;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Przypomnienie")
    public Integer getPrzypomnienie() {
        return przypomnienie;
    }

    public void setPrzypomnienie(Integer przypomnienie) {
        this.przypomnienie = przypomnienie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SzczegolyobserwacjiEntity that = (SzczegolyobserwacjiEntity) o;

        if (id != that.id) return false;
        if (przypomnienie != null ? !przypomnienie.equals(that.przypomnienie) : that.przypomnienie != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (przypomnienie != null ? przypomnienie.hashCode() : 0);
        return result;
    }
}
