package com.springapp.service;

import com.springapp.dao.*;
import com.springapp.dto.AukcjaTO;
import com.springapp.dto.UzytkownikTO;
import com.springapp.helpers.Constants;
import com.springapp.mailSending.MailPreparation;
import com.springapp.mailSending.TrescWiadomosciEmail;
import com.springapp.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
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

    @Autowired
    KrajDAO krajDAO;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public void potwierdzKupno(AukcjaTO aukcjaTO, UzytkownikTO kupujacy, int liczbaSztuk ,String imie, String nazwisko, String ulica, String kod,
                               String miejscowosc, String kraj, String firma, String telefon, String cenaCalkowita, String wiadomosc) throws IOException {
        UmowaEntity umowaEntity = new UmowaEntity();
        OfertaEntity ofertaEntity = new OfertaEntity();

        AukcjaEntity aukcjaEntity = aukcjaDAO.getAukcjaById(aukcjaTO.getId());
        UzytkownikEntity kupujacyEntity = uzytkownikDAO.getUzytkownikById(kupujacy.getId());

        DanedowysylkiEntity danedowysylkiEntity = ustawDaneDoWysylki(imie, nazwisko, ulica, kod, miejscowosc,
                kraj, firma, kupujacyEntity, aukcjaEntity.getWysylkaZaGranice());

        ofertaService.dodajOferte(ofertaEntity, aukcjaEntity, kupujacyEntity, liczbaSztuk);
        umowaService.dodajUmowe(umowaEntity, aukcjaEntity, kupujacyEntity, ofertaEntity, liczbaSztuk, danedowysylkiEntity);
        aukcjaService.modyfikujAukcjePoKupnie(aukcjaEntity, liczbaSztuk);

        String trescEmailDlaKupujacego = TrescWiadomosciEmail.wiadomoscDlaKupujacego(aukcjaTO, liczbaSztuk, cenaCalkowita);
        MailPreparation.sendEmail(Constants.E_MAIL_SYSTEMU, kupujacyEntity.getEmail(), Constants.TYTUL_E_MAIL_DLA_KUPUJACEGO, trescEmailDlaKupujacego);

        String trescEmailDlaSprzedajacego = TrescWiadomosciEmail.wiadomoscDlaSprzedajacego(aukcjaTO, danedowysylkiEntity, liczbaSztuk, cenaCalkowita, telefon, wiadomosc);
        MailPreparation.sendEmail(Constants.E_MAIL_SYSTEMU, aukcjaEntity.getSprzedawca().getEmail(), Constants.TYTUL_E_MAIL_DLA_SPRZEDAJACEGO, trescEmailDlaSprzedajacego);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public void zwiekszLiczbeOdwiedzin(int idAukcji) {
        aukcjaService.zwiekszLiczbeOdwiedzin(idAukcji);
    }

    private DanedowysylkiEntity ustawDaneDoWysylki(String imie, String nazwisko, String ulica, String kod, String miejscowosc,
                                   String kraj, String firma, UzytkownikEntity kupujacy, boolean czyZaGranice) throws IOException {
        DanedowysylkiEntity danedowysylkiEntity = daneDoWysylkiDAO.getDaneOInnymAdresieNizZamieszkania(kupujacy);

        daneDoWysylkiDAO.modyfikujDaneDoWysylki(imie, nazwisko, firma, danedowysylkiEntity.getId());

        adresDAO.modyfikujAdres(danedowysylkiEntity, ulica, kod, miejscowosc, danedowysylkiEntity.getAdresDoWysylki().getId());

        danedowysylkiEntity.setImie(imie);
        danedowysylkiEntity.setNazwisko(nazwisko);
        danedowysylkiEntity.setFirma(firma);
        danedowysylkiEntity.getAdresDoWysylki().setUlicaZNumerem(ulica);
        danedowysylkiEntity.getAdresDoWysylki().setMiejscowosc(miejscowosc);
        danedowysylkiEntity.getAdresDoWysylki().setKodPocztow(kod);
//        danedowysylkiEntity.getAdresDoWysylki().getKraj().setNazwa(kraj);

        KrajEntity krajEntity = krajDAO.getKrajByNazwa(kraj);
        if (null == krajEntity) {
            throw new IOException("Kraj podany przez Ciebie nie istnieje.");
        }
        else if (!krajEntity.getNazwa().equals("Polska")) {
            if (!czyZaGranice) {
                throw new IOException("Wysyłka za granicę nie jest możliwa.");
            }
        }

        return danedowysylkiEntity;

    }
}
