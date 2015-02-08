package com.springapp.builder;

import com.springapp.model.AdresEntity;
import com.springapp.model.UzytkownikEntity;

import java.util.Date;

/**
 * Created by Alicja on 2015-02-06.
 */
public class DaneDoWysylkiBuilder {

    private int id;
    private String imie;
    private String nazwisko;
    private String firma;
    private UzytkownikEntity uzytkownik;
    private AdresEntity adresDoWysylki;

    public DaneDoWysylkiBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public DaneDoWysylkiBuilder setImie(String imie) {
        this.imie = imie;
        return this;
    }

    public DaneDoWysylkiBuilder setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
        return this;
    }

    public DaneDoWysylkiBuilder setFirma(String firma) {
        this.firma = firma;
        return this;
    }

    public DaneDoWysylkiBuilder setUzytkownik(UzytkownikEntity uzytkownik) {
        this.uzytkownik = uzytkownik;
        return this;
    }

    public DaneDoWysylkiBuilder setAdresDoWysylki(AdresEntity adresDoWysylki) {
        this.adresDoWysylki = adresDoWysylki;
        return this;
    }

    public int getId() {
        return id;
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

    public UzytkownikEntity getUzytkownik() {
        return uzytkownik;
    }

    public AdresEntity getAdresDoWysylki() {
        return adresDoWysylki;
    }
}
