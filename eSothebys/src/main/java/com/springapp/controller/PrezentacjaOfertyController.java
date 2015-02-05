package com.springapp.controller;

import com.springapp.dto.AukcjaTO;
import com.springapp.dto.KategoriaTO;
import com.springapp.dto.OfertaTO;
import com.springapp.dto.ZdjecieTO;
import com.springapp.helpers.LicytacjaWOsobachISztukach;
import com.springapp.model.KategoriaEntity;
import com.springapp.model.ZdjecieEntity;
import com.springapp.service.AukcjaService;
import com.springapp.service.KategoriaService;
import com.springapp.service.OfertaService;
import com.springapp.service.ZdjecieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/")
public class PrezentacjaOfertyController {

    @Autowired
    private ZdjecieService zdjecieService;

    @Autowired
    private AukcjaService aukcjaService;

    @Autowired
    private KategoriaService kategoriaService;

    @Autowired
    private OfertaService ofertaService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView zlozOfertę(HttpServletRequest request, ModelMap model) {
        int idAukcji = 1;
        int idZalogowanegoUzytkownika = 4;

        AukcjaTO aukcjaTO = aukcjaService.getAukcjaByIdForSkladanieOferty(idAukcji);

//        ZdjecieEntity miniaturaEntity = aukcjaTO.getMiniatura();

//        KategoriaEntity kategoriaEntity = aukcjaTO.getKategoria();
        List<String> nadkategorie = kategoriaService.getNazwyNadkategorii(aukcjaTO.getKategoria().getId());

        List<OfertaTO> oferty = ofertaService.findOfertyByAukcjaDoOfertKupna(idAukcji);

        LicytacjaWOsobachISztukach kupTeraz = ofertaService.getKupTerazISztuki(idAukcji);
        LicytacjaWOsobachISztukach licytacja = ofertaService.getLicytacja(idAukcji);

        ModelAndView modelAndView = new ModelAndView("skladanieOferty");
        modelAndView.addObject("aukcjaTO", aukcjaTO);
//        modelAndView.addObject("kategoriaTO", aukcjaTO.getKategoria());
        modelAndView.addObject("nadkategorie", nadkategorie);
        modelAndView.addObject("oferty", oferty);
        modelAndView.addObject("kupTeraz", kupTeraz);
        modelAndView.addObject("licytacja", licytacja);
//        modelAndView.addObject("zdjecie", aukcjaTO.getMiniatura());
        request.getSession().setAttribute("aukcja", aukcjaTO);
//        request.getSession().setAttribute("liczbaDostepnychSztuk", aukcja.getLiczbaDostepnychPrzedmiotow());
//        request.getSession().setAttribute("stanAukcji", aukcja.getStan());
        request.getSession().setAttribute("idZalogowanegoUzytkownika", idZalogowanegoUzytkownika);
        return modelAndView;
    }
}