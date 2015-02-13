package com.springapp.dto;

import com.springapp.model.Enums.TypParametruEnum;

import java.nio.channels.SeekableByteChannel;
import java.util.List;

/**
 * Created by Internet on 2015-02-08.
 */
public class ParametrTO {
    private List<WartoscTO> mozliweWartosci;
    private TypParametruEnum typParametru;
    private boolean obligatoryjny;
    private String nazwa;

    public List<WartoscTO> getMozliweWartosci() {
        return mozliweWartosci;
    }

    public TypParametruEnum getTyp() {
        return typParametru;
    }

    public boolean getObligatoryjny() {
        return obligatoryjny;
    }

    public String getNazwa() {
        return nazwa;
    }
}
