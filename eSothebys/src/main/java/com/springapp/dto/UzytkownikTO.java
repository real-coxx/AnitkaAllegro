package com.springapp.dto;

import com.springapp.builder.OfertaBuilder;
import com.springapp.builder.UzytkownikBuilder;
import com.springapp.model.*;

import java.sql.Date;

/**
 * Created by Alicja on 2015-01-22.
 */
public class UzytkownikTO {

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
    private UstawieniasprzedazyEntity ustawieniaSprzedazy;
    private KontofakturoweEntity kontoFakturowe;
    private SubskrypcjaEntity subskrypcja;
    private WniosekrejestracyjnyEntity wniosekRejestracyjny;
    private AdresEntity adres;

    public UzytkownikTO(UzytkownikBuilder builder) {
        this.id = builder.getId();
        this.login= builder.getLogin();
        this.haslo = builder.getHaslo();
        this.status = builder.getStatus();
        this.imie = builder.getImie();
        this.nazwisko = builder.getNazwisko();
        this.firma = builder.getFirma();
        this.pesel = builder.getPesel();
        this.email= builder.getEmail();
        this.telefon = builder.getTelefon();
        this.drugiTelefon = builder.getDrugiTelefon();
        this.dataUrodzenia = builder.getDataUrodzenia();
        this.wiek = builder.getWiek();
        this.dataUtworzenia = builder.getDataUtworzenia();
        this.dataOstatniegoLogowania = builder.getDataOstatniegoLogowania();
        this.punktacja = builder.getPunktacja();
        this.discriminator = builder.getDiscriminator();
        this.ustawieniaSprzedazy = builder.getUstawieniaSprzedazy();
        this.kontoFakturowe = builder.getKontoFakturowe();
        this.subskrypcja = builder.getSubskrypcja();
        this.wniosekRejestracyjny = builder.getWniosekRejestracyjny();
        this.adres= builder.getAdres();
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getHaslo() {
        return haslo;
    }

    public String getStatus() {
        return status;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getFirma() {
        return firma;
    }

    public String getPesel() {
        return pesel;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getDrugiTelefon() {
        return drugiTelefon;
    }

    public Date getDataUrodzenia() {
        return dataUrodzenia;
    }

    public Integer getWiek() {
        return wiek;
    }

    public Date getDataUtworzenia() {
        return dataUtworzenia;
    }

    public Date getDataOstatniegoLogowania() {
        return dataOstatniegoLogowania;
    }

    public Integer getPunktacja() {
        return punktacja;
    }

    public String getDiscriminator() {
        return discriminator;
    }

    public UstawieniasprzedazyEntity getUstawieniaSprzedazy() {
        return ustawieniaSprzedazy;
    }

    public KontofakturoweEntity getKontoFakturowe() {
        return kontoFakturowe;
    }

    public SubskrypcjaEntity getSubskrypcja() {
        return subskrypcja;
    }

    public WniosekrejestracyjnyEntity getWniosekRejestracyjny() {
        return wniosekRejestracyjny;
    }
    public AdresEntity getAdres() {
        return adres;
    }
}
