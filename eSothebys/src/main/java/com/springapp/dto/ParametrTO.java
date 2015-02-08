package com.springapp.dto;

import java.nio.channels.SeekableByteChannel;
import java.util.List;

/**
 * Created by Internet on 2015-02-08.
 */
public class ParametrTO {
    private List<WartoscTO> mozliweWartosci;
    private String typParametru;
    private boolean obligatoryjny;
    private String nazwa;

    public List<WartoscTO> getMozliweWartosci() {
        return mozliweWartosci;
    }

    public String getTyp() {
        return typParametru;
    }

    public boolean getObligatoryjny() {
        return obligatoryjny;
    }

    public String getNazwa() {
        return nazwa;
    }
}
