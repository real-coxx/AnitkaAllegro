package com.springapp.model;

import javax.persistence.*;

/**
 * Created by Alicja on 2015-01-05.
 */
@Entity
@Table(name = "kryteriumwyszukiwaniaaukcji", schema = "", catalog = "esothebys_db")
public class KryteriumwyszukiwaniaaukcjiEntity {
    private int id;
    private String szukaneSlowa;
    private Integer sposobWyszukiwania;
    private Boolean rowniezWOpisach;
    private String pomijaneSlowa;
    private Integer cenaMin;
    private Integer cenaMax;
    private Integer typLokalizacji;
    private String miejscowosc;
    private Integer formaSprzedazy;
    private Boolean odbiorOsobisty;
    private Boolean payU;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "SzukaneSlowa")
    public String getSzukaneSlowa() {
        return szukaneSlowa;
    }

    public void setSzukaneSlowa(String szukaneSlowa) {
        this.szukaneSlowa = szukaneSlowa;
    }

    @Basic
    @Column(name = "SposobWyszukiwania")
    public Integer getSposobWyszukiwania() {
        return sposobWyszukiwania;
    }

    public void setSposobWyszukiwania(Integer sposobWyszukiwania) {
        this.sposobWyszukiwania = sposobWyszukiwania;
    }

    @Basic
    @Column(name = "RowniezWOpisach")
    public Boolean getRowniezWOpisach() {
        return rowniezWOpisach;
    }

    public void setRowniezWOpisach(Boolean rowniezWOpisach) {
        this.rowniezWOpisach = rowniezWOpisach;
    }

    @Basic
    @Column(name = "PomijaneSlowa")
    public String getPomijaneSlowa() {
        return pomijaneSlowa;
    }

    public void setPomijaneSlowa(String pomijaneSlowa) {
        this.pomijaneSlowa = pomijaneSlowa;
    }

    @Basic
    @Column(name = "CenaMin")
    public Integer getCenaMin() {
        return cenaMin;
    }

    public void setCenaMin(Integer cenaMin) {
        this.cenaMin = cenaMin;
    }

    @Basic
    @Column(name = "CenaMax")
    public Integer getCenaMax() {
        return cenaMax;
    }

    public void setCenaMax(Integer cenaMax) {
        this.cenaMax = cenaMax;
    }

    @Basic
    @Column(name = "TypLokalizacji")
    public Integer getTypLokalizacji() {
        return typLokalizacji;
    }

    public void setTypLokalizacji(Integer typLokalizacji) {
        this.typLokalizacji = typLokalizacji;
    }

    @Basic
    @Column(name = "Miejscowosc")
    public String getMiejscowosc() {
        return miejscowosc;
    }

    public void setMiejscowosc(String miejscowosc) {
        this.miejscowosc = miejscowosc;
    }

    @Basic
    @Column(name = "FormaSprzedazy")
    public Integer getFormaSprzedazy() {
        return formaSprzedazy;
    }

    public void setFormaSprzedazy(Integer formaSprzedazy) {
        this.formaSprzedazy = formaSprzedazy;
    }

    @Basic
    @Column(name = "OdbiorOsobisty")
    public Boolean getOdbiorOsobisty() {
        return odbiorOsobisty;
    }

    public void setOdbiorOsobisty(Boolean odbiorOsobisty) {
        this.odbiorOsobisty = odbiorOsobisty;
    }

    @Basic
    @Column(name = "PayU")
    public Boolean getPayU() {
        return payU;
    }

    public void setPayU(Boolean payU) {
        this.payU = payU;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KryteriumwyszukiwaniaaukcjiEntity that = (KryteriumwyszukiwaniaaukcjiEntity) o;

        if (id != that.id) return false;
        if (cenaMax != null ? !cenaMax.equals(that.cenaMax) : that.cenaMax != null) return false;
        if (cenaMin != null ? !cenaMin.equals(that.cenaMin) : that.cenaMin != null) return false;
        if (formaSprzedazy != null ? !formaSprzedazy.equals(that.formaSprzedazy) : that.formaSprzedazy != null)
            return false;
        if (miejscowosc != null ? !miejscowosc.equals(that.miejscowosc) : that.miejscowosc != null) return false;
        if (odbiorOsobisty != null ? !odbiorOsobisty.equals(that.odbiorOsobisty) : that.odbiorOsobisty != null)
            return false;
        if (payU != null ? !payU.equals(that.payU) : that.payU != null) return false;
        if (pomijaneSlowa != null ? !pomijaneSlowa.equals(that.pomijaneSlowa) : that.pomijaneSlowa != null)
            return false;
        if (rowniezWOpisach != null ? !rowniezWOpisach.equals(that.rowniezWOpisach) : that.rowniezWOpisach != null)
            return false;
        if (sposobWyszukiwania != null ? !sposobWyszukiwania.equals(that.sposobWyszukiwania) : that.sposobWyszukiwania != null)
            return false;
        if (szukaneSlowa != null ? !szukaneSlowa.equals(that.szukaneSlowa) : that.szukaneSlowa != null) return false;
        if (typLokalizacji != null ? !typLokalizacji.equals(that.typLokalizacji) : that.typLokalizacji != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (szukaneSlowa != null ? szukaneSlowa.hashCode() : 0);
        result = 31 * result + (sposobWyszukiwania != null ? sposobWyszukiwania.hashCode() : 0);
        result = 31 * result + (rowniezWOpisach != null ? rowniezWOpisach.hashCode() : 0);
        result = 31 * result + (pomijaneSlowa != null ? pomijaneSlowa.hashCode() : 0);
        result = 31 * result + (cenaMin != null ? cenaMin.hashCode() : 0);
        result = 31 * result + (cenaMax != null ? cenaMax.hashCode() : 0);
        result = 31 * result + (typLokalizacji != null ? typLokalizacji.hashCode() : 0);
        result = 31 * result + (miejscowosc != null ? miejscowosc.hashCode() : 0);
        result = 31 * result + (formaSprzedazy != null ? formaSprzedazy.hashCode() : 0);
        result = 31 * result + (odbiorOsobisty != null ? odbiorOsobisty.hashCode() : 0);
        result = 31 * result + (payU != null ? payU.hashCode() : 0);
        return result;
    }
}
