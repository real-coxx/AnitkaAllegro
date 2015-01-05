package com.springapp.model;

import javax.persistence.*;

/**
 * Created by Alicja on 2015-01-05.
 */
@Entity
@Table(name = "subskrypcjaulubionejkategorii", schema = "", catalog = "esothebys_db")
public class SubskrypcjaulubionejkategoriiEntity {
    private int id;
    private Boolean tylkoKupTeraz;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "TylkoKupTeraz")
    public Boolean getTylkoKupTeraz() {
        return tylkoKupTeraz;
    }

    public void setTylkoKupTeraz(Boolean tylkoKupTeraz) {
        this.tylkoKupTeraz = tylkoKupTeraz;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SubskrypcjaulubionejkategoriiEntity that = (SubskrypcjaulubionejkategoriiEntity) o;

        if (id != that.id) return false;
        if (tylkoKupTeraz != null ? !tylkoKupTeraz.equals(that.tylkoKupTeraz) : that.tylkoKupTeraz != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (tylkoKupTeraz != null ? tylkoKupTeraz.hashCode() : 0);
        return result;
    }
}
