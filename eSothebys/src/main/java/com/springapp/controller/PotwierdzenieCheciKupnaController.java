package com.springapp.controller;

        import com.springapp.dto.AukcjaTO;
        import com.springapp.helpers.StanAukcji;
        import com.springapp.model.KrajEntity;
        import com.springapp.service.KrajService;
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
@RequestMapping("/checKupna")
public class PotwierdzenieCheciKupnaController {

    @RequestMapping(params = "licytuj", method = RequestMethod.POST)
    public String potwierdzLicytację(HttpServletRequest request, HttpServletResponse response){
        return "potwierdzenieLicytacji";
    }

    @RequestMapping(params = "kupTeraz", method = RequestMethod.POST)
    public ModelAndView potwierdzKupTeraz(HttpServletRequest request, HttpServletResponse response){
        ModelAndView modelAndView = new ModelAndView();
        AukcjaTO aukcjaTO = (AukcjaTO) request.getSession().getAttribute("aukcja");
        int liczbaDOstepnychSztuk = aukcjaTO.getLiczbaDostepnychPrzedmiotow();
        String stanAukcji = aukcjaTO.getStan();
        int liczbaSztuk = 0;

        try{
            liczbaSztuk = Integer.parseInt(request.getParameter("liczbaSztuk"));
        }
        catch (Exception e) {
            String informacja = "Wprowadzone dane są niepoprawne.";
            String strona = "niepowodzenie";
            modelAndView = getModelAndView(modelAndView, informacja, strona);
            return modelAndView;
        }

        if (!stanAukcji.equals(StanAukcji.Aktywna.name())) {
            String informacja = "Aukcja nieaktywna. Nie możesz brać udziału w tej aukcji.";
            String strona = "niepowodzenie";
            modelAndView = getModelAndView(modelAndView, informacja, strona);
        } else if (liczbaSztuk < 1) {
            String informacja = "Musisz kupić co najmniej jeden produkt.";
            String strona = "niepowodzenie";
            modelAndView = getModelAndView(modelAndView, informacja, strona);
        } else if (liczbaSztuk > liczbaDOstepnychSztuk) {
            String informacja = "Niestety, sprzedawca nie posiada tylu dostępnych przedmiotów. " +
                    "Dostępna liczba sztuk wynosi: " + liczbaDOstepnychSztuk + ".";
            String strona = "niepowodzenie";
            modelAndView = getModelAndView(modelAndView, informacja, strona);
        }
        else {
            modelAndView = new ModelAndView("potwierdzenieKupTeraz");
            modelAndView.addObject("liczbaSztuk", liczbaSztuk);
            modelAndView.addObject("aukcja", aukcjaTO);
            request.getSession().setAttribute("liczbaSztuk", liczbaSztuk);
            request.getSession().setAttribute("aukcja", aukcjaTO);
        }

        return modelAndView;
    }

    private ModelAndView getModelAndView(ModelAndView modelAndView, String informacja, String strona) {
        modelAndView = new ModelAndView(strona);
        modelAndView.addObject("informacja", informacja);
        return modelAndView;
    }
}