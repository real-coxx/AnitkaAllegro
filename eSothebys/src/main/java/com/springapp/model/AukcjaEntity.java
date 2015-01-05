package com.springapp.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

/**
 * Created by Alicja on 2015-01-05.
 */
@Entity
@javax.persistence.Table(name = "aukcja", schema = "", catalog = "esothebys_db")
public class AukcjaEntity {
    private int id;

    @Id
    @javax.persistence.Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private Integer numer;

    @Basic
    @javax.persistence.Column(name = "Numer")
    public Integer getNumer() {
        return numer;
    }

    public void setNumer(Integer numer) {
        this.numer = numer;
    }

    private String tytul;

    @Basic
    @javax.persistence.Column(name = "Tytul")
    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    private String opisPrzedmiotu;

    @Basic
    @javax.persistence.Column(name = "OpisPrzedmiotu")
    public String getOpisPrzedmiotu() {
        return opisPrzedmiotu;
    }

    public void setOpisPrzedmiotu(String opisPrzedmiotu) {
        this.opisPrzedmiotu = opisPrzedmiotu;
    }

    private Integer rodzajAukcji;

    @Basic
    @javax.persistence.Column(name = "RodzajAukcji")
    public Integer getRodzajAukcji() {
        return rodzajAukcji;
    }

    public void setRodzajAukcji(Integer rodzajAukcji) {
        this.rodzajAukcji = rodzajAukcji;
    }

    private Date terminRozpoczecia;

    @Basic
    @javax.persistence.Column(name = "TerminRozpoczecia")
    public Date getTerminRozpoczecia() {
        return terminRozpoczecia;
    }

    public void setTerminRozpoczecia(Date terminRozpoczecia) {
        this.terminRozpoczecia = terminRozpoczecia;
    }

    private Integer liczbaPrzedmiotow;

    @Basic
    @javax.persistence.Column(name = "LiczbaPrzedmiotow")
    public Integer getLiczbaPrzedmiotow() {
        return liczbaPrzedmiotow;
    }

    public void setLiczbaPrzedmiotow(Integer liczbaPrzedmiotow) {
        this.liczbaPrzedmiotow = liczbaPrzedmiotow;
    }

    private Integer jednostka;

    @Basic
    @javax.persistence.Column(name = "Jednostka")
    public Integer getJednostka() {
        return jednostka;
    }

    public void setJednostka(Integer jednostka) {
        this.jednostka = jednostka;
    }

    private Integer cenaKupTeraz;

    @Basic
    @javax.persistence.Column(name = "CenaKupTeraz")
    public Integer getCenaKupTeraz() {
        return cenaKupTeraz;
    }

    public void setCenaKupTeraz(Integer cenaKupTeraz) {
        this.cenaKupTeraz = cenaKupTeraz;
    }

    private Integer czasTrwania;

    @Basic
    @javax.persistence.Column(name = "CzasTrwania")
    public Integer getCzasTrwania() {
        return czasTrwania;
    }

    public void setCzasTrwania(Integer czasTrwania) {
        this.czasTrwania = czasTrwania;
    }

    private Integer cenaWywolawcza;

    @Basic
    @javax.persistence.Column(name = "CenaWywolawcza")
    public Integer getCenaWywolawcza() {
        return cenaWywolawcza;
    }

    public void setCenaWywolawcza(Integer cenaWywolawcza) {
        this.cenaWywolawcza = cenaWywolawcza;
    }

    private Integer cenaMinimalna;

    @Basic
    @javax.persistence.Column(name = "CenaMinimalna")
    public Integer getCenaMinimalna() {
        return cenaMinimalna;
    }

    public void setCenaMinimalna(Integer cenaMinimalna) {
        this.cenaMinimalna = cenaMinimalna;
    }

    private Date terminZakonczenia;

    @Basic
    @javax.persistence.Column(name = "TerminZakonczenia")
    public Date getTerminZakonczenia() {
        return terminZakonczenia;
    }

    public void setTerminZakonczenia(Date terminZakonczenia) {
        this.terminZakonczenia = terminZakonczenia;
    }

    private String dodatkoweInformacjeODostawieIPlatnosci;

