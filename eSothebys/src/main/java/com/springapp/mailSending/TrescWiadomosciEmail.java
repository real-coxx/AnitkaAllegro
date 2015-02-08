package com.springapp.mailSending;

import com.springapp.dto.AukcjaTO;
import com.springapp.dto.UzytkownikTO;
import com.springapp.model.AdresEntity;
import com.springapp.model.DanedowysylkiEntity;

/**
 * Created by Alicja on 2015-02-07.
 */
public class TrescWiadomosciEmail {

    public static String wiadomoscDlaKupujacego(AukcjaTO aukcjaTO, int liczbaSztuk, String cenaCalkowita) {

        return "Kilka informacji o transakcji, której przed chwilą dokonałeś: \n\n" +
                "PRZEDMIOT: " + aukcjaTO.getTytul() + "\n" +
                "NUMER AUKCJI: " + aukcjaTO.getNumer() + "\n" +
                "LICZBA SZTUK: " + liczbaSztuk + "\n" +
                "CAŁKOWITA CENA Z PRZESYŁKĄ: " + cenaCalkowita + " zł";
    }


    public static String wiadomoscDlaSprzedajacego(AukcjaTO aukcjaTO, DanedowysylkiEntity danedowysylki, int liczbaSztuk,
                                                   String cenaCalkowita, String telefon, String wiadomosc) {

        AdresEntity adres = danedowysylki.getAdresDoWysylki();

        return "Kilka informacji o kupnie Twojego przedmiotu: \n\n" +
                "PRZEDMIOT: " + aukcjaTO.getTytul() + "\n" +
                "NUMER AUKCJI: " + aukcjaTO.getNumer() + "\n" +
                "LICZBA SZTUK: " + liczbaSztuk + "\n" +
                "CAŁKOWITA CENA Z PRZESYŁKĄ: " + cenaCalkowita + " zł" + "\n" +
                "\n" +
                "KUPUJĄCY: " + "\n" +
                "- login: " + danedowysylki.getUzytkownik().getLogin() + "\n" +
                "- imię i nazwisko: " + danedowysylki.getImie() + " " + danedowysylki.getNazwisko() + "\n" +
                "- adres: "  + adres.getUlicaZNumerem() + ", " + adres.getKodPocztow() + ", " + adres.getMiejscowosc() + ", " + adres.getKraj().getNazwa() + "\n" +
                "- telefon: " + telefon + "\n" +
                "\n\n" +
                "WIADOMOŚĆ OD KUPUJĄCEGO: " + "\n" + wiadomosc;
    }
}
