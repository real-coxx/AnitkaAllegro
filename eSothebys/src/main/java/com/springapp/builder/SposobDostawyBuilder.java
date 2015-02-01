package com.springapp.builder;

/**
 * Created by Alicja on 2015-02-01.
 */
public class SposobDostawyBuilder {

    private int id;
    private String nazwa;
    private Integer czasDostawy;
    private String rodzajPlatnosci;
    private Boolean edytowalny;

    public SposobDostawyBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public SposobDostawyBuilder setNazwa(String nazwa) {
        this.nazwa = nazwa;
        return this;
    }

    public SposobDostawyBuilder setCzasDostawy(Integer czasDostawy) {
        this.czasDostawy = czasDostawy;
        return this;
    }

    public SposobDostawyBuilder setRodzajPlatnosci(String rodzajPlatnosci) {
        this.rodzajPlatnosci = rodzajPlatnosci;
        return this;
    }

    public SposobDostawyBuilder setEdytowalny(Boolean edytowalny) {
        this.edytowalny = edytowalny;
        return this;
    }

    public int getId() {
        return id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public Integer getCzasDostawy() {
        return czasDostawy;
    }

    public String getRodzajPlatnosci() {
        return rodzajPlatnosci;
    }

    public Boolean getEdytowalny() {
        return edytowalny;
    }
}
