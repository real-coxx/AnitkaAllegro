package com.springapp.model;

import javax.persistence.*;

/**
 * Created by Alicja on 2015-01-05.
 */
@Entity
@Table(name = "sposobwyszukiwaniaslow", schema = "", catalog = "esothebys_db")
public class SposobwyszukiwaniaslowEntity {
    private int id;
    private Integer wszystkieSlowa;
    private Integer ktorekolwiekZeSlow;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "WszystkieSlowa")
    public Integer getWszystkieSlowa() {
        return wszystkieSlowa;
    }

    public void setWszystkieSlowa(Integer wszystkieSlowa) {
        this.wszystkieSlowa = wszystkieSlowa;
    }

    @Basic
    @Column(name = "KtorekolwiekZeSlow")
    public Integer getKtorekolwiekZeSlow() {
        return ktorekolwiekZeSlow;
    }

    public void setKtorekolwiekZeSlow(Integer ktorekolwiekZeSlow) {
        this.ktorekolwiekZeSlow = ktorekolwiekZeSlow;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SposobwyszukiwaniaslowEntity that = (SposobwyszukiwaniaslowEntity) o;

        if (id != that.id) return false;
        if (ktorekolwiekZeSlow != null ? !ktorekolwiekZeSlow.equals(that.ktorekolwiekZeSlow) : that.ktorekolwiekZeSlow != null)
            return false;
        if (wszystkieSlowa != null ? !wszystkieSlowa.equals(that.wszystkieSlowa) : that.wszystkieSlowa != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (wszystkieSlowa != null ? wszystkieSlowa.hashCode() : 0);
        result = 31 * result + (ktorekolwiekZeSlow != null ? ktorekolwiekZeSlow.hashCode() : 0);
        return result;
    }
}
