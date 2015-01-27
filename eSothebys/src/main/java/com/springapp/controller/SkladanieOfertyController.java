package com.springapp.controller;

import com.springapp.dto.AukcjaTO;
import com.springapp.dto.KategoriaTO;
import com.springapp.dto.OfertaTO;
import com.springapp.dto.ZdjecieTO;
import com.springapp.helpers.LicytacjaWOsobachISztukach;
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
public class SkladanieOfertyController {

    @Autowired
    private ZdjecieService zdjecieService;

    @Autowired
    private AukcjaService aukcjaService;

    @Autowired
    private KategoriaService kategoriaService;

    @Autowired
    private OfertaService ofertaService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView zlozOfertę(ModelMap model) {
        int idAukcji = 1;

        AukcjaTO aukcja = aukcjaService.getAukcjaByIdForSkladanieOferty(idAukcji);

        ZdjecieTO zdjecie = zdjecieService.getZdjecieById(aukcja.getIdZdjecia());

        int idKategorii = aukcja.getIdKategorii();
        KategoriaTO kategoria = kategoriaService.getKategoriaById(idKategorii);

        List<String> nadkategorie = kategoriaService.getNazwyNadkategorii(idKategorii);

        List<OfertaTO> oferty = ofertaService.findOfertyByAukcjaDoOfertKupna(idAukcji);

        LicytacjaWOsobachISztukach kupTeraz = ofertaService.getKupTerazISztuki(idAukcji);
        LicytacjaWOsobachISztukach licytacja = ofertaService.getLicytacja(idAukcji);

        ModelAndView modelAndView = new ModelAndView("skladanieOferty");
        modelAndView.addObject("aukcjaTO", aukcja);
        modelAndView.addObject("kategoriaTO", kategoria);
        modelAndView.addObject("nadkategorie", nadkategorie);
        modelAndView.addObject("oferty", oferty);
        modelAndView.addObject("kupTeraz", kupTeraz);
        modelAndView.addObject("licytacja", licytacja);
        modelAndView.addObject("zdjecie", zdjecie);
        return modelAndView;
    }
}