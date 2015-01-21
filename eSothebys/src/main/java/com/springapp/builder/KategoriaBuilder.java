package com.springapp.builder;

/**
 * Created by Alicja on 2015-01-21.
 */
public class KategoriaBuilder {

    private int id;
    private String nazwa;
    private boolean aukcjeJednoprzedmiotowe;
    private Boolean dostepnaPlatnoscKarta;
    private Boolean dostepnaPlatnoscPrzezPayU;
    private boolean dopuszczaAukcje;
    private String formulaWyliczaniaProwizjiOdSprzedaży;
    private String formulaWyliczaniaOplatyPodstawowej;
    private int kategoria2ID;

    public KategoriaBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public KategoriaBuilder setNazwa(String nazwa) {
        this.nazwa = nazwa;
        return this;
    }

    public KategoriaBuilder setAukcjeJednoprzedmiotowe(boolean aukcjeJednoprzedmiotowe) {
        this.aukcjeJednoprzedmiotowe = aukcjeJednoprzedmiotowe;
        return this;
    }

    public KategoriaBuilder setDostepnaPlatnoscKarta(Boolean dostepnaPlatnoscKarta) {
        this.dostepnaPlatnoscKarta = dostepnaPlatnoscKarta;
        return this;
    }

    public KategoriaBuilder setDostepnaPlatnoscPrzezPayU(Boolean dostepnaPlatnoscPrzezPayU) {
        this.dostepnaPlatnoscPrzezPayU = dostepnaPlatnoscPrzezPayU;
        return this;
    }

    public KategoriaBuilder setDopuszczaAukcje(boolean dopuszczaAukcje) {
        this.dopuszczaAukcje = dopuszczaAukcje;
        return this;
    }

    public KategoriaBuilder setFormulaWyliczaniaProwizjiOdSprzedaży(String formulaWyliczaniaProwizjiOdSprzedaży) {
        this.formulaWyliczaniaProwizjiOdSprzedaży = formulaWyliczaniaProwizjiOdSprzedaży;
        return this;
    }

    public KategoriaBuilder setFormulaWyliczaniaOplatyPodstawowej(String formulaWyliczaniaOplatyPodstawowej) {
        this.formulaWyliczaniaOplatyPodstawowej = formulaWyliczaniaOplatyPodstawowej;
        return this;
    }

    public KategoriaBuilder setKategoria2ID(int kategoria2ID) {
        this.kategoria2ID = kategoria2ID;
        return this;
    }

    public int getId() {
        return id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public boolean isAukcjeJednoprzedmiotowe() {
        return aukcjeJednoprzedmiotowe;
    }

    public Boolean getDostepnaPlatnoscKarta() {
        return dostepnaPlatnoscKarta;
    }

    public Boolean getDostepnaPlatnoscPrzezPayU() {
        return dostepnaPlatnoscPrzezPayU;
    }

    public boolean isDopuszczaAukcje() {
        return dopuszczaAukcje;
    }

    public String getFormulaWyliczaniaProwizjiOdSprzedaży() {
        return formulaWyliczaniaProwizjiOdSprzedaży;
    }

    public String getFormulaWyliczaniaOplatyPodstawowej() {
        return formulaWyliczaniaOplatyPodstawowej;
    }

    public int getKategoria2ID() {
        return kategoria2ID;
    }
}
