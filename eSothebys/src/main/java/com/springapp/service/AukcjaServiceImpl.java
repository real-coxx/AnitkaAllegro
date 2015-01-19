package com.springapp.service;

import com.springapp.builder.AukcjaBuilder;
import com.springapp.dao.AukcjaDAO;
import com.springapp.dto.AukcjaTO;
import com.springapp.model.AukcjaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

        AukcjaBuilder builder = new AukcjaBuilder();
        builder.setTytul(aukcjaEntity.getTytul())
                .setNumer(aukcjaEntity.getNumer())
                .setTerminZakonczenia(aukcjaEntity.getTerminZakonczenia())
                .setRodzajAukcji(aukcjaEntity.getRodzajAukcji())
                .setAktualnaCena(aukcjaEntity.getAktualnaCena())
                .setLiczbaDostepnychPrzedmiotow(aukcjaEntity.getLiczbaDostepnychPrzedmiotow())
                .setCenaKupTeraz(aukcjaEntity.getCenaKupTeraz())
                .setOpisPrzedmiotu(aukcjaEntity.getOpisPrzedmiotu())
                .setDodatkoweInformacjeODostawieIPlatnosci(aukcjaEntity.getDodatkoweInformacjeODostawieIPlatnosci())
                .setFormaPlatnosci(aukcjaEntity.getFormaPlatnosci())
                .setCenaMinimalna(aukcjaEntity.getCenaMinimalna());

        AukcjaTO aukcjaTO = new AukcjaTO(builder);
        return aukcjaTO;
    }
}