    @Basic
    @javax.persistence.Column(name = "DodatkoweInformacjeODostawieIPlatnosci")
    public String getDodatkoweInformacjeODostawieIPlatnosci() {
        return dodatkoweInformacjeODostawieIPlatnosci;
    }

    public void setDodatkoweInformacjeODostawieIPlatnosci(String dodatkoweInformacjeODostawieIPlatnosci) {
        this.dodatkoweInformacjeODostawieIPlatnosci = dodatkoweInformacjeODostawieIPlatnosci;
    }

    private Boolean kosztPrzesylkiPokrywaKupujacy;

    @Basic
    @javax.persistence.Column(name = "KosztPrzesylkiPokrywaKupujacy")
    public Boolean getKosztPrzesylkiPokrywaKupujacy() {
        return kosztPrzesylkiPokrywaKupujacy;
    }

    public void setKosztPrzesylkiPokrywaKupujacy(Boolean kosztPrzesylkiPokrywaKupujacy) {
        this.kosztPrzesylkiPokrywaKupujacy = kosztPrzesylkiPokrywaKupujacy;
    }

    private Boolean wysylkaZaGranice;

    @Basic
    @javax.persistence.Column(name = "WysylkaZaGranice")
    public Boolean getWysylkaZaGranice() {
        return wysylkaZaGranice;
    }

    public void setWysylkaZaGranice(Boolean wysylkaZaGranice) {
        this.wysylkaZaGranice = wysylkaZaGranice;
    }

    private Boolean fakturaVat;

    @Basic
    @javax.persistence.Column(name = "FakturaVAT")
    public Boolean getFakturaVat() {
        return fakturaVat;
    }

    public void setFakturaVat(Boolean fakturaVat) {
        this.fakturaVat = fakturaVat;
    }

    private Integer terminWysylki;

    @Basic
    @javax.persistence.Column(name = "TerminWysylki")
    public Integer getTerminWysylki() {
        return terminWysylki;
    }

    public void setTerminWysylki(Integer terminWysylki) {
        this.terminWysylki = terminWysylki;
    }

    private int formaPlatnosci;

    @Basic
    @javax.persistence.Column(name = "FormaPlatnosci")
    public int getFormaPlatnosci() {
        return formaPlatnosci;
    }

    public void setFormaPlatnosci(int formaPlatnosci) {
        this.formaPlatnosci = formaPlatnosci;
    }

    private Integer numerKonta1;

    @Basic
    @javax.persistence.Column(name = "NumerKonta1")
    public Integer getNumerKonta1() {
        return numerKonta1;
    }

    public void setNumerKonta1(Integer numerKonta1) {
        this.numerKonta1 = numerKonta1;
    }

    private Integer numerKonta2;

    @Basic
    @javax.persistence.Column(name = "NumerKonta2")
    public Integer getNumerKonta2() {
        return numerKonta2;
    }

    public void setNumerKonta2(Integer numerKonta2) {
        this.numerKonta2 = numerKonta2;
    }

    private Boolean szablon;

    @Basic
    @javax.persistence.Column(name = "Szablon")
    public Boolean getSzablon() {
        return szablon;
    }

    public void setSzablon(Boolean szablon) {
        this.szablon = szablon;
    }

    private Integer liczbaOdwiedzin;

    @Basic
    @javax.persistence.Column(name = "LiczbaOdwiedzin")
    public Integer getLiczbaOdwiedzin() {
        return liczbaOdwiedzin;
    }

    public void setLiczbaOdwiedzin(Integer liczbaOdwiedzin) {
        this.liczbaOdwiedzin = liczbaOdwiedzin;
    }

    private Date terminOstatnichOdwiedzin;

    @Basic
    @javax.persistence.Column(name = "TerminOstatnichOdwiedzin")
    public Date getTerminOstatnichOdwiedzin() {
        return terminOstatnichOdwiedzin;
    }

    public void setTerminOstatnichOdwiedzin(Date terminOstatnichOdwiedzin) {
        this.terminOstatnichOdwiedzin = terminOstatnichOdwiedzin;
    }

    private Integer liczbaDostepnychPrzedmiotow;

    @Basic
    @javax.persistence.Column(name = "LiczbaDostepnychPrzedmiotow")
    public Integer getLiczbaDostepnychPrzedmiotow() {
        return liczbaDostepnychPrzedmiotow;
    }

    public void setLiczbaDostepnychPrzedmiotow(Integer liczbaDostepnychPrzedmiotow) {
        this.liczbaDostepnychPrzedmiotow = liczbaDostepnychPrzedmiotow;
    }

    private Integer aktualnaCena;

    @Basic
    @javax.persistence.Column(name = "AktualnaCena")
    public Integer getAktualnaCena() {
        return aktualnaCena;
    }

    public void setAktualnaCena(Integer aktualnaCena) {
        this.aktualnaCena = aktualnaCena;
    }

    private Integer oplata;

    @Basic
    @javax.persistence.Column(name = "Oplata")
    public Integer getOplata() {
        return oplata;
    }

    public void setOplata(Integer oplata) {
        this.oplata = oplata;
    }

    private Integer oplataFinalna;

    @Basic
    @javax.persistence.Column(name = "OplataFinalna")
    public Integer getOplataFinalna() {
        return oplataFinalna;
    }

    public void setOplataFinalna(Integer oplataFinalna) {
        this.oplataFinalna = oplataFinalna;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AukcjaEntity that = (AukcjaEntity) o;

        if (formaPlatnosci != that.formaPlatnosci) return false;
        if (id != that.id) return false;
        if (aktualnaCena != null ? !aktualnaCena.equals(that.aktualnaCena) : that.aktualnaCena != null) return false;
        if (cenaKupTeraz != null ? !cenaKupTeraz.equals(that.cenaKupTeraz) : that.cenaKupTeraz != null) return false;
        if (cenaMinimalna != null ? !cenaMinimalna.equals(that.cenaMinimalna) : that.cenaMinimalna != null)
            return false;
        if (cenaWywolawcza != null ? !cenaWywolawcza.equals(that.cenaWywolawcza) : that.cenaWywolawcza != null)
            return false;
        if (czasTrwania != null ? !czasTrwania.equals(that.czasTrwania) : that.czasTrwania != null) return false;
        if (dodatkoweInformacjeODostawieIPlatnosci != null ? !dodatkoweInformacjeODostawieIPlatnosci.equals(that.dodatkoweInformacjeODostawieIPlatnosci) : that.dodatkoweInformacjeODostawieIPlatnosci != null)
            return false;
        if (fakturaVat != null ? !fakturaVat.equals(that.fakturaVat) : that.fakturaVat != null) return false;
        if (jednostka != null ? !jednostka.equals(that.jednostka) : that.jednostka != null) return false;
        if (kosztPrzesylkiPokrywaKupujacy != null ? !kosztPrzesylkiPokrywaKupujacy.equals(that.kosztPrzesylkiPokrywaKupujacy) : that.kosztPrzesylkiPokrywaKupujacy != null)
            return false;
        if (liczbaDostepnychPrzedmiotow != null ? !liczbaDostepnychPrzedmiotow.equals(that.liczbaDostepnychPrzedmiotow) : that.liczbaDostepnychPrzedmiotow != null)
            return false;
        if (liczbaOdwiedzin != null ? !liczbaOdwiedzin.equals(that.liczbaOdwiedzin) : that.liczbaOdwiedzin != null)
            return false;
        if (liczbaPrzedmiotow != null ? !liczbaPrzedmiotow.equals(that.liczbaPrzedmiotow) : that.liczbaPrzedmiotow != null)
            return false;
        if (numer != null ? !numer.equals(that.numer) : that.numer != null) return false;
        if (numerKonta1 != null ? !numerKonta1.equals(that.numerKonta1) : that.numerKonta1 != null) return false;
        if (numerKonta2 != null ? !numerKonta2.equals(that.numerKonta2) : that.numerKonta2 != null) return false;
        if (opisPrzedmiotu != null ? !opisPrzedmiotu.equals(that.opisPrzedmiotu) : that.opisPrzedmiotu != null)
            return false;
        if (oplata != null ? !oplata.equals(that.oplata) : that.oplata != null) return false;
        if (oplataFinalna != null ? !oplataFinalna.equals(that.oplataFinalna) : that.oplataFinalna != null)
            return false;
        if (rodzajAukcji != null ? !rodzajAukcji.equals(that.rodzajAukcji) : that.rodzajAukcji != null) return false;
        if (szablon != null ? !szablon.equals(that.szablon) : that.szablon != null) return false;
        if (terminOstatnichOdwiedzin != null ? !terminOstatnichOdwiedzin.equals(that.terminOstatnichOdwiedzin) : that.terminOstatnichOdwiedzin != null)
            return false;
        if (terminRozpoczecia != null ? !terminRozpoczecia.equals(that.terminRozpoczecia) : that.terminRozpoczecia != null)
            return false;
        if (terminWysylki != null ? !terminWysylki.equals(that.terminWysylki) : that.terminWysylki != null)
            return false;
        if (terminZakonczenia != null ? !terminZakonczenia.equals(that.terminZakonczenia) : that.terminZakonczenia != null)
            return false;
        if (tytul != null ? !tytul.equals(that.tytul) : that.tytul != null) return false;
        if (wysylkaZaGranice != null ? !wysylkaZaGranice.equals(that.wysylkaZaGranice) : that.wysylkaZaGranice != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (numer != null ? numer.hashCode() : 0);
        result = 31 * result + (tytul != null ? tytul.hashCode() : 0);
        result = 31 * result + (opisPrzedmiotu != null ? opisPrzedmiotu.hashCode() : 0);
        result = 31 * result + (rodzajAukcji != null ? rodzajAukcji.hashCode() : 0);
        result = 31 * result + (terminRozpoczecia != null ? terminRozpoczecia.hashCode() : 0);
        result = 31 * result + (liczbaPrzedmiotow != null ? liczbaPrzedmiotow.hashCode() : 0);
        result = 31 * result + (jednostka != null ? jednostka.hashCode() : 0);
        result = 31 * result + (cenaKupTeraz != null ? cenaKupTeraz.hashCode() : 0);
        result = 31 * result + (czasTrwania != null ? czasTrwania.hashCode() : 0);
        result = 31 * result + (cenaWywolawcza != null ? cenaWywolawcza.hashCode() : 0);
        result = 31 * result + (cenaMinimalna != null ? cenaMinimalna.hashCode() : 0);
        result = 31 * result + (terminZakonczenia != null ? terminZakonczenia.hashCode() : 0);
        result = 31 * result + (dodatkoweInformacjeODostawieIPlatnosci != null ? dodatkoweInformacjeODostawieIPlatnosci.hashCode() : 0);
        result = 31 * result + (kosztPrzesylkiPokrywaKupujacy != null ? kosztPrzesylkiPokrywaKupujacy.hashCode() : 0);
        result = 31 * result + (wysylkaZaGranice != null ? wysylkaZaGranice.hashCode() : 0);
        result = 31 * result + (fakturaVat != null ? fakturaVat.hashCode() : 0);
        result = 31 * result + (terminWysylki != null ? terminWysylki.hashCode() : 0);
        result = 31 * result + formaPlatnosci;
        result = 31 * result + (numerKonta1 != null ? numerKonta1.hashCode() : 0);
        result = 31 * result + (numerKonta2 != null ? numerKonta2.hashCode() : 0);
        result = 31 * result + (szablon != null ? szablon.hashCode() : 0);
        result = 31 * result + (liczbaOdwiedzin != null ? liczbaOdwiedzin.hashCode() : 0);
        result = 31 * result + (terminOstatnichOdwiedzin != null ? terminOstatnichOdwiedzin.hashCode() : 0);
        result = 31 * result + (liczbaDostepnychPrzedmiotow != null ? liczbaDostepnychPrzedmiotow.hashCode() : 0);
        result = 31 * result + (aktualnaCena != null ? aktualnaCena.hashCode() : 0);
        result = 31 * result + (oplata != null ? oplata.hashCode() : 0);
        result = 31 * result + (oplataFinalna != null ? oplataFinalna.hashCode() : 0);
        return result;
    }
}
