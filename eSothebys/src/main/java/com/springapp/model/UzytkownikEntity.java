package com.springapp.model;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Alicja on 2015-01-05.
 */
@Entity
@Table(name = "uzytkownik", schema = "", catalog = "esothebys_db")
public class UzytkownikEntity {
    private int id;
    private String login;
    private String haslo;
    private String status;
    private String imie;
    private String nazwisko;
    private String firma;
    private String pesel;
    private String email;
    private String telefon;
    private String drugiTelefon;
    private Date dataUrodzenia;
    private Integer wiek;
    private Date dataUtworzenia;
    private Date dataOstatniegoLogowania;
    private Integer punktacja;
    private String discriminator;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Login")
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Basic
    @Column(name = "Haslo")
    public String getHaslo() {
        return haslo;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }

    @Basic
    @Column(name = "Status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    @Basic
    @Column(name = "Pesel")
    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Basic
    @Column(name = "Email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "Telefon")
    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    @Basic
    @Column(name = "DrugiTelefon")
    public String getDrugiTelefon() {
        return drugiTelefon;
    }

    public void setDrugiTelefon(String drugiTelefon) {
        this.drugiTelefon = drugiTelefon;
    }

    @Basic
    @Column(name = "DataUrodzenia")
    public Date getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(Date dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    @Basic
    @Column(name = "Wiek")
    public Integer getWiek() {
        return wiek;
    }

    public void setWiek(Integer wiek) {
        this.wiek = wiek;
    }

    @Basic
    @Column(name = "DataUtworzenia")
    public Date getDataUtworzenia() {
        return dataUtworzenia;
    }

    public void setDataUtworzenia(Date dataUtworzenia) {
        this.dataUtworzenia = dataUtworzenia;
    }

    @Basic
    @Column(name = "DataOstatniegoLogowania")
    public Date getDataOstatniegoLogowania() {
        return dataOstatniegoLogowania;
    }

    public void setDataOstatniegoLogowania(Date dataOstatniegoLogowania) {
        this.dataOstatniegoLogowania = dataOstatniegoLogowania;
    }

    @Basic
    @Column(name = "Punktacja")
    public Integer getPunktacja() {
        return punktacja;
    }

    public void setPunktacja(Integer punktacja) {
        this.punktacja = punktacja;
    }

    @Basic
    @Column(name = "Discriminator")
    public String getDiscriminator() {
        return discriminator;
    }

    public void setDiscriminator(String discriminator) {
        this.discriminator = discriminator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UzytkownikEntity that = (UzytkownikEntity) o;

        if (id != that.id) return false;
        if (dataOstatniegoLogowania != null ? !dataOstatniegoLogowania.equals(that.dataOstatniegoLogowania) : that.dataOstatniegoLogowania != null)
            return false;
        if (dataUrodzenia != null ? !dataUrodzenia.equals(that.dataUrodzenia) : that.dataUrodzenia != null)
            return false;
        if (dataUtworzenia != null ? !dataUtworzenia.equals(that.dataUtworzenia) : that.dataUtworzenia != null)
            return false;
        if (discriminator != null ? !discriminator.equals(that.discriminator) : that.discriminator != null)
            return false;
        if (drugiTelefon != null ? !drugiTelefon.equals(that.drugiTelefon) : that.drugiTelefon != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (firma != null ? !firma.equals(that.firma) : that.firma != null) return false;
        if (haslo != null ? !haslo.equals(that.haslo) : that.haslo != null) return false;
        if (imie != null ? !imie.equals(that.imie) : that.imie != null) return false;
        if (login != null ? !login.equals(that.login) : that.login != null) return false;
        if (nazwisko != null ? !nazwisko.equals(that.nazwisko) : that.nazwisko != null) return false;
        if (pesel != null ? !pesel.equals(that.pesel) : that.pesel != null) return false;
        if (punktacja != null ? !punktacja.equals(that.punktacja) : that.punktacja != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (telefon != null ? !telefon.equals(that.telefon) : that.telefon != null) return false;
        if (wiek != null ? !wiek.equals(that.wiek) : that.wiek != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (login != null ? login.hashCode() : 0);
        result = 31 * result + (haslo != null ? haslo.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (imie != null ? imie.hashCode() : 0);
        result = 31 * result + (nazwisko != null ? nazwisko.hashCode() : 0);
        result = 31 * result + (firma != null ? firma.hashCode() : 0);
        result = 31 * result + (pesel != null ? pesel.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (telefon != null ? telefon.hashCode() : 0);
        result = 31 * result + (drugiTelefon != null ? drugiTelefon.hashCode() : 0);
        result = 31 * result + (dataUrodzenia != null ? dataUrodzenia.hashCode() : 0);
        result = 31 * result + (wiek != null ? wiek.hashCode() : 0);
        result = 31 * result + (dataUtworzenia != null ? dataUtworzenia.hashCode() : 0);
        result = 31 * result + (dataOstatniegoLogowania != null ? dataOstatniegoLogowania.hashCode() : 0);
        result = 31 * result + (punktacja != null ? punktacja.hashCode() : 0);
        result = 31 * result + (discriminator != null ? discriminator.hashCode() : 0);
        return result;
    }
}
