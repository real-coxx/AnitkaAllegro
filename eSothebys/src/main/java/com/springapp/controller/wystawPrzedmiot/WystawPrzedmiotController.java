package com.springapp.controller.wystawPrzedmiot;

import com.springapp.customExceptions.EsothebysPermissionException;
import com.springapp.dto.*;
import com.springapp.helpers.EsothebysSessionHelper;
import com.springapp.helpers.IEsothebysSessionHelper;
import com.springapp.model.Enums.DefinicjaJednostkiPrzedmiotuEnum;
import com.springapp.model.Enums.FormaPlatnosciEnum;
import com.springapp.model.Enums.TerminWysylkiEnum;
import com.springapp.model.KrajEntity;
import com.springapp.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;



/**
 * Created by Internet on 2015-01-30.
 */

@Controller
@RequestMapping("/wystawPrzedmiot")
public class WystawPrzedmiotController {

    @Autowired
    UzytkownikService uzytkownikService;
    @Autowired
    KategoriaService kategoriaService;
    @Autowired
    KrajService krajService;


    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView wystawPrzedmiot() {
        IEsothebysSessionHelper appContext = EsothebysSessionHelper.getInstance();
        ModelAndView modelAndView = new ModelAndView();
        UzytkownikTO currentUser = appContext.getCurrentUserForWystawPrzedmiot();

        try {
            CheckUserPermissions(currentUser);
        }catch (EsothebysPermissionException e){
            return new ModelAndView(new RedirectView("/wystawPrzedmiotBrakUprawnien"), "wiadomoscOBledzie", e.getMessage());
        }

        List<KategoriaTO> kategorieGlowne = kategoriaService.getKategorieGlowne();
        List<String> nazwyDefinicjiJednostekPrzedmiotu = getEnumValuesStrings(DefinicjaJednostkiPrzedmiotuEnum.class);
        List<String> nazwyTerminowWysylki = getEnumValuesStrings(TerminWysylkiEnum.class);
        List<String> nazwyFormPlatnosci = getEnumValuesStrings(FormaPlatnosciEnum.class);
        List<KrajEntity> kraje = krajService.getKrajeBezWojewodztw();

        modelAndView.addObject("nazwyDefinicjiJednostekPrzedmiotu", nazwyDefinicjiJednostekPrzedmiotu);
        modelAndView.addObject("nazwyTerminowWysylki", nazwyTerminowWysylki);
        modelAndView.addObject("nazwyFormPlatnosci", nazwyFormPlatnosci);
        modelAndView.addObject("kategorieGlowne", kategorieGlowne);
        modelAndView.addObject("currentUser", currentUser);
        modelAndView.addObject("kraje", kraje);

        return modelAndView;
    }

    private void CheckUserPermissions(UzytkownikTO currentUser) throws EsothebysPermissionException {
        if(!currentUser.getStatus().equals("aktywny")){
            throw new EsothebysPermissionException("Nie masz uprawnień do sprzedaży");
        }
    }

    private <T extends Enum> List<String> getEnumValuesStrings(Class<T> enumType){
        T[] enumVals = enumType.getEnumConstants();

        return null;
    }
}
