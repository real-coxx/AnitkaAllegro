package com.springapp.helpers;

/**
 * Created by Alicja on 2015-01-22.
 */
public class LicytacjaWOsobachISztukach {

    private int iloscOsob = 0;
    private int iloscSztuk = 0;

    private String odmianaOsoby;
    private String odmianaSztuk;

    public void sprawdzOdmianeOsobDlaKupTeraz() {
        String odmiana = Integer.toString(iloscOsob);
        if (iloscOsob ==  1) {
            odmianaOsoby = "osoba kupiła";
        }
        else if (Integer.parseInt(String.valueOf(odmiana.charAt(odmiana.length()-1))) == 2 && iloscOsob != 12
                ||
                Integer.parseInt(String.valueOf(odmiana.charAt(odmiana.length()-1))) == 3 && iloscOsob != 13
                ||
                Integer.parseInt(String.valueOf(odmiana.charAt(odmiana.length()-1))) == 4 && iloscOsob != 14) {
            odmianaOsoby = "osoby kupiły";
        }
        else {
            odmianaOsoby = "osób kupiło";
        }
    }

    public void sprawdzOdmianeSztukDlaKupTeraz() {
        String odmiana = Integer.toString(iloscSztuk);
        if (iloscSztuk ==  1) {
            odmianaSztuk = "sztukę";
        }
        else if (Integer.parseInt(String.valueOf(odmiana.charAt(odmiana.length()-1))) == 2 && iloscSztuk != 12
                ||
                Integer.parseInt(String.valueOf(odmiana.charAt(odmiana.length()-1))) == 3 && iloscSztuk != 13
                ||
                        Integer.parseInt(String.valueOf(odmiana.charAt(odmiana.length()-1))) == 4 && iloscSztuk != 14) {
            odmianaSztuk = "sztuki";
        }
        else {
            odmianaSztuk = "sztuk";
        }
    }

    public void sprawdzOdmianeSztukDlaPlatnosci() {
        String odmiana = Integer.toString(iloscSztuk);
        if (iloscSztuk ==  1) {
            odmianaSztuk = "sztuka";
        }
        else if (Integer.parseInt(String.valueOf(odmiana.charAt(odmiana.length()-1))) == 2 && iloscSztuk != 12
                ||
                Integer.parseInt(String.valueOf(odmiana.charAt(odmiana.length()-1))) == 3 && iloscSztuk != 13
                ||
                Integer.parseInt(String.valueOf(odmiana.charAt(odmiana.length()-1))) == 4 && iloscSztuk != 14) {
            odmianaSztuk = "sztuki";
        }
        else {
            odmianaSztuk = "sztuk";
        }
    }

    public void sprawdzOdmianeOsobDlaLicytacji() {
        String odmiana = Integer.toString(iloscOsob);
        if (iloscOsob ==  1) {
            odmianaOsoby = "osoba licytuje";
        }
        else if (Integer.parseInt(String.valueOf(odmiana.charAt(odmiana.length()-1))) == 2 && iloscOsob != 12
                ||
                Integer.parseInt(String.valueOf(odmiana.charAt(odmiana.length()-1))) == 3 && iloscOsob != 13
                ||
                        Integer.parseInt(String.valueOf(odmiana.charAt(odmiana.length()-1))) == 4 && iloscOsob != 14) {
            odmianaOsoby = "osoby licytują";
        }
        else {
            odmianaOsoby = "osób licytuje";
        }
    }

    public int getIloscOsob() {
        return iloscOsob;
    }

    public int getIloscSztuk() {
        return iloscSztuk;
    }

    public void setIloscOsob(int iloscOsob) {
        this.iloscOsob = iloscOsob;
    }

    public void setIloscSztuk(int iloscSztuk) {
        this.iloscSztuk = iloscSztuk;
    }

    public String getOdmianaOsoby() {
        return odmianaOsoby;
    }

    public void setOdmianaOsoby(String odmianaOsoby) {
        this.odmianaOsoby = odmianaOsoby;
    }

    public String getOdmianaSztuk() {
        return odmianaSztuk;
    }

    public void setOdmianaSztuk(String odmianaSztuk) {
        this.odmianaSztuk = odmianaSztuk;
    }
}
