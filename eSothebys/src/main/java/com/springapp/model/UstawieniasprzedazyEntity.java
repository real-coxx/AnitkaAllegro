package com.springapp.model;

import javax.persistence.*;

/**
 * Created by Alicja on 2015-01-05.
 */
@Entity
@Table(name = "ustawieniasprzedazy", schema = "", catalog = "esothebys_db")
public class UstawieniasprzedazyEntity {
    private int id;
    private Integer numerKonta1;
    private Boolean widocznyNumerKonta1;
    private Integer numerKonta2;
    private Boolean widocznyNumerKonta2;
    private String wiadomoscDlaKupujacych;
    private Integer kolorZnakuWodnego;
    private Integer lokalizacjaZnakuWodnego;
    private Integer przezroczystoscZnakuWodnego;
    private Boolean domyslnieZnakWodny;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NumerKonta1")
    public Integer getNumerKonta1() {
        return numerKonta1;
    }

    public void setNumerKonta1(Integer numerKonta1) {
        this.numerKonta1 = numerKonta1;
    }

    @Basic
    @Column(name = "WidocznyNumerKonta1")
    public Boolean getWidocznyNumerKonta1() {
        return widocznyNumerKonta1;
    }

    public void setWidocznyNumerKonta1(Boolean widocznyNumerKonta1) {
        this.widocznyNumerKonta1 = widocznyNumerKonta1;
    }

    @Basic
    @Column(name = "NumerKonta2")
    public Integer getNumerKonta2() {
        return numerKonta2;
    }

    public void setNumerKonta2(Integer numerKonta2) {
        this.numerKonta2 = numerKonta2;
    }

    @Basic
    @Column(name = "WidocznyNumerKonta2")
    public Boolean getWidocznyNumerKonta2() {
        return widocznyNumerKonta2;
    }

    public void setWidocznyNumerKonta2(Boolean widocznyNumerKonta2) {
        this.widocznyNumerKonta2 = widocznyNumerKonta2;
    }

    @Basic
    @Column(name = "WiadomoscDlaKupujacych")
    public String getWiadomoscDlaKupujacych() {
        return wiadomoscDlaKupujacych;
    }

    public void setWiadomoscDlaKupujacych(String wiadomoscDlaKupujacych) {
        this.wiadomoscDlaKupujacych = wiadomoscDlaKupujacych;
    }

    @Basic
    @Column(name = "KolorZnakuWodnego")
    public Integer getKolorZnakuWodnego() {
        return kolorZnakuWodnego;
    }

    public void setKolorZnakuWodnego(Integer kolorZnakuWodnego) {
        this.kolorZnakuWodnego = kolorZnakuWodnego;
    }

    @Basic
    @Column(name = "LokalizacjaZnakuWodnego")
    public Integer getLokalizacjaZnakuWodnego() {
        return lokalizacjaZnakuWodnego;
    }

    public void setLokalizacjaZnakuWodnego(Integer lokalizacjaZnakuWodnego) {
        this.lokalizacjaZnakuWodnego = lokalizacjaZnakuWodnego;
    }

    @Basic
    @Column(name = "PrzezroczystoscZnakuWodnego")
    public Integer getPrzezroczystoscZnakuWodnego() {
        return przezroczystoscZnakuWodnego;
    }

    public void setPrzezroczystoscZnakuWodnego(Integer przezroczystoscZnakuWodnego) {
        this.przezroczystoscZnakuWodnego = przezroczystoscZnakuWodnego;
    }

    @Basic
    @Column(name = "DomyslnieZnakWodny")
    public Boolean getDomyslnieZnakWodny() {
        return domyslnieZnakWodny;
    }

    public void setDomyslnieZnakWodny(Boolean domyslnieZnakWodny) {
        this.domyslnieZnakWodny = domyslnieZnakWodny;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UstawieniasprzedazyEntity that = (UstawieniasprzedazyEntity) o;

        if (id != that.id) return false;
        if (domyslnieZnakWodny != null ? !domyslnieZnakWodny.equals(that.domyslnieZnakWodny) : that.domyslnieZnakWodny != null)
            return false;
        if (kolorZnakuWodnego != null ? !kolorZnakuWodnego.equals(that.kolorZnakuWodnego) : that.kolorZnakuWodnego != null)
            return false;
        if (lokalizacjaZnakuWodnego != null ? !lokalizacjaZnakuWodnego.equals(that.lokalizacjaZnakuWodnego) : that.lokalizacjaZnakuWodnego != null)
            return false;
        if (numerKonta1 != null ? !numerKonta1.equals(that.numerKonta1) : that.numerKonta1 != null) return false;
        if (numerKonta2 != null ? !numerKonta2.equals(that.numerKonta2) : that.numerKonta2 != null) return false;
        if (przezroczystoscZnakuWodnego != null ? !przezroczystoscZnakuWodnego.equals(that.przezroczystoscZnakuWodnego) : that.przezroczystoscZnakuWodnego != null)
            return false;
        if (wiadomoscDlaKupujacych != null ? !wiadomoscDlaKupujacych.equals(that.wiadomoscDlaKupujacych) : that.wiadomoscDlaKupujacych != null)
            return false;
        if (widocznyNumerKonta1 != null ? !widocznyNumerKonta1.equals(that.widocznyNumerKonta1) : that.widocznyNumerKonta1 != null)
            return false;
        if (widocznyNumerKonta2 != null ? !widocznyNumerKonta2.equals(that.widocznyNumerKonta2) : that.widocznyNumerKonta2 != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (numerKonta1 != null ? numerKonta1.hashCode() : 0);
        result = 31 * result + (widocznyNumerKonta1 != null ? widocznyNumerKonta1.hashCode() : 0);
        result = 31 * result + (numerKonta2 != null ? numerKonta2.hashCode() : 0);
        result = 31 * result + (widocznyNumerKonta2 != null ? widocznyNumerKonta2.hashCode() : 0);
        result = 31 * result + (wiadomoscDlaKupujacych != null ? wiadomoscDlaKupujacych.hashCode() : 0);
        result = 31 * result + (kolorZnakuWodnego != null ? kolorZnakuWodnego.hashCode() : 0);
        result = 31 * result + (lokalizacjaZnakuWodnego != null ? lokalizacjaZnakuWodnego.hashCode() : 0);
        result = 31 * result + (przezroczystoscZnakuWodnego != null ? przezroczystoscZnakuWodnego.hashCode() : 0);
        result = 31 * result + (domyslnieZnakWodny != null ? domyslnieZnakWodny.hashCode() : 0);
        return result;
    }
}
