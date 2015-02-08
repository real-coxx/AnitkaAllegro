package com.springapp.model;

import javax.persistence.*;

/**
 * Created by Alicja on 2015-01-05.
 */
@Entity
@Table(name = "danedowysylki", schema = "", catalog = "esothebys_db")
public class DanedowysylkiEntity {
    private int id;
    private String imie;
    private String nazwisko;
    private String firma;
    private UzytkownikEntity uzytkownik;
    private AdresEntity adresDoWysylki;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Imie")
    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    @Basic
    @Column(name = "Nazwisko")
    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Basic
    @Column(name = "Firma")
    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    @ManyToOne (cascade=CascadeType.ALL)
    @JoinColumn(name="Uzytkownik")
    public UzytkownikEntity getUzytkownik() {
        return uzytkownik;
    }

    public void setUzytkownik(UzytkownikEntity uzytkownik) {
        this.uzytkownik = uzytkownik;
    }

    @OneToOne (cascade=CascadeType.ALL)
    @JoinColumn(name="AdresDoWysylki")
    public AdresEntity getAdresDoWysylki() {
        return adresDoWysylki;
    }

    public void setAdresDoWysylki(AdresEntity adresDoWysylki) {
        this.adresDoWysylki = adresDoWysylki;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DanedowysylkiEntity that = (DanedowysylkiEntity) o;

        if (id != that.id) return false;
        if (firma != null ? !firma.equals(that.firma) : that.firma != null) return false;
        if (imie != null ? !imie.equals(that.imie) : that.imie != null) return false;
        if (nazwisko != null ? !nazwisko.equals(that.nazwisko) : that.nazwisko != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (imie != null ? imie.hashCode() : 0);
        result = 31 * result + (nazwisko != null ? nazwisko.hashCode() : 0);
        result = 31 * result + (firma != null ? firma.hashCode() : 0);
        return result;
    }
}
