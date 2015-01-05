package com.springapp.model;

import javax.persistence.*;

/**
 * Created by Alicja on 2015-01-05.
 */
@Entity
@Table(name = "typlokalizacji", schema = "", catalog = "esothebys_db")
public class TyplokalizacjiEntity {
    private int id;
    private Integer kraj;
    private Integer wojewodztwo;
    private Integer mojeWojewodztwo;
    private Integer mojaMiejscowosc;
    private Integer innaMiejscowosc;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Kraj")
    public Integer getKraj() {
        return kraj;
    }

    public void setKraj(Integer kraj) {
        this.kraj = kraj;
    }

    @Basic
    @Column(name = "Wojewodztwo")
    public Integer getWojewodztwo() {
        return wojewodztwo;
    }

    public void setWojewodztwo(Integer wojewodztwo) {
        this.wojewodztwo = wojewodztwo;
    }

    @Basic
    @Column(name = "MojeWojewodztwo")
    public Integer getMojeWojewodztwo() {
        return mojeWojewodztwo;
    }

    public void setMojeWojewodztwo(Integer mojeWojewodztwo) {
        this.mojeWojewodztwo = mojeWojewodztwo;
    }

    @Basic
    @Column(name = "MojaMiejscowosc")
    public Integer getMojaMiejscowosc() {
        return mojaMiejscowosc;
    }

    public void setMojaMiejscowosc(Integer mojaMiejscowosc) {
        this.mojaMiejscowosc = mojaMiejscowosc;
    }

    @Basic
    @Column(name = "InnaMiejscowosc")
    public Integer getInnaMiejscowosc() {
        return innaMiejscowosc;
    }

    public void setInnaMiejscowosc(Integer innaMiejscowosc) {
        this.innaMiejscowosc = innaMiejscowosc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TyplokalizacjiEntity that = (TyplokalizacjiEntity) o;

        if (id != that.id) return false;
        if (innaMiejscowosc != null ? !innaMiejscowosc.equals(that.innaMiejscowosc) : that.innaMiejscowosc != null)
            return false;
        if (kraj != null ? !kraj.equals(that.kraj) : that.kraj != null) return false;
        if (mojaMiejscowosc != null ? !mojaMiejscowosc.equals(that.mojaMiejscowosc) : that.mojaMiejscowosc != null)
            return false;
        if (mojeWojewodztwo != null ? !mojeWojewodztwo.equals(that.mojeWojewodztwo) : that.mojeWojewodztwo != null)
            return false;
        if (wojewodztwo != null ? !wojewodztwo.equals(that.wojewodztwo) : that.wojewodztwo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (kraj != null ? kraj.hashCode() : 0);
        result = 31 * result + (wojewodztwo != null ? wojewodztwo.hashCode() : 0);
        result = 31 * result + (mojeWojewodztwo != null ? mojeWojewodztwo.hashCode() : 0);
        result = 31 * result + (mojaMiejscowosc != null ? mojaMiejscowosc.hashCode() : 0);
        result = 31 * result + (innaMiejscowosc != null ? innaMiejscowosc.hashCode() : 0);
        return result;
    }
}
