package com.springapp.model;

import javax.persistence.*;

/**
 * Created by Alicja on 2015-01-05.
 */
@Entity
@Table(name = "terminprzypomnienia", schema = "", catalog = "esothebys_db")
public class TerminprzypomnieniaEntity {
    private int id;
    private Integer min10;
    private Integer min20;
    private Integer min30;
    private Integer godz1;
    private Integer godz3;
    private Integer godz6;
    private Integer godz12;
    private Integer godz24;
    private Integer godz48;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Min10")
    public Integer getMin10() {
        return min10;
    }

    public void setMin10(Integer min10) {
        this.min10 = min10;
    }

    @Basic
    @Column(name = "Min20")
    public Integer getMin20() {
        return min20;
    }

    public void setMin20(Integer min20) {
        this.min20 = min20;
    }

    @Basic
    @Column(name = "Min30")
    public Integer getMin30() {
        return min30;
    }

    public void setMin30(Integer min30) {
        this.min30 = min30;
    }

    @Basic
    @Column(name = "Godz1")
    public Integer getGodz1() {
        return godz1;
    }

    public void setGodz1(Integer godz1) {
        this.godz1 = godz1;
    }

    @Basic
    @Column(name = "Godz3")
    public Integer getGodz3() {
        return godz3;
    }

    public void setGodz3(Integer godz3) {
        this.godz3 = godz3;
    }

    @Basic
    @Column(name = "Godz6")
    public Integer getGodz6() {
        return godz6;
    }

    public void setGodz6(Integer godz6) {
        this.godz6 = godz6;
    }

    @Basic
    @Column(name = "Godz12")
    public Integer getGodz12() {
        return godz12;
    }

    public void setGodz12(Integer godz12) {
        this.godz12 = godz12;
    }

    @Basic
    @Column(name = "Godz24")
    public Integer getGodz24() {
        return godz24;
    }

    public void setGodz24(Integer godz24) {
        this.godz24 = godz24;
    }

    @Basic
    @Column(name = "Godz48")
    public Integer getGodz48() {
        return godz48;
    }

    public void setGodz48(Integer godz48) {
        this.godz48 = godz48;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TerminprzypomnieniaEntity that = (TerminprzypomnieniaEntity) o;

        if (id != that.id) return false;
        if (godz1 != null ? !godz1.equals(that.godz1) : that.godz1 != null) return false;
        if (godz12 != null ? !godz12.equals(that.godz12) : that.godz12 != null) return false;
        if (godz24 != null ? !godz24.equals(that.godz24) : that.godz24 != null) return false;
        if (godz3 != null ? !godz3.equals(that.godz3) : that.godz3 != null) return false;
        if (godz48 != null ? !godz48.equals(that.godz48) : that.godz48 != null) return false;
        if (godz6 != null ? !godz6.equals(that.godz6) : that.godz6 != null) return false;
        if (min10 != null ? !min10.equals(that.min10) : that.min10 != null) return false;
        if (min20 != null ? !min20.equals(that.min20) : that.min20 != null) return false;
        if (min30 != null ? !min30.equals(that.min30) : that.min30 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (min10 != null ? min10.hashCode() : 0);
        result = 31 * result + (min20 != null ? min20.hashCode() : 0);
        result = 31 * result + (min30 != null ? min30.hashCode() : 0);
        result = 31 * result + (godz1 != null ? godz1.hashCode() : 0);
        result = 31 * result + (godz3 != null ? godz3.hashCode() : 0);
        result = 31 * result + (godz6 != null ? godz6.hashCode() : 0);
        result = 31 * result + (godz12 != null ? godz12.hashCode() : 0);
        result = 31 * result + (godz24 != null ? godz24.hashCode() : 0);
        result = 31 * result + (godz48 != null ? godz48.hashCode() : 0);
        return result;
    }
}
