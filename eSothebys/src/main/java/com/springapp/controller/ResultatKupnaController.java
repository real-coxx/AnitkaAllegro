package com.springapp.controller;

import com.springapp.builder.OfertaBuilder;
import com.springapp.dto.AukcjaTO;
import com.springapp.dto.OfertaTO;
import com.springapp.dto.UzytkownikTO;
import com.springapp.helpers.StanAukcji;
import com.springapp.model.KrajEntity;
import com.springapp.model.UmowaEntity;
import com.springapp.model.UzytkownikEntity;
import com.springapp.service.KrajService;
import com.springapp.service.OfertaService;
import com.springapp.service.OgolnyService;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

@Controller
@RequestMapping("/resultatKupna")
public class ResultatKupnaController {

    @Autowired
    OgolnyService ogolnyService;

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView zatwierdzZakup(HttpServletRequest request, HttpServletResponse response){

        AukcjaTO aukcjaTO = (AukcjaTO) request.getSession().getAttribute("aukcja");
        int liczbaSztuk = (Integer) request.getSession().getAttribute("liczbaSztuk");
        UzytkownikTO kupujacy = (UzytkownikTO) request.getSession().getAttribute("kupujacy");

        ModelAndView modelAndView = new ModelAndView();

        ogolnyService.potwierdzKupno(aukcjaTO, kupujacy, liczbaSztuk);

        boolean udaloSie = true;

        if (udaloSie) {
            String informacja = "Transakcja przebiegła pomyślnie. Przedmiot został zakupiony.";
            String skutek = "Udało się!";
            modelAndView = getModelAndView(modelAndView, informacja, skutek);
        } else {
            String informacja = "Transakcja się nie powiodła. Spróbuj ponownie.";
            String skutek = "Wystąpił błąd!";
            modelAndView = getModelAndView(modelAndView, informacja, skutek);
        }

        return modelAndView;
    }

    private ModelAndView getModelAndView(ModelAndView modelAndView, String informacja, String skutek) {
        modelAndView = new ModelAndView("resultatKupna");
        modelAndView.addObject("informacja", informacja);
        modelAndView.addObject("skutek", skutek);
        return modelAndView;
    }
}