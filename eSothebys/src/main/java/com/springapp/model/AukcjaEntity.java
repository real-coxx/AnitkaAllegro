package com.springapp.model;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;

import javax.ejb.Local;
import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by Alicja on 2015-01-05.
 */
@Entity
@javax.persistence.Table(name = "aukcja", schema = "", catalog = "esothebys_db")
public class AukcjaEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "Numer")
    private Integer numer;

    @Column(name = "Tytul")
    private String tytul;

    @Column(name = "OpisPrzedmiotu")
    private String opisPrzedmiotu;

    @Column(name = "RodzajAukcji")
    private Integer rodzajAukcji;

    @Column(name = "TerminRozpoczecia")
    private Date terminRozpoczecia;

    @Column(name = "LiczbaPrzedmiotow")
    private Integer liczbaPrzedmiotow;

    @Column(name = "Jednostka")
    private Integer jednostka;

    @Column(name = "CenaKupTeraz")
    private Integer cenaKupTeraz;

    @Column(name = "CzasTrwania")
    private Integer czasTrwania;

    @Column(name = "CenaWywolawcza")
    private Integer cenaWywolawcza;

    @Column(name = "CenaMinimalna")
    private Integer cenaMinimalna;

    @Column(name = "TerminZakonczenia")
    private Timestamp terminZakonczenia;

    @Column(name = "DodatkoweInformacjeODostawieIPlatnosci")
    private String dodatkoweInformacjeODostawieIPlatnosci;

    @Column(name = "KosztPrzesylkiPokrywaKupujacy")
    private Boolean kosztPrzesylkiPokrywaKupujacy;

    @Column(name = "WysylkaZaGranice")
    private Boolean wysylkaZaGranice;

    @Column(name = "FakturaVAT")
    private Boolean fakturaVat;

    @Column(name = "TerminWysylki")
    private Integer terminWysylki;

    @Column(name = "FormaPlatnosci")
    private int formaPlatnosci;

    @Column(name = "NumerKonta1")
    private Integer numerKonta1;

    @Column(name = "NumerKonta2")
    private Integer numerKonta2;

    @Column(name = "Szablon")
    private Boolean szablon;

    @Column(name = "LiczbaOdwiedzin")
    private Integer liczbaOdwiedzin;

    @Column(name = "TerminOstatnichOdwiedzin")
    private Date terminOstatnichOdwiedzin;

    @Column(name = "LiczbaDostepnychPrzedmiotow")
    private Integer liczbaDostepnychPrzedmiotow;

    @Column(name = "AktualnaCena")
    private Integer aktualnaCena;

    @Column(name = "Oplata")
    private Integer oplata;

    @Column(name = "OplataFinalna")
    private Integer oplataFinalna;

    @Column(name = "Kategoria2ID")
    private Integer kategoria2ID;

    public int getId() {
        return id;
    }

    public Integer getNumer() {
        return numer;
    }

    public String getTytul() {
        return tytul;
    }

    public String getOpisPrzedmiotu() {
        return opisPrzedmiotu;
    }

    public Integer getRodzajAukcji() {
        return rodzajAukcji;
    }

    public Date getTerminRozpoczecia() {
        return terminRozpoczecia;
    }

    public Integer getLiczbaPrzedmiotow() {
        return liczbaPrzedmiotow;
    }

    public Integer getJednostka() {
        return jednostka;
    }

    public Integer getCenaKupTeraz() {
        return cenaKupTeraz;
    }

    public Integer getCzasTrwania() {
        return czasTrwania;
    }

    public Integer getCenaWywolawcza() {
        return cenaWywolawcza;
    }

    public Integer getCenaMinimalna() {
        return cenaMinimalna;
    }

    public Timestamp getTerminZakonczenia() { return terminZakonczenia; }

    public String getDodatkoweInformacjeODostawieIPlatnosci() {
        return dodatkoweInformacjeODostawieIPlatnosci;
    }

    public Boolean getKosztPrzesylkiPokrywaKupujacy() {
        return kosztPrzesylkiPokrywaKupujacy;
    }

    public Boolean getWysylkaZaGranice() {
        return wysylkaZaGranice;
    }

    public Boolean getFakturaVat() {
        return fakturaVat;
    }

    public Integer getTerminWysylki() {
        return terminWysylki;
    }

    public int getFormaPlatnosci() {
        return formaPlatnosci;
    }

    public Integer getNumerKonta1() {
        return numerKonta1;
    }

    public Integer getNumerKonta2() {
        return numerKonta2;
    }

    public Boolean getSzablon() {
        return szablon;
    }

    public Integer getLiczbaOdwiedzin() {
        return liczbaOdwiedzin;
    }

    public Date getTerminOstatnichOdwiedzin() {
        return terminOstatnichOdwiedzin;
    }

    public Integer getLiczbaDostepnychPrzedmiotow() {
        return liczbaDostepnychPrzedmiotow;
    }

    public Integer getAktualnaCena() {
        return aktualnaCena;
    }

    public Integer getOplata() {
        return oplata;
    }

    public Integer getOplataFinalna() {
        return oplataFinalna;
    }

    public Integer getKategoria2ID() { return kategoria2ID; }

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
        if (kategoria2ID != null ? !kategoria2ID.equals(that.kategoria2ID) : that.kategoria2ID != null) return false;
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
