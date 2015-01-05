package com.springapp.model;

import javax.persistence.*;

/**
 * Created by Alicja on 2015-01-05.
 */
@Entity
@Table(name = "terminwysylki", schema = "", catalog = "esothebys_db")
public class TerminwysylkiEntity {
    private int id;
    private Integer natychmiast;
    private Integer godzin24;
    private Integer dni2;
    private Integer dni3;
    private Integer dni4;
    private Integer dni5;
    private Integer dni7;
    private Integer dni10;
    private Integer dni14;
    private Integer dni21;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Natychmiast")
    public Integer getNatychmiast() {
        return natychmiast;
    }

    public void setNatychmiast(Integer natychmiast) {
        this.natychmiast = natychmiast;
    }

    @Basic
    @Column(name = "Godzin24")
    public Integer getGodzin24() {
        return godzin24;
    }

    public void setGodzin24(Integer godzin24) {
        this.godzin24 = godzin24;
    }

    @Basic
    @Column(name = "Dni2")
    public Integer getDni2() {
        return dni2;
    }

    public void setDni2(Integer dni2) {
        this.dni2 = dni2;
    }

    @Basic
    @Column(name = "Dni3")
    public Integer getDni3() {
        return dni3;
    }

    public void setDni3(Integer dni3) {
        this.dni3 = dni3;
    }

    @Basic
    @Column(name = "Dni4")
    public Integer getDni4() {
        return dni4;
    }

    public void setDni4(Integer dni4) {
        this.dni4 = dni4;
    }

    @Basic
    @Column(name = "Dni5")
    public Integer getDni5() {
        return dni5;
    }

    public void setDni5(Integer dni5) {
        this.dni5 = dni5;
    }

    @Basic
    @Column(name = "Dni7")
    public Integer getDni7() {
        return dni7;
    }

    public void setDni7(Integer dni7) {
        this.dni7 = dni7;
    }

    @Basic
    @Column(name = "Dni10")
    public Integer getDni10() {
        return dni10;
    }

    public void setDni10(Integer dni10) {
        this.dni10 = dni10;
    }

    @Basic
    @Column(name = "Dni14")
    public Integer getDni14() {
        return dni14;
    }

    public void setDni14(Integer dni14) {
        this.dni14 = dni14;
    }

    @Basic
    @Column(name = "Dni21")
    public Integer getDni21() {
        return dni21;
    }

    public void setDni21(Integer dni21) {
        this.dni21 = dni21;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TerminwysylkiEntity that = (TerminwysylkiEntity) o;

        if (id != that.id) return false;
        if (dni10 != null ? !dni10.equals(that.dni10) : that.dni10 != null) return false;
        if (dni14 != null ? !dni14.equals(that.dni14) : that.dni14 != null) return false;
        if (dni2 != null ? !dni2.equals(that.dni2) : that.dni2 != null) return false;
        if (dni21 != null ? !dni21.equals(that.dni21) : that.dni21 != null) return false;
        if (dni3 != null ? !dni3.equals(that.dni3) : that.dni3 != null) return false;
        if (dni4 != null ? !dni4.equals(that.dni4) : that.dni4 != null) return false;
        if (dni5 != null ? !dni5.equals(that.dni5) : that.dni5 != null) return false;
        if (dni7 != null ? !dni7.equals(that.dni7) : that.dni7 != null) return false;
        if (godzin24 != null ? !godzin24.equals(that.godzin24) : that.godzin24 != null) return false;
        if (natychmiast != null ? !natychmiast.equals(that.natychmiast) : that.natychmiast != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (natychmiast != null ? natychmiast.hashCode() : 0);
        result = 31 * result + (godzin24 != null ? godzin24.hashCode() : 0);
        result = 31 * result + (dni2 != null ? dni2.hashCode() : 0);
        result = 31 * result + (dni3 != null ? dni3.hashCode() : 0);
        result = 31 * result + (dni4 != null ? dni4.hashCode() : 0);
        result = 31 * result + (dni5 != null ? dni5.hashCode() : 0);
        result = 31 * result + (dni7 != null ? dni7.hashCode() : 0);
        result = 31 * result + (dni10 != null ? dni10.hashCode() : 0);
        result = 31 * result + (dni14 != null ? dni14.hashCode() : 0);
        result = 31 * result + (dni21 != null ? dni21.hashCode() : 0);
        return result;
    }
}
