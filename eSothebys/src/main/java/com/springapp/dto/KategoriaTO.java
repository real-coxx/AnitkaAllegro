package com.springapp.dto;

import com.springapp.builder.KategoriaBuilder;
import com.springapp.model.KategoriaEntity;

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
    private KategoriaEntity nadrzedna;

    public KategoriaTO(KategoriaBuilder builder) {
        this.id = builder.getId();
        this.nazwa= builder.getNazwa();
        this.aukcjeJednoprzedmiotowe = builder.isAukcjeJednoprzedmiotowe();
        this.dostepnaPlatnoscKarta = builder.getDostepnaPlatnoscKarta();
        this.dostepnaPlatnoscPrzezPayU = builder.getDostepnaPlatnoscPrzezPayU();
        this.dopuszczaAukcje = builder.isDopuszczaAukcje();
        this.formulaWyliczaniaProwizjiOdSprzedaży = builder.getFormulaWyliczaniaProwizjiOdSprzedaży();
        this.formulaWyliczaniaOplatyPodstawowej = builder.getFormulaWyliczaniaOplatyPodstawowej();
        this.nadrzedna = builder.getNadrzedna();
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

    public KategoriaTO getNadrzedna() {
        KategoriaTO result;

        KategoriaBuilder kb = new KategoriaBuilder();

        if()
        kb.setId()

        return nadrzedna;
    }
}
