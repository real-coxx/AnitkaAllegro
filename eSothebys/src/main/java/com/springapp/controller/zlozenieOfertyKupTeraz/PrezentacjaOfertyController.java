package com.springapp.controller.zlozenieOfertyKupTeraz;

import com.springapp.dto.*;
import com.springapp.helpers.LicytacjaWOsobachISztukach;
import com.springapp.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/")
public class PrezentacjaOfertyController {

    @Autowired
    private SzczegolyDostawyService szczegolyDostawyService;

    @Autowired
    private AukcjaService aukcjaService;

    @Autowired
    private KategoriaService kategoriaService;

    @Autowired
    private OfertaService ofertaService;

    @Autowired
    OgolnyService ogolnyService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView zlozOfertę(HttpServletRequest request, ModelMap model) {
        int idAukcji = 1;
        int idZalogowanegoUzytkownika = 4;

        ogolnyService.zwiekszLiczbeOdwiedzin(idAukcji);

        AukcjaTO aukcjaTO = aukcjaService.getAukcjaByIdForSkladanieOferty(idAukcji);

        List<SzczegolyDostawyTO> szczegolydostawyTOs = szczegolyDostawyService
                .getSzczegolyDostawyByCennikDostaw(aukcjaTO.getCennikDostaw().getId());

        List<String> nadkategorie = kategoriaService.getNazwyNadkategorii(aukcjaTO.getKategoria().getId());

        List<OfertaTO> oferty = ofertaService.findOfertyByAukcjaDoOfertKupna(idAukcji);

        LicytacjaWOsobachISztukach kupTeraz = ofertaService.getKupTerazISztuki(idAukcji);
        LicytacjaWOsobachISztukach licytacja = ofertaService.getLicytacja(idAukcji);

        ModelAndView modelAndView = new ModelAndView("skladanieOferty");
        modelAndView.addObject("aukcjaTO", aukcjaTO);
        modelAndView.addObject("nadkategorie", nadkategorie);
        modelAndView.addObject("oferty", oferty);
        modelAndView.addObject("kupTeraz", kupTeraz);
        modelAndView.addObject("licytacja", licytacja);
        modelAndView.addObject("szczegolydostawyTOs", szczegolydostawyTOs);

        request.getSession().setAttribute("aukcja", aukcjaTO);
        request.getSession().setAttribute("idZalogowanegoUzytkownika", idZalogowanegoUzytkownika);

        return modelAndView;
    }
}