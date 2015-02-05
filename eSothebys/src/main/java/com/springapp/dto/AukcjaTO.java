package com.springapp.dto;

import com.springapp.builder.AukcjaBuilder;
import com.springapp.model.*;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * Created by Alicja on 2015-01-19.
 */
public class AukcjaTO {

    private final int id;
    private final int numer;
    private final String tytul;
    private final String opisPrzedmiotu;
    private final int rodzajAukcji;
    private final Date terminRozpoczecia;
    private final int liczbaPrzedmiotow;
    private final String jednostka;
    private final double cenaKupTeraz;
    private final int czasTrwania;
    private final double cenaWywolawcza;
    private final double cenaMinimalna;
    private final Timestamp terminZakonczenia;
    private final String terminZakonczeniaTekst;
    private final String dodatkoweInformacjeODostawieIPlatnosci;
    private final boolean kosztPrzesylkiPokrywaKupujacy;
    private final boolean wysylkaZaGranice;
    private final boolean fakturaVAT;
    private final String terminWysylki;
    private final int formaPlatnosci;
    private final String numerKonta1;
    private final String numerKonta2;
    private final boolean szablon;
    private final int liczbaOdwiedzin;
    private final Date terminOstatnichOdwiedzin;
    private final int liczbaDostepnychPrzedmiotow;
    private final double aktualnaCena;
    private final double oplata;
    private final double oplataFinalna;
    private final KategoriaEntity kategoria;
    private final ZdjecieEntity miniatura;
    private final String stan;
    private final CennikdostawEntity cennikDostaw;
    private final UzytkownikEntity sprzedawca;
    private final AdresEntity adres;


    public AukcjaTO(AukcjaBuilder builder) {
        this.id = builder.getId();
        this.numer = builder.getNumer();
        this.tytul = builder.getTytul();
        this.opisPrzedmiotu = builder.getOpisPrzedmiotu();
        this.rodzajAukcji = builder.getRodzajAukcji();
        this.terminRozpoczecia = builder.getTerminRozpoczecia();
        this.liczbaPrzedmiotow = builder.getLiczbaPrzedmiotow();
        this.jednostka = builder.getJednostka();
        this.cenaKupTeraz = builder.getCenaKupTeraz();
        this.czasTrwania = builder.getCzasTrwania();
        this.cenaWywolawcza = builder.getCenaWywolawcza();
        this.cenaMinimalna = builder.getCenaMinimalna();
        this.terminZakonczenia = builder.getTerminZakonczenia();
        this.terminZakonczeniaTekst = builder.getTerminZakonczeniaTekst();
        this.dodatkoweInformacjeODostawieIPlatnosci = builder.getDodatkoweInformacjeODostawieIPlatnosci();
        this.kosztPrzesylkiPokrywaKupujacy = builder.isKosztPrzesylkiPokrywaKupujacy();
        this.wysylkaZaGranice = builder.isWysylkaZaGranice();
        this.fakturaVAT = builder.isFakturaVAT();
        this.terminWysylki = builder.getTerminWysylki();
        this.formaPlatnosci = builder.getFormaPlatnosci();
        this. numerKonta1 = builder.getNumerKonta1();
        this.numerKonta2 = builder.getNumerKonta2();
        this.szablon = builder.isSzablon();
        this.liczbaOdwiedzin = builder.getLiczbaOdwiedzin();
        this.terminOstatnichOdwiedzin = builder.getTerminOstatnichOdwiedzin();
        this.liczbaDostepnychPrzedmiotow = builder.getLiczbaDostepnychPrzedmiotow();
        this.aktualnaCena = builder.getAktualnaCena();
        this.oplata = builder.getOplata();
        this.oplataFinalna = builder.getOplataFinalna();
        this.kategoria = builder.getKategoria();
        this.miniatura = builder.getMiniatura();
        this.stan = builder.getStan();
        this.cennikDostaw = builder.getCennikDostaw();
        this.sprzedawca = builder.getSprzeawca();
        this.adres = builder.getAdres();
    }

    public int getId() {
        return id;
    }

    public String getTerminZakonczeniaTekst() {
        return terminZakonczeniaTekst;
    }

    public int getNumer() {
        return numer;
    }

    public String getTytul() {
        return tytul;
    }

    public String getOpisPrzedmiotu() {
        return opisPrzedmiotu;
    }

    public int getRodzajAukcji() {
        return rodzajAukcji;
    }

    public Date getTerminRozpoczecia() {
        return terminRozpoczecia;
    }

    public int getLiczbaPrzedmiotow() {
        return liczbaPrzedmiotow;
    }

    public String getJednostka() {
        return jednostka;
    }

    public double getCenaKupTeraz() {
        return cenaKupTeraz;
    }

    public int getCzasTrwania() {
        return czasTrwania;
    }

    public double getCenaWywolawcza() {
        return cenaWywolawcza;
    }

    public double getCenaMinimalna() {
        return cenaMinimalna;
    }

    public Timestamp getTerminZakonczenia() { return terminZakonczenia; }

    public String getterminZakonczeniaTekst() { return terminZakonczeniaTekst; }

    public String getDodatkoweInformacjeODostawieIPlatnosci() {
        return dodatkoweInformacjeODostawieIPlatnosci;
    }

    public boolean isKosztPrzesylkiPokrywaKupujacy() {
        return kosztPrzesylkiPokrywaKupujacy;
    }

    public boolean isWysylkaZaGranice() {
        return wysylkaZaGranice;
    }

    public boolean isFakturaVAT() {
        return fakturaVAT;
    }

    public String getTerminWysylki() {
        return terminWysylki;
    }

    public int getFormaPlatnosci() {
        return formaPlatnosci;
    }

    public String getNumerKonta1() {
        return numerKonta1;
    }

    public String getNumerKonta2() {
        return numerKonta2;
    }

    public boolean isSzablon() {
        return szablon;
    }

    public int getLiczbaOdwiedzin() {
        return liczbaOdwiedzin;
    }

    public Date getTerminOstatnichOdwiedzin() {
        return terminOstatnichOdwiedzin;
    }

    public int getLiczbaDostepnychPrzedmiotow() {
        return liczbaDostepnychPrzedmiotow;
    }

    public double getAktualnaCena() {
        return aktualnaCena;
    }

    public double getOplata() {
        return oplata;
    }

    public double getOplataFinalna() {
        return oplataFinalna;
    }

    public KategoriaEntity getKategoria() {
        return kategoria;
    }

    public ZdjecieEntity getMiniatura() {
        return miniatura;
    }

    public String getStan() {
        return stan;
    }

    public CennikdostawEntity getCennikDostaw() {
        return cennikDostaw;
    }
    public UzytkownikEntity getSprzedawca() {
        return sprzedawca;
    }
    public AdresEntity getAdres() {
        return adres;
    }
}
