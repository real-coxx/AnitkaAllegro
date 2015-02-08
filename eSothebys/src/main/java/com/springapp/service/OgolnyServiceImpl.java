package com.springapp.service;
import com.springapp.dao.AdresDAO;
import com.springapp.dao.AukcjaDAO;
import com.springapp.dao.DaneDoWysylkiDAO;
import com.springapp.dao.UzytkownikDAO;
import com.springapp.dto.AukcjaTO;
import com.springapp.dto.UzytkownikTO;
import com.springapp.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import java.sql.Timestamp;
/**
 * Created by Alicja on 2015-02-06.
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class OgolnyServiceImpl implements OgolnyService {
    @Autowired
    OfertaService ofertaService;
    @Autowired
    UmowaService umowaService;
    @Autowired
    AukcjaService aukcjaService;
    @Autowired
    AukcjaDAO aukcjaDAO;
    @Autowired
    AdresDAO adresDAO;
    @Autowired
    UzytkownikDAO uzytkownikDAO;
    @Autowired
    DaneDoWysylkiDAO daneDoWysylkiDAO;
    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public void potwierdzKupno(AukcjaTO aukcjaTO, UzytkownikTO kupujacy, int liczbaSztuk,String imie, String nazwisko,
                               String ulica, String kod, String miejscowosc, String kraj, String firma) {
        UmowaEntity umowaEntity = new UmowaEntity();
        OfertaEntity ofertaEntity = new OfertaEntity();
        AukcjaEntity aukcjaEntity = aukcjaDAO.getAukcjaById(aukcjaTO.getId());
        UzytkownikEntity kupujacyEntity = uzytkownikDAO.getUzytkownikById(kupujacy.getId());
        DanedowysylkiEntity danedowysylkiEntity = ustawDaneDoWysylki(imie, nazwisko, ulica, kod, miejscowosc,
                kraj, firma, kupujacyEntity);
        ofertaService.dodajOferte(ofertaEntity, aukcjaEntity, kupujacyEntity, liczbaSztuk);
        umowaService.dodajUmowe(umowaEntity, aukcjaEntity, kupujacyEntity, ofertaEntity, liczbaSztuk, danedowysylkiEntity);
        aukcjaService.modyfikujAukcjePoKupnie(aukcjaEntity, liczbaSztuk);
    }
    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public void zwiekszLiczbeOdwiedzin(int idAukcji) {
        aukcjaService.zwiekszLiczbeOdwiedzin(idAukcji);
    }
    private DanedowysylkiEntity ustawDaneDoWysylki(String imie, String nazwisko, String ulica, String kod, String miejscowosc,
                                                   String kraj, String firma, UzytkownikEntity kupujacy) {
        DanedowysylkiEntity danedowysylkiEntity = daneDoWysylkiDAO.getDaneOInnymAdresieNizZamieszkania(kupujacy);
        daneDoWysylkiDAO.modyfikujDaneDoWysylki(imie, nazwisko, firma, danedowysylkiEntity.getId());
        adresDAO.modyfikujAdres(danedowysylkiEntity, ulica, kod, miejscowosc, danedowysylkiEntity.getAdresDoWysylki().getId());
        return danedowysylkiEntity;
    }
}