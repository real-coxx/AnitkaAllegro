package com.springapp.model;

import javax.persistence.*;

/**
 * Created by Alicja on 2015-01-05.
 */
@Entity
@Table(name = "kategoria", schema = "", catalog = "esothebys_db")
public class KategoriaEntity {
    private int id;
    private String nazwa;
    private boolean aukcjeJednoprzedmiotowe = false;
    private Boolean dostepnaPlatnoscKarta = true;
    private Boolean dostepnaPlatnoscPrzezPayU = true;
    private boolean dopuszczaAukcje;
    private String formulaWyliczaniaProwizjiOdSprzedaży;
    private String formulaWyliczaniaOplatyPodstawowej;
    private KategoriaEntity nadrzedna;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Nazwa")
    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    @Basic
    @Column(name = "AukcjeJednoprzedmiotowe")
    public boolean isAukcjeJednoprzedmiotowe() {
        return aukcjeJednoprzedmiotowe;
    }

    public void setAukcjeJednoprzedmiotowe(boolean aukcjeJednoprzedmiotowe) {
        this.aukcjeJednoprzedmiotowe = aukcjeJednoprzedmiotowe;
    }

    @Basic
    @Column(name = "DostepnaPlatnoscKarta")
    public Boolean getDostepnaPlatnoscKarta() {
        return dostepnaPlatnoscKarta;
    }

    public void setDostepnaPlatnoscKarta(Boolean dostepnaPlatnoscKarta) {
        this.dostepnaPlatnoscKarta = dostepnaPlatnoscKarta;
    }

    @Basic
    @Column(name = "DostepnaPlatnoscPrzezPayU")
    public Boolean getDostepnaPlatnoscPrzezPayU() {
        return dostepnaPlatnoscPrzezPayU;
    }

    public void setDostepnaPlatnoscPrzezPayU(Boolean dostepnaPlatnoscPrzezPayU) {
        this.dostepnaPlatnoscPrzezPayU = dostepnaPlatnoscPrzezPayU;
    }

    @Basic
    @Column(name = "DopuszczaAukcje")
    public boolean isDopuszczaAukcje() {
        return dopuszczaAukcje;
    }

    public void setDopuszczaAukcje(boolean dopuszczaAukcje) {
        this.dopuszczaAukcje = dopuszczaAukcje;
    }

    @Basic
    @Column(name = "FormulaWyliczaniaProwizjiOdSprzedaży")
    public String getFormulaWyliczaniaProwizjiOdSprzedaży() {
        return formulaWyliczaniaProwizjiOdSprzedaży;
    }

    public void setFormulaWyliczaniaProwizjiOdSprzedaży(String formulaWyliczaniaProwizjiOdSprzedaży) {
        this.formulaWyliczaniaProwizjiOdSprzedaży = formulaWyliczaniaProwizjiOdSprzedaży;
    }

    @Basic
    @Column(name = "FormulaWyliczaniaOplatyPodstawowej")
    public String getFormulaWyliczaniaOplatyPodstawowej() {
        return formulaWyliczaniaOplatyPodstawowej;
    }

    public void setFormulaWyliczaniaOplatyPodstawowej(String formulaWyliczaniaOplatyPodstawowej) {
        this.formulaWyliczaniaOplatyPodstawowej = formulaWyliczaniaOplatyPodstawowej;
    }

    @ManyToOne (cascade=CascadeType.ALL)
    @JoinColumn(name="Nadrzedna")
    public KategoriaEntity getNadrzedna() {
        return nadrzedna;
    }

    public void setNadrzedna(KategoriaEntity nadrzedna) {
        this.nadrzedna = nadrzedna;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KategoriaEntity that = (KategoriaEntity) o;

        if (aukcjeJednoprzedmiotowe != that.aukcjeJednoprzedmiotowe) return false;
        if (dopuszczaAukcje != that.dopuszczaAukcje) return false;
        if (id != that.id) return false;
        if (dostepnaPlatnoscKarta != null ? !dostepnaPlatnoscKarta.equals(that.dostepnaPlatnoscKarta) : that.dostepnaPlatnoscKarta != null)
            return false;
        if (dostepnaPlatnoscPrzezPayU != null ? !dostepnaPlatnoscPrzezPayU.equals(that.dostepnaPlatnoscPrzezPayU) : that.dostepnaPlatnoscPrzezPayU != null)
            return false;
        if (formulaWyliczaniaOplatyPodstawowej != null ? !formulaWyliczaniaOplatyPodstawowej.equals(that.formulaWyliczaniaOplatyPodstawowej) : that.formulaWyliczaniaOplatyPodstawowej != null)
            return false;
        if (formulaWyliczaniaProwizjiOdSprzedaży != null ? !formulaWyliczaniaProwizjiOdSprzedaży.equals(that.formulaWyliczaniaProwizjiOdSprzedaży) : that.formulaWyliczaniaProwizjiOdSprzedaży != null)
            return false;
        if (nazwa != null ? !nazwa.equals(that.nazwa) : that.nazwa != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nazwa != null ? nazwa.hashCode() : 0);
        result = 31 * result + (aukcjeJednoprzedmiotowe ? 1 : 0);
        result = 31 * result + (dostepnaPlatnoscKarta != null ? dostepnaPlatnoscKarta.hashCode() : 0);
        result = 31 * result + (dostepnaPlatnoscPrzezPayU != null ? dostepnaPlatnoscPrzezPayU.hashCode() : 0);
        result = 31 * result + (dopuszczaAukcje ? 1 : 0);
        result = 31 * result + (formulaWyliczaniaProwizjiOdSprzedaży != null ? formulaWyliczaniaProwizjiOdSprzedaży.hashCode() : 0);
        result = 31 * result + (formulaWyliczaniaOplatyPodstawowej != null ? formulaWyliczaniaOplatyPodstawowej.hashCode() : 0);
        return result;
    }
}
