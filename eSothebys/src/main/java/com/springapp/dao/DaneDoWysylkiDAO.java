package com.springapp.dao;

import com.springapp.model.DanedowysylkiEntity;
import com.springapp.model.UzytkownikEntity;

/**
 * Created by Alicja on 2015-02-05.
 */
public interface DaneDoWysylkiDAO {

    public DanedowysylkiEntity getDaneDoWysylkiById(int idDane);
    public DanedowysylkiEntity getDaneOInnymAdresieNizZamieszkania(UzytkownikEntity uzytkownik);
    public void modyfikujDaneDoWysylki(String imie, String nazwisko, String firma, int daneDoWysylkiId);
}
