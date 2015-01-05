package com.springapp.model;

import javax.persistence.*;

/**
 * Created by Alicja on 2015-01-05.
 */
@Entity
@Table(name = "rodzajkomentarza", schema = "", catalog = "esothebys_db")
public class RodzajkomentarzaEntity {
    private int id;
    private Integer pozytywny;
    private Integer neutralny;
    private Integer negatywny;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Pozytywny")
    public Integer getPozytywny() {
        return pozytywny;
    }

    public void setPozytywny(Integer pozytywny) {
        this.pozytywny = pozytywny;
    }

    @Basic
    @Column(name = "Neutralny")
    public Integer getNeutralny() {
        return neutralny;
    }

    public void setNeutralny(Integer neutralny) {
        this.neutralny = neutralny;
    }

    @Basic
    @Column(name = "Negatywny")
    public Integer getNegatywny() {
        return negatywny;
    }

    public void setNegatywny(Integer negatywny) {
        this.negatywny = negatywny;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RodzajkomentarzaEntity that = (RodzajkomentarzaEntity) o;

        if (id != that.id) return false;
        if (negatywny != null ? !negatywny.equals(that.negatywny) : that.negatywny != null) return false;
        if (neutralny != null ? !neutralny.equals(that.neutralny) : that.neutralny != null) return false;
        if (pozytywny != null ? !pozytywny.equals(that.pozytywny) : that.pozytywny != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (pozytywny != null ? pozytywny.hashCode() : 0);
        result = 31 * result + (neutralny != null ? neutralny.hashCode() : 0);
        result = 31 * result + (negatywny != null ? negatywny.hashCode() : 0);
        return result;
    }
}
