package com.springapp.dto;

import com.springapp.builder.DaneDoWysylkiBuilder;
import com.springapp.model.AdresEntity;
import com.springapp.model.UzytkownikEntity;

/**
 * Created by Alicja on 2015-02-06.
 */
public class DaneDoWysylkiTO {

    private int id;
    private String imie;
    private String nazwisko;
    private String firma;
    private UzytkownikEntity uzytkownik;
    private AdresEntity adresDoWysylki;

    public DaneDoWysylkiTO(DaneDoWysylkiBuilder builder) {
        this.id = builder.getId();
        this.imie = builder.getImie();
        this.nazwisko = builder.getNazwisko();
        this.firma = builder.getFirma();
        this.uzytkownik = builder.getUzytkownik();
        this.adresDoWysylki = builder.getAdresDoWysylki();
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
