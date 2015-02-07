package com.springapp.controller.zlozenieOfertyKupTeraz;

import com.springapp.dto.AukcjaTO;
import com.springapp.dto.UzytkownikTO;
import com.springapp.helpers.LicytacjaWOsobachISztukach;
import com.springapp.service.AdresService;
import com.springapp.service.SzczegolyDostawyService;
import com.springapp.service.UzytkownikService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

@Controller
@RequestMapping("/platnosc")
public class PlatnoscIDostawaController {

    @Autowired
    SzczegolyDostawyService szczegolyDostawyService;

    @Autowired
    UzytkownikService uzytkownikService;

    @Autowired
    AdresService adresService;

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView potwierdzLicytację(HttpServletRequest request, HttpServletResponse response){

        AukcjaTO aukcjaTO = (AukcjaTO) request.getSession().getAttribute("aukcja");
        int liczbaSztuk = (Integer) request.getSession().getAttribute("liczbaSztuk");
        int idZalogowanegoUzytkownika = (Integer) request.getSession().getAttribute("idZalogowanegoUzytkownika");

        UzytkownikTO kupujacyTO = uzytkownikService.getUzytkownikById(idZalogowanegoUzytkownika);

        LicytacjaWOsobachISztukach licytacjaWOsobachISztukach = new LicytacjaWOsobachISztukach();
        licytacjaWOsobachISztukach.setIloscSztuk(liczbaSztuk);
        licytacjaWOsobachISztukach.sprawdzOdmianeSztukDlaPlatnosci();
        String odmiana = Integer.toString(liczbaSztuk) + " " + licytacjaWOsobachISztukach.getOdmianaSztuk();

        double cenaZaSztuki = liczbaSztuk * aukcjaTO.getCenaKupTeraz();

        int cennikDostawID = aukcjaTO.getCennikDostaw().getId();
        HashMap<String, Double> menuSposobuDostawy = szczegolyDostawyService.getMenuWyboruSposobuDostawy(cennikDostawID, liczbaSztuk);

        request.getSession().setAttribute("aukcja", aukcjaTO);
        request.getSession().setAttribute("liczbaSztuk", liczbaSztuk);
        request.getSession().setAttribute("kupujacy", kupujacyTO);

        ModelAndView modelAndView = new ModelAndView("platnoscIDostawa");
        modelAndView.addObject("liczbaSztuk", odmiana);
        modelAndView.addObject("aukcja", aukcjaTO);
        modelAndView.addObject("cenaZaSztuki", cenaZaSztuki);
        modelAndView.addObject("menuSposobuDostawy", menuSposobuDostawy);
        modelAndView.addObject("kupujacy", kupujacyTO);

        return modelAndView;
    }
}