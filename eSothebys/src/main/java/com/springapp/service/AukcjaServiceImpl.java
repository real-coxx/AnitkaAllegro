package com.springapp.service;

import com.springapp.builder.AukcjaBuilder;
import com.springapp.dao.AukcjaDAO;
import com.springapp.dto.AukcjaTO;
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

        String terminZakonczenia = new SimpleDateFormat("MM/dd/yyyy ,  HH:mm:ss").format(aukcjaEntity.getTerminZakonczenia());

        AukcjaBuilder builder = new AukcjaBuilder();
        builder.setTytul(aukcjaEntity.getTytul())
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
                .setIdZdjecia(aukcjaEntity.getZdjecie2ID())
                .setStan(aukcjaEntity.getStan())
                .setIdCennikDostaw(aukcjaEntity.getCennikDostaw2ID())
                .setIdKategorii(aukcjaEntity.getKategoria2ID());

        AukcjaTO aukcjaTO = new AukcjaTO(builder);
        return aukcjaTO;
    }
}
