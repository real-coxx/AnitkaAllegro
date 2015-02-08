package com.springapp.helpers;

import com.springapp.dto.UzytkownikTO;

/**
 * Created by Internet on 2015-02-07.
 */
public interface IEsothebysSessionHelper {

    public long getCurrentUserId();

    public UzytkownikTO getCurrentUserForWystawPrzedmiot();
}
