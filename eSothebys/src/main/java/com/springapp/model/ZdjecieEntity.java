package com.springapp.model;

import javax.persistence.*;

/**
 * Created by Alicja on 2015-01-05.
 */
@Entity
@Table(name = "zdjecie", schema = "", catalog = "esothebys_db")
public class ZdjecieEntity {
    private int id;
    private String opis;
    private String attribute;
    private AukcjaEntity aukcja;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Opis")
    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    @Basic
    @Column(name = "Attribute")
    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    @ManyToOne (cascade=CascadeType.ALL)
    @JoinColumn(name="Aukcja")
    public AukcjaEntity getAukcja() {
        return aukcja;
    }

    public void setAukcja(AukcjaEntity aukcja) {
        this.aukcja = aukcja;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ZdjecieEntity that = (ZdjecieEntity) o;

        if (id != that.id) return false;
        if (attribute != null ? !attribute.equals(that.attribute) : that.attribute != null) return false;
        if (opis != null ? !opis.equals(that.opis) : that.opis != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (opis != null ? opis.hashCode() : 0);
        result = 31 * result + (attribute != null ? attribute.hashCode() : 0);
        return result;
    }
}
