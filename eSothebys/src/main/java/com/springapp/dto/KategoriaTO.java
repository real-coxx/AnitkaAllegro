package com.springapp.dto;

import com.springapp.builder.KategoriaBuilder;

/**
 * Created by Alicja on 2015-01-21.
 */
public class KategoriaTO {

    private int id;
    private String nazwa;
    private boolean aukcjeJednoprzedmiotowe;
    private Boolean dostepnaPlatnoscKarta;
    private Boolean dostepnaPlatnoscPrzezPayU;
    private boolean dopuszczaAukcje;
    private String formulaWyliczaniaProwizjiOdSprzedaży;
    private String formulaWyliczaniaOplatyPodstawowej;
    private int kategoria2ID;

    public KategoriaTO(KategoriaBuilder builder) {
        this.id = builder.getId();
        this.nazwa= builder.getNazwa();
        this.aukcjeJednoprzedmiotowe = builder.isAukcjeJednoprzedmiotowe();
        this.dostepnaPlatnoscKarta = builder.getDostepnaPlatnoscKarta();
        this.dostepnaPlatnoscPrzezPayU = builder.getDostepnaPlatnoscPrzezPayU();
        this.dopuszczaAukcje = builder.isDopuszczaAukcje();
        this.formulaWyliczaniaProwizjiOdSprzedaży = builder.getFormulaWyliczaniaProwizjiOdSprzedaży();
        this.formulaWyliczaniaOplatyPodstawowej = builder.getFormulaWyliczaniaOplatyPodstawowej();
        this.kategoria2ID = builder.getKategoria2ID();
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
