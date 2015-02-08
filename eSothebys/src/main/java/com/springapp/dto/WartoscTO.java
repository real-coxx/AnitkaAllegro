package com.springapp.dto;

import javax.print.attribute.standard.MediaPrintableArea;

/**
 * Created by Internet on 2015-02-08.
 */
public class WartoscTO {
    private Long id;
    private String zakresGorny;
    private String zakresDolny;

    public Long getId() {
        return id;
    }

    public String getZakresGorny() {
        return zakresGorny;
    }

    public String getZakresDolny() {
        return zakresDolny;
    }
}
