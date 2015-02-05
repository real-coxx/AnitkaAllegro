package com.springapp.builder;

import com.springapp.model.*;

import java.sql.Date;

/**
 * Created by Alicja on 2015-01-22.
 */
public class UzytkownikBuilder {

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

    public UzytkownikBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public UzytkownikBuilder setLogin(String login) {
        this.login = login;
        return this;
    }

    public UzytkownikBuilder setHaslo(String haslo) {
        this.haslo = haslo;
        return this;
    }

    public UzytkownikBuilder setStatus(String status) {
        this.status = status;
        return this;
    }

    public UzytkownikBuilder setImie(String imie) {
        this.imie = imie;
        return this;
    }

    public UzytkownikBuilder setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
        return this;
    }

    public UzytkownikBuilder setFirma(String firma) {
        this.firma = firma;
        return this;
    }

    public UzytkownikBuilder setPesel(String pesel) {
        this.pesel = pesel;
        return this;
    }

    public UzytkownikBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public UzytkownikBuilder setTelefon(String telefon) {
        this.telefon = telefon;
        return this;
    }

    public UzytkownikBuilder setDrugiTelefon(String drugiTelefon) {
        this.drugiTelefon = drugiTelefon;
        return this;
    }

    public UzytkownikBuilder setDataUrodzenia(Date dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
        return this;
    }

    public UzytkownikBuilder setWiek(Integer wiek) {
        this.wiek = wiek;
        return this;
    }

    public UzytkownikBuilder setDataUtworzenia(Date dataUtworzenia) {
        this.dataUtworzenia = dataUtworzenia;
        return this;
    }

    public UzytkownikBuilder setDataOstatniegoLogowania(Date dataOstatniegoLogowania) {
        this.dataOstatniegoLogowania = dataOstatniegoLogowania;
        return this;
    }

    public UzytkownikBuilder setPunktacja(Integer punktacja) {
        this.punktacja = punktacja;
        return this;
    }

    public UzytkownikBuilder setDiscriminator(String discriminator) {
        this.discriminator = discriminator;
        return this;
    }

    public UzytkownikBuilder setUstawieniaSprzedazy(UstawieniasprzedazyEntity ustawieniaSprzedazy) {
        this.ustawieniaSprzedazy = ustawieniaSprzedazy;
        return this;
    }

    public UzytkownikBuilder setKontoFakturowe(KontofakturoweEntity kontoFakturowe) {
        this.kontoFakturowe = kontoFakturowe;
        return this;
    }

    public UzytkownikBuilder setSubskrypcja(SubskrypcjaEntity subskrypcja) {
        this.subskrypcja = subskrypcja;
        return this;
    }

    public UzytkownikBuilder setWniosekRejestracyjny(WniosekrejestracyjnyEntity wniosekRejestracyjny) {
        this.wniosekRejestracyjny = wniosekRejestracyjny;
        return this;
    }

    public UzytkownikBuilder setAdres(AdresEntity adres) {
        this.adres = adres;
        return this;
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
