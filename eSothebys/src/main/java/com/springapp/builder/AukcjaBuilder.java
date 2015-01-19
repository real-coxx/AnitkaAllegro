package com.springapp.builder;

import java.util.Date;
import java.util.List;

/**
 * Created by Alicja on 2015-01-19.
 */
public class AukcjaBuilder {

    private int numer;
    private String tytul;
    private String opisPrzedmiotu;
    private int rodzajAukcji;
    private Date terminRozpoczecia;
    private int liczbaPrzedmiotow;
    private String jednostka;
    private double cenaKupTeraz;
    private int czasTrwania;
    private double cenaWywolawcza;
    private double cenaMinimalna;
    private Date terminZakonczenia;
    private String dodatkoweInformacjeODostawieIPlatnosci;
    private boolean kosztPrzesylkiPokrywaKupujacy;
    private boolean wysylkaZaGranice;
    private boolean fakturaVAT;
    private String terminWysylki;
    private int formaPlatnosci;
    private String numerKonta1;
    private String numerKonta2;
    private boolean szablon;
    private int liczbaOdwiedzin;
    private Date terminOstatnichOdwiedzin;
    private int liczbaDostepnychPrzedmiotow;
    private double aktualnaCena;
    private double oplata;
    private double oplataFinalna;

    public AukcjaBuilder setNumer(int numer) {
        this.numer = numer;
        return this;
    }

    public AukcjaBuilder setTytul(String tytul) {
        this.tytul = tytul;
        return this;
    }

    public AukcjaBuilder setOpisPrzedmiotu(String opisPrzedmiotu) {
        this.opisPrzedmiotu = opisPrzedmiotu;
        return this;
    }

    public AukcjaBuilder setRodzajAukcji(int rodzajAukcji) {
        this.rodzajAukcji = rodzajAukcji;
        return this;
    }

    public AukcjaBuilder setTerminRozpoczecia(Date terminRozpoczecia) {
        this.terminRozpoczecia = terminRozpoczecia;
        return this;
    }

    public AukcjaBuilder setLiczbaPrzedmiotow(int liczbaPrzedmiotow) {
        this.liczbaPrzedmiotow = liczbaPrzedmiotow;
        return this;
    }

    public AukcjaBuilder setJednostka(String jednostka) {
        this.jednostka = jednostka;
        return this;
    }

    public AukcjaBuilder setCenaKupTeraz(double cenaKupTeraz) {
        this.cenaKupTeraz = cenaKupTeraz;
        return this;
    }

    public AukcjaBuilder setCzasTrwania(int czasTrwania) {
        this.czasTrwania = czasTrwania;
        return this;
    }

    public AukcjaBuilder setCenaWywolawcza(double cenaWywolawcza) {
        this.cenaWywolawcza = cenaWywolawcza;
        return this;
    }

    public AukcjaBuilder setCenaMinimalna(double cenaMinimalna) {
        this.cenaMinimalna = cenaMinimalna;
        return this;
    }

    public AukcjaBuilder setTerminZakonczenia(Date terminZakonczenia) {
        this.terminZakonczenia = terminZakonczenia;
        return this;
    }

    public AukcjaBuilder setDodatkoweInformacjeODostawieIPlatnosci(String dodatkoweInformacjeODostawieIPlatnosci) {
        this.dodatkoweInformacjeODostawieIPlatnosci = dodatkoweInformacjeODostawieIPlatnosci;
        return this;
    }

    public AukcjaBuilder setKosztPrzesylkiPokrywaKupujacy(boolean kosztPrzesylkiPokrywaKupujacy) {
        this.kosztPrzesylkiPokrywaKupujacy = kosztPrzesylkiPokrywaKupujacy;
        return this;
    }

    public AukcjaBuilder setWysylkaZaGranice(boolean wysylkaZaGranice) {
        this.wysylkaZaGranice = wysylkaZaGranice;
        return this;
    }

    public AukcjaBuilder setFakturaVAT(boolean fakturaVAT) {
        this.fakturaVAT = fakturaVAT;
        return this;
    }

    public AukcjaBuilder setTerminWysylki(String terminWysylki) {
        this.terminWysylki = terminWysylki;
        return this;
    }

    public AukcjaBuilder setFormaPlatnosci(int formaPlatnosci) {
        this.formaPlatnosci = formaPlatnosci;
        return this;
    }

    public AukcjaBuilder setNumerKonta1(String numerKonta1) {
        this.numerKonta1 = numerKonta1;
        return this;
    }

    public AukcjaBuilder setNumerKonta2(String numerKonta2) {
        this.numerKonta2 = numerKonta2;
        return this;
    }

    public AukcjaBuilder setSzablon(boolean szablon) {
        this.szablon = szablon;
        return this;
    }

    public AukcjaBuilder setLiczbaOdwiedzin(int liczbaOdwiedzin) {
        this.liczbaOdwiedzin = liczbaOdwiedzin;
        return this;
    }

    public AukcjaBuilder setTerminOstatnichOdwiedzin(Date terminOstatnichOdwiedzin) {
        this.terminOstatnichOdwiedzin = terminOstatnichOdwiedzin;
        return this;
    }

    public AukcjaBuilder setLiczbaDostepnychPrzedmiotow(int liczbaDostepnychPrzedmiotow) {
        this.liczbaDostepnychPrzedmiotow = liczbaDostepnychPrzedmiotow;
        return this;
    }

    public AukcjaBuilder setAktualnaCena(double aktualnaCena) {
        this.aktualnaCena = aktualnaCena;
        return this;
    }

    public AukcjaBuilder setOplata(double oplata) {
        this.oplata = oplata;
        return this;
    }

    public AukcjaBuilder setOplataFinalna(double oplataFinalna) {
        this.oplataFinalna = oplataFinalna;
        return this;
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

    public Date getTerminZakonczenia() {
        return terminZakonczenia;
    }

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
}
