package com.springapp.model;

import javax.persistence.*;

/**
 * Created by Alicja on 2015-01-05.
 */
@Entity
@Table(name = "szczegolywykluczenia", schema = "", catalog = "esothebys_db")
public class SzczegolywykluczeniaEntity {
    private int id;
    private String notatka;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Notatka")
    public String getNotatka() {
        return notatka;
    }

    public void setNotatka(String notatka) {
        this.notatka = notatka;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SzczegolywykluczeniaEntity that = (SzczegolywykluczeniaEntity) o;

        if (id != that.id) return false;
        if (notatka != null ? !notatka.equals(that.notatka) : that.notatka != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (notatka != null ? notatka.hashCode() : 0);
        return result;
    }
}
