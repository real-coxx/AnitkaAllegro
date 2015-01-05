package com.springapp.model;

import javax.persistence.*;

/**
 * Created by Alicja on 2015-01-05.
 */
@Entity
@Table(name = "rodzajaukcji", schema = "", catalog = "esothebys_db")
public class RodzajaukcjiEntity {
    private int id;
    private Integer licytacja;
    private Integer kupTeraz;
    private Integer licytacjaZKupTeraz;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Licytacja")
    public Integer getLicytacja() {
        return licytacja;
    }

    public void setLicytacja(Integer licytacja) {
        this.licytacja = licytacja;
    }

    @Basic
    @Column(name = "KupTeraz")
    public Integer getKupTeraz() {
        return kupTeraz;
    }

    public void setKupTeraz(Integer kupTeraz) {
        this.kupTeraz = kupTeraz;
    }

    @Basic
    @Column(name = "LicytacjaZKupTeraz")
    public Integer getLicytacjaZKupTeraz() {
        return licytacjaZKupTeraz;
    }

    public void setLicytacjaZKupTeraz(Integer licytacjaZKupTeraz) {
        this.licytacjaZKupTeraz = licytacjaZKupTeraz;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RodzajaukcjiEntity that = (RodzajaukcjiEntity) o;

        if (id != that.id) return false;
        if (kupTeraz != null ? !kupTeraz.equals(that.kupTeraz) : that.kupTeraz != null) return false;
        if (licytacja != null ? !licytacja.equals(that.licytacja) : that.licytacja != null) return false;
        if (licytacjaZKupTeraz != null ? !licytacjaZKupTeraz.equals(that.licytacjaZKupTeraz) : that.licytacjaZKupTeraz != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (licytacja != null ? licytacja.hashCode() : 0);
        result = 31 * result + (kupTeraz != null ? kupTeraz.hashCode() : 0);
        result = 31 * result + (licytacjaZKupTeraz != null ? licytacjaZKupTeraz.hashCode() : 0);
        return result;
    }
}
