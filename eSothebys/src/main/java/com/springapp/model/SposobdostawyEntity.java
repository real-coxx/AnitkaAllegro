package com.springapp.model;

import javax.persistence.*;

/**
 * Created by Alicja on 2015-01-05.
 */
@Entity
@Table(name = "sposobdostawy", schema = "", catalog = "esothebys_db")
public class SposobdostawyEntity {
    private int id;
    private String nazwa;
    private Integer czasDostawy;
    private Integer rodzajPlatnosci;
    private Boolean edytowalny;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Nazwa")
    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    @Basic
    @Column(name = "CzasDostawy")
    public Integer getCzasDostawy() {
        return czasDostawy;
    }

    public void setCzasDostawy(Integer czasDostawy) {
        this.czasDostawy = czasDostawy;
    }

    @Basic
    @Column(name = "RodzajPlatnosci")
    public Integer getRodzajPlatnosci() {
        return rodzajPlatnosci;
    }

    public void setRodzajPlatnosci(Integer rodzajPlatnosci) {
        this.rodzajPlatnosci = rodzajPlatnosci;
    }

    @Basic
    @Column(name = "Edytowalny")
    public Boolean getEdytowalny() {
        return edytowalny;
    }

    public void setEdytowalny(Boolean edytowalny) {
        this.edytowalny = edytowalny;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SposobdostawyEntity that = (SposobdostawyEntity) o;

        if (id != that.id) return false;
        if (czasDostawy != null ? !czasDostawy.equals(that.czasDostawy) : that.czasDostawy != null) return false;
        if (edytowalny != null ? !edytowalny.equals(that.edytowalny) : that.edytowalny != null) return false;
        if (nazwa != null ? !nazwa.equals(that.nazwa) : that.nazwa != null) return false;
        if (rodzajPlatnosci != null ? !rodzajPlatnosci.equals(that.rodzajPlatnosci) : that.rodzajPlatnosci != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nazwa != null ? nazwa.hashCode() : 0);
        result = 31 * result + (czasDostawy != null ? czasDostawy.hashCode() : 0);
        result = 31 * result + (rodzajPlatnosci != null ? rodzajPlatnosci.hashCode() : 0);
        result = 31 * result + (edytowalny != null ? edytowalny.hashCode() : 0);
        return result;
    }
}
