package com.springapp.dto;

/**
 * Created by Internet on 2015-02-08.
 */
public class OpcjadodatkowaTO {
    private String ograniczeniaCenyUzytkownika;
    private String nazwa;
    private long id;

    public String getOgraniczeniaCenyUzytkownika() {

        return ograniczeniaCenyUzytkownika;
    }

    public void setWprowadzonaWartosc() {
    }

    public boolean getCzyOpcjaDodatkowaUzytkownika() {
        return ograniczeniaCenyUzytkownika != null;
    }

    public String getNazwa() {
        return nazwa;
    }

    public long getId() {
        return id;
    }
}
