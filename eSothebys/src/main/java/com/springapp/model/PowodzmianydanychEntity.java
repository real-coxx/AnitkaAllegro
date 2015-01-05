package com.springapp.model;

import javax.persistence.*;

/**
 * Created by Alicja on 2015-01-05.
 */
@Entity
@Table(name = "powodzmianydanych", schema = "", catalog = "esothebys_db")
public class PowodzmianydanychEntity {
    private int id;
    private Integer zmianaStanuCywilnego;
    private Integer prawnieZatwierdzonaZmiana;
    private Integer bledniePodaneDane;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ZmianaStanuCywilnego")
    public Integer getZmianaStanuCywilnego() {
        return zmianaStanuCywilnego;
    }

    public void setZmianaStanuCywilnego(Integer zmianaStanuCywilnego) {
        this.zmianaStanuCywilnego = zmianaStanuCywilnego;
    }

    @Basic
    @Column(name = "PrawnieZatwierdzonaZmiana")
    public Integer getPrawnieZatwierdzonaZmiana() {
        return prawnieZatwierdzonaZmiana;
    }

    public void setPrawnieZatwierdzonaZmiana(Integer prawnieZatwierdzonaZmiana) {
        this.prawnieZatwierdzonaZmiana = prawnieZatwierdzonaZmiana;
    }

    @Basic
    @Column(name = "BledniePodaneDane")
    public Integer getBledniePodaneDane() {
        return bledniePodaneDane;
    }

    public void setBledniePodaneDane(Integer bledniePodaneDane) {
        this.bledniePodaneDane = bledniePodaneDane;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PowodzmianydanychEntity that = (PowodzmianydanychEntity) o;

        if (id != that.id) return false;
        if (bledniePodaneDane != null ? !bledniePodaneDane.equals(that.bledniePodaneDane) : that.bledniePodaneDane != null)
            return false;
        if (prawnieZatwierdzonaZmiana != null ? !prawnieZatwierdzonaZmiana.equals(that.prawnieZatwierdzonaZmiana) : that.prawnieZatwierdzonaZmiana != null)
            return false;
        if (zmianaStanuCywilnego != null ? !zmianaStanuCywilnego.equals(that.zmianaStanuCywilnego) : that.zmianaStanuCywilnego != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (zmianaStanuCywilnego != null ? zmianaStanuCywilnego.hashCode() : 0);
        result = 31 * result + (prawnieZatwierdzonaZmiana != null ? prawnieZatwierdzonaZmiana.hashCode() : 0);
        result = 31 * result + (bledniePodaneDane != null ? bledniePodaneDane.hashCode() : 0);
        return result;
    }
}
