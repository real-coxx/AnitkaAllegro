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

        String firma = request.getParameter("firmaWysylka");
        String imie = request.getParameter("imieWysylka");
        String nazwisko = request.getParameter("nazwiskoWysylka");
        String ulica = request.getParameter("ulicaWysylka");
        String kod = request.getParameter("kodWysylka");
        String miejscowosc = request.getParameter("miejscowoscWysylka");
        String kraj = request.getParameter("krajWysylka");

        if (!ifAllFieldsAreEmpty(imie, nazwisko, ulica, kod, miejscowosc, kraj, firma) &&
                ifAnyFieldIsEmpty(imie, nazwisko, ulica, kod, miejscowosc, kraj, firma)) {
            String informacja = "Jeśli chcesz podać inny adres wysyłki, musisz uzupełnić wszystkie pola. W przeciwnym wypadku wyczyść je.";
            String skutek = "Błędne dane!";
            String strona = "niepoprawnyAdresWysylki";
            modelAndView = getModelAndView(modelAndView, informacja, skutek, strona);
            return modelAndView;
        }

        try {
            ogolnyService.potwierdzKupno(aukcjaTO, kupujacy, liczbaSztuk, imie, nazwisko, ulica, kod, miejscowosc, kraj, firma );
            String informacja = "Transakcja przebiegła pomyślnie. Przedmiot został zakupiony.";
            String skutek = "Udało się!";
            String strona = "resultatKupna";
            modelAndView = getModelAndView(modelAndView, informacja, skutek, strona);
        } catch (Exception ex) {
            String informacja = "Transakcja się nie powiodła. Spróbuj ponownie.";
            String skutek = "Wystąpił błąd!";
            String strona ="resultatKupna";
            modelAndView = getModelAndView(modelAndView, informacja, skutek, strona);
        }

        return modelAndView;
    }

    private ModelAndView getModelAndView(ModelAndView modelAndView, String informacja, String skutek, String strona) {
        modelAndView = new ModelAndView(strona);
        modelAndView.addObject("informacja", informacja);
        modelAndView.addObject("skutek", skutek);
        return modelAndView;
    }

    private boolean ifAnyFieldIsEmpty(String imie, String nazwisko, String ulica, String kod, String miejscowosc, String kraj, String firma) {
        return firma.trim().equals("")
                || imie.trim().equals("")
                || nazwisko.trim().equals("")
                || ulica.trim().equals("")
                || kod.trim().equals("")
                || miejscowosc.trim().equals("")
                || kraj.trim().equals("");
    }

    private boolean ifAllFieldsAreEmpty(String imie, String nazwisko, String ulica, String kod, String miejscowosc, String kraj, String firma) {
        return firma.trim().equals("")
                && imie.trim().equals("")
                && nazwisko.trim().equals("")
                && ulica.trim().equals("")
                && kod.trim().equals("")
                && miejscowosc.trim().equals("")
                && kraj.trim().equals("");
    }
}