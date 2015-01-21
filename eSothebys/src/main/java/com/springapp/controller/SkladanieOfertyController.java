package com.springapp.controller;

import com.springapp.dto.AukcjaTO;
import com.springapp.dto.KategoriaTO;
import com.springapp.service.AukcjaService;
import com.springapp.service.KategoriaService;
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
    private AukcjaService aukcjaService;

    @Autowired
    private KategoriaService kategoriaService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView zlozOfertę(ModelMap model) {
        AukcjaTO aukcja = aukcjaService.getAukcjaByIdForSkladanieOferty(1);

        int idKategorii = aukcja.getIdKategorii();
        KategoriaTO kategoria = kategoriaService.getKategoriaById(idKategorii);

        ModelAndView modelAndView = new ModelAndView("skladanieOferty");
        modelAndView.addObject("aukcjaTO", aukcja);
        modelAndView.addObject("kategoriaTO", kategoria);
        return modelAndView;
    }
}