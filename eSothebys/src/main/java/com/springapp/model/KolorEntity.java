package com.springapp.model;

import javax.persistence.*;

/**
 * Created by Alicja on 2015-01-05.
 */
@Entity
@Table(name = "kolor", schema = "", catalog = "esothebys_db")
public class KolorEntity {
    private int id;
    private Integer bialy;
    private Integer czarny;
    private Integer czerwony;
    private Integer niebieski;
    private Integer pomaranczowy;
    private Integer zielony;
    private Integer zolty;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Bialy")
    public Integer getBialy() {
        return bialy;
    }

    public void setBialy(Integer bialy) {
        this.bialy = bialy;
    }

    @Basic
    @Column(name = "Czarny")
    public Integer getCzarny() {
        return czarny;
    }

    public void setCzarny(Integer czarny) {
        this.czarny = czarny;
    }

    @Basic
    @Column(name = "Czerwony")
    public Integer getCzerwony() {
        return czerwony;
    }

    public void setCzerwony(Integer czerwony) {
        this.czerwony = czerwony;
    }

    @Basic
    @Column(name = "Niebieski")
    public Integer getNiebieski() {
        return niebieski;
    }

    public void setNiebieski(Integer niebieski) {
        this.niebieski = niebieski;
    }

    @Basic
    @Column(name = "Pomaranczowy")
    public Integer getPomaranczowy() {
        return pomaranczowy;
    }

    public void setPomaranczowy(Integer pomaranczowy) {
        this.pomaranczowy = pomaranczowy;
    }

    @Basic
    @Column(name = "Zielony")
    public Integer getZielony() {
        return zielony;
    }

    public void setZielony(Integer zielony) {
        this.zielony = zielony;
    }

    @Basic
    @Column(name = "Zolty")
    public Integer getZolty() {
        return zolty;
    }

    public void setZolty(Integer zolty) {
        this.zolty = zolty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KolorEntity that = (KolorEntity) o;

        if (id != that.id) return false;
        if (bialy != null ? !bialy.equals(that.bialy) : that.bialy != null) return false;
        if (czarny != null ? !czarny.equals(that.czarny) : that.czarny != null) return false;
        if (czerwony != null ? !czerwony.equals(that.czerwony) : that.czerwony != null) return false;
        if (niebieski != null ? !niebieski.equals(that.niebieski) : that.niebieski != null) return false;
        if (pomaranczowy != null ? !pomaranczowy.equals(that.pomaranczowy) : that.pomaranczowy != null) return false;
        if (zielony != null ? !zielony.equals(that.zielony) : that.zielony != null) return false;
        if (zolty != null ? !zolty.equals(that.zolty) : that.zolty != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (bialy != null ? bialy.hashCode() : 0);
        result = 31 * result + (czarny != null ? czarny.hashCode() : 0);
        result = 31 * result + (czerwony != null ? czerwony.hashCode() : 0);
        result = 31 * result + (niebieski != null ? niebieski.hashCode() : 0);
        result = 31 * result + (pomaranczowy != null ? pomaranczowy.hashCode() : 0);
        result = 31 * result + (zielony != null ? zielony.hashCode() : 0);
        result = 31 * result + (zolty != null ? zolty.hashCode() : 0);
        return result;
    }
}
