package com.springapp.service;

import com.springapp.builder.AukcjaBuilder;
import com.springapp.dao.specificDAO.AukcjaDAO;
import com.springapp.dto.AukcjaTO;
import com.springapp.helpers.StanAukcji;
import com.springapp.model.AukcjaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;

/**
 * Created by Alicja on 2015-01-19.
 */
@Service
public class AukcjaServiceImpl implements AukcjaService {

    @Autowired
    AukcjaDAO aukcjaDAO;

    @Override
    public AukcjaTO getAukcjaByIdForSkladanieOferty(int idAukcji) {
        AukcjaEntity aukcjaEntity = aukcjaDAO.getAukcjaById(idAukcji);

        String terminZakonczenia = new SimpleDateFormat("dd/MM/yyyy ,  HH:mm:ss").format(aukcjaEntity.getTerminZakonczenia());
        String terminRozpoczecia = new SimpleDateFormat("dd/MM/yyyy ,  HH:mm:ss").format(aukcjaEntity.getTerminRozpoczecia());

        AukcjaBuilder builder = new AukcjaBuilder();
        builder.setTytul(aukcjaEntity.getTytul())
                .setId(aukcjaEntity.getId())
                .setNumer(aukcjaEntity.getNumer())
                .setTerminZakonczenia(aukcjaEntity.getTerminZakonczenia())
                .setTerminZakonczeniaTekst(terminZakonczenia)
                .setRodzajAukcji(aukcjaEntity.getRodzajAukcji())
                .setAktualnaCena(aukcjaEntity.getAktualnaCena())
                .setLiczbaDostepnychPrzedmiotow(aukcjaEntity.getLiczbaDostepnychPrzedmiotow())
                .setCenaKupTeraz(aukcjaEntity.getCenaKupTeraz())
                .setOpisPrzedmiotu(aukcjaEntity.getOpisPrzedmiotu())
                .setDodatkoweInformacjeODostawieIPlatnosci(aukcjaEntity.getDodatkoweInformacjeODostawieIPlatnosci())
                .setFormaPlatnosci(aukcjaEntity.getFormaPlatnosci())
                .setCenaMinimalna(aukcjaEntity.getCenaMinimalna())
                .setMiniatura(aukcjaEntity.getMiniatura())
                .setStan(aukcjaEntity.getStan())
                .setCennikDostaw(aukcjaEntity.getCennikDostaw())
                .setKategoria(aukcjaEntity.getKategoria())
                .setWysylkaZaGranice(aukcjaEntity.getWysylkaZaGranice())
                .setTerminRozpoczeciaTekst(terminRozpoczecia)
                .setLiczbaOdwiedzin(aukcjaEntity.getLiczbaOdwiedzin())
                .setSprzedawca(aukcjaEntity.getSprzedawca());

        AukcjaTO aukcjaTO = new AukcjaTO(builder);
        return aukcjaTO;
    }

    @Override
    public void createAukcja(AukcjaTO aukcja) {


        aukcjaDAO.addAukcja();
    }

    @Override
    public void modyfikujAukcjePoKupnie(AukcjaEntity aukcjaEntity, int liczbaSztuk) {
        aukcjaDAO.modyfikujAukcjePoKupnie(aukcjaEntity, liczbaSztuk);

        if (aukcjaEntity.getLiczbaDostepnychPrzedmiotow() - liczbaSztuk == 0)
        {
            aukcjaDAO.zmienStanAukcji(aukcjaEntity, StanAukcji.ZamknietaPrzedCzasem.toString());
        }
    }

    @Override
    public void zwiekszLiczbeOdwiedzin(int idAukcji) {
        aukcjaDAO.zwiekszLiczbeOdwiedzin(idAukcji);
    }
}
