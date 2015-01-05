package com.springapp.model;

import javax.persistence.*;

/**
 * Created by Alicja on 2015-01-05.
 */
@Entity
@Table(name = "formasprzedazy", schema = "", catalog = "esothebys_db")
public class FormasprzedazyEntity {
    private int id;
    private Integer wszystkie;
    private Integer tylkoLicytacje;
    private Integer tylkoKupTeraz;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Wszystkie")
    public Integer getWszystkie() {
        return wszystkie;
    }

    public void setWszystkie(Integer wszystkie) {
        this.wszystkie = wszystkie;
    }

    @Basic
    @Column(name = "TylkoLicytacje")
    public Integer getTylkoLicytacje() {
        return tylkoLicytacje;
    }

    public void setTylkoLicytacje(Integer tylkoLicytacje) {
        this.tylkoLicytacje = tylkoLicytacje;
    }

    @Basic
    @Column(name = "TylkoKupTeraz")
    public Integer getTylkoKupTeraz() {
        return tylkoKupTeraz;
    }

    public void setTylkoKupTeraz(Integer tylkoKupTeraz) {
        this.tylkoKupTeraz = tylkoKupTeraz;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FormasprzedazyEntity that = (FormasprzedazyEntity) o;

        if (id != that.id) return false;
        if (tylkoKupTeraz != null ? !tylkoKupTeraz.equals(that.tylkoKupTeraz) : that.tylkoKupTeraz != null)
            return false;
        if (tylkoLicytacje != null ? !tylkoLicytacje.equals(that.tylkoLicytacje) : that.tylkoLicytacje != null)
            return false;
        if (wszystkie != null ? !wszystkie.equals(that.wszystkie) : that.wszystkie != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (wszystkie != null ? wszystkie.hashCode() : 0);
        result = 31 * result + (tylkoLicytacje != null ? tylkoLicytacje.hashCode() : 0);
        result = 31 * result + (tylkoKupTeraz != null ? tylkoKupTeraz.hashCode() : 0);
        return result;
    }
}
