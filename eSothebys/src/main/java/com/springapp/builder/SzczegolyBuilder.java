package com.springapp.builder;

import com.springapp.dto.ParametrTO;
import com.springapp.dto.WartoscTO;

import java.util.List;

/**
 * Created by Internet on 2015-02-08.
 */
public class SzczegolyBuilder {
    private List<WartoscTO> wybraneWartosci;
    private ParametrTO parametr;
    private String wprowadzonaWartosc;

    public void setWybraneWartosci(String[] wybraneWartosci) {
        this.wybraneWartosci = wybraneWartosci;
    }

    public void setParametr(Long parametr) {
        this.parametr = parametr;
    }

    public void setWprowadzonaWartosc(String wprowadzonaWartosc) {
        this.wprowadzonaWartosc = wprowadzonaWartosc;
    }
}
