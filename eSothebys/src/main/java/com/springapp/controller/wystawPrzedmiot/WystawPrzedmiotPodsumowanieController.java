package com.springapp.controller.wystawPrzedmiot;

import com.springapp.builder.AukcjaBuilder;
import com.springapp.builder.SzczegolyBuilder;
import com.springapp.builder.SzczegolyDostawyBuilder;
import com.springapp.dto.*;
import com.springapp.helpers.EsothebysSessionHelper;
import com.springapp.helpers.IEsothebysSessionHelper;
import com.springapp.helpers.ValidationHelper;
import com.springapp.model.Enums.FormaPlatnosciEnum;
import com.springapp.model.KategoriaEntity;
import com.springapp.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Timestamp;
import java.util.*;


/**
 * Created by Internet on 2015-01-30.
 */

@Controller
@RequestMapping("/podsumowanieWystawienia")
public class WystawPrzedmiotPodsumowanieController {

    @Autowired
    UzytkownikService uzytkownikService;
    @Autowired
    KategoriaService aukcjaService;
    @Autowired
    Parametr2_kategoriaService parametrToKategoriaService; //do walidacji poprawności wartości
    @Autowired
    OpcjaDodatkowaService opcjadodatkowaService;
    @Autowired
    ParametrService parametrService;
    @Autowired
    WartosciService wartosciService;
    @Autowired
    WojewodztwoService wojewodztwoService;
    @Autowired
    CennikdostawService cennikdostawService;
    @Autowired
    SposobDostawyService sposobDostawyService;
    @Autowired
    KrajService krajService;
    @Autowired
    SzczegolyDostawyService szczegolyDostawyService;


    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView podsumowanieWystawienia(HttpServletRequest request, HttpServletResponse response) {
        IEsothebysSessionHelper appContext = EsothebysSessionHelper.getInstance();
        ModelAndView modelAndView = new ModelAndView();
        UzytkownikTO currentUser = appContext.getCurrentUserForWystawPrzedmiot();
        List<String> validationIssues = new ArrayList<String>();

        List<String> categoryParamsRequestParameterNames = getRequestParStrings(request.getParameterNames(), "catParametr"); //nazewnictwo w widoku: "catParametr+^[idParametru]"
        List<String> opcjePromowaniaRequestParameterNames = getRequestParStrings(request.getParameterNames(), "optPromowania"); //nazewnictwo w widoku: "optPromowania+^[idOpcji]"
        List<String> sposobyDostawyRequestParameterNames = getRequestParStrings(request.getParameterNames(), "optWys"); // nazewnictwo w widoku: "optWys+^[idOpcji]+^["pierwSzt" | "kolSzt" | "wPaczce"]"


        ///walidacja://////////////////////////////////////////////////////////////////////////
        //Tytuł aukcji
        String tytulAukcji = request.getParameter("tytul");
        if(tytulAukcji == null){
            validationIssues.add("Tytuł aukcji - nie może być pusty");
            tytulAukcji = "";
        }else{
            if(!ValidationHelper.hasCorrectLength(tytulAukcji, 1, 50)){
                validationIssues.add("Tytuł aukcji - może mieć maksymalnie 50 znaków");
            }
            if(!ValidationHelper.tytulAukcjiCorrectChars(tytulAukcji)){
                validationIssues.add("Tytuł aukcji - użyto niedozwolonych znaków");
            }
        }

        //kategoria
        long idWybranejKategorii = -1;
        if(request.getParameter("kategoria") != null){
            try{
                idWybranejKategorii = Long.parseLong(request.getParameter("kategoria"));
            }catch(Exception e){
                validationIssues.add("Kategoria - nie wybrano kategorii");
            }
        }else{
            validationIssues.add("Kategoria - nie wybrano kategorii");
            return modelAndView;
        }

        //kodEan
        String kodEANISBN = request.getParameter("kodEANISBN");
        if(kodEANISBN == null){
            kodEANISBN = null;
        }else{
            if(!ValidationHelper.hasCorrectLength(kodEANISBN, 1, 20)){
                validationIssues.add("Kod EAN/ISBN - może mieć maksymalnie 20 znaków");
            }
            if(!ValidationHelper.aukcjaEANISBNCorrectChars(kodEANISBN)){
                validationIssues.add("Kod EAN/ISBN - użyto niedozwolonych znaków");
            }
        }

        //parametry kategorii
        List<SzczegolyTO> wybraneSzczegolyKategorii = new ArrayList<SzczegolyTO>();
        Map<Long, ParametrTO> wszystkieParametryKategorii = parametrService.getAllParametersForCategoryId(idWybranejKategorii);
        SzczegolyBuilder newSzczegolyBuilder;
        String currentSpecificParameterViewControlName;
        String[] currentSpecificParameterValues;

        for(Map.Entry<Long, ParametrTO> val : wszystkieParametryKategorii.entrySet()){


            currentSpecificParameterViewControlName = "catParametr+^[idParametru]"
                    .replace("+^[idParametru]", "+^" + val.getKey().toString());
            currentSpecificParameterValues = request.getParameterValues(currentSpecificParameterViewControlName);



            if(currentSpecificParameterValues == null){
                if(val.getValue().getObligatoryjny()){
                    validationIssues.add(String.format("Parametr %s - parametr obligatoryjny.", val.getValue().getNazwa()));
                }
            }else{
                newSzczegolyBuilder = new SzczegolyBuilder();
                newSzczegolyBuilder.setParametr(val.getKey());

                switch (val.getValue().getTyp()){
                    case checkBoxList:
                        newSzczegolyBuilder.setWybraneWartosci(currentSpecificParameterValues);
                        break;
                    case textBox:
                        newSzczegolyBuilder.setWprowadzonaWartosc(currentSpecificParameterValues[0]);
                        break;
                    case comboBox:
                        newSzczegolyBuilder.setWybraneWartosci(currentSpecificParameterValues);
                        break;
                    case zakres:
                        newSzczegolyBuilder.setWprowadzonaWartosc(currentSpecificParameterValues[0]);
                        try {
                            if(!ValidationHelper.isNumericType(
                                    currentSpecificParameterValues[0],
                                    new String[] {
                                            String.valueOf(Double.parseDouble(val.getValue().getMozliweWartosci().get(0).getZakresDolny())),
                                            "weak",
                                            "weak",
                                            String.valueOf(Double.parseDouble(val.getValue().getMozliweWartosci().get(0).getZakresGorny()))
                                    },
                                    Double.TYPE)){
                                validationIssues.add(String.format("Parametr %s - nieprawidłowa wartość parametru.", val.getValue().getNazwa()));
                            }
                        } catch (Exception e) {
                            //błąd krytyczny - błąd w kodzie
                        }
                    default:
                        break;
                }

                wybraneSzczegolyKategorii.add(new SzczegolyTO(newSzczegolyBuilder));
            }
        }

        //opcje dodatkowe
        List<OpcjadodatkowaTO> opcjePromowania = new ArrayList<OpcjadodatkowaTO>();
        String[] info;
        OpcjadodatkowaTO currentOpt;

        for(String val : opcjePromowaniaRequestParameterNames){
            info = val.split("\\+\\^");
            currentOpt = opcjadodatkowaService.getOpcjaDodatkowaById(Long.parseLong(info[1]));

            if(currentOpt.getCzyOpcjaDodatkowaUzytkownika()){
                try{
                    if(!ValidationHelper.isCorrectCurrencyValue(
                            request.getParameter(val),
                            currentOpt.getOgraniczeniaCenyUzytkownika().split("\\+\\^"))){
                        validationIssues.add(String.format("Opcja promowania: %s - błędna wartość.", currentOpt.getNazwa()));
                    }
                    currentOpt.setWprowadzonaWartosc();
                }catch(Exception e){
                    //błąd krytyczny - błąd kodu
                }
            }else{
                opcjePromowania.add(currentOpt);
            }
        }

        //zdjecia
        List<String> zdjeciaURLs = new ArrayList<String>();
        for(int i=1; i<9; i++) {
            if (request.getParameter(String.format("zdjecie%s", i)) != null) {
                if (!ValidationHelper.isURL(request.getParameter(String.format("zdjecie%s", i)))) {
                    validationIssues.add(String.format("Zdjęcie numer %s - niepoprawny adres URL.", i));
                }
                zdjeciaURLs.add(request.getParameter(String.format("zdjecie%s", i)));
            } else {
                zdjeciaURLs.add(null);
            }
        }

        //rodzaj aukcji  -  0 dla licytacja, 1 dla tylko kup teraz;
        int rodzajAukcji = -1;
        if(request.getParameter("rodzajAukcji") != null){
            rodzajAukcji = Integer.parseInt(request.getParameter("rodzajAukcji"));
        }else{
            validationIssues.add("Rodzaj aukcji - musisz wybrać rodzaj aukcji.");
        }
        
        //liczbaJednostek
        int liczbaJednostek = -1;
        if(request.getParameter("liczbaJednostek") == null){
            validationIssues.add("Liczba jednostek towaru - musisz określić ilość towaru jaki sprzedajesz.");
        }else{
            try {
                if(!ValidationHelper.isNumericType(
                        request.getParameter("liczbaJednostek"),
                        new String[] {"0", "weak", "weak", "1000"},
                        Integer.TYPE)){
                    validationIssues.add("Liczba jednostek towaru - błędne dane; wymagana liczba całkowita z zakresu 1..999.");
                }else{
                    liczbaJednostek = Integer.parseInt(request.getParameter("liczbaJednostek"));
                }
            } catch (Exception e) {
                //błąd krytyczny - błąd kodu
            }
        }

        //rodzaj jednostki
        String rodzajJednostki = request.getParameter("rodzajJednostki");
        if(rodzajJednostki == null){
            validationIssues.add("Rodzaj jednostki - określ rodzaj jednostki sprzedawanego towaru.");
        }

        //cena wywolawcza
        Double cenaWywolawcza = null;
        if(request.getParameter("cenaWywolawcza") != null){
            try{
                if(ValidationHelper.isCorrectCurrencyValue(request.getParameter("cenaWywolawcza"), new String[] {"1", "strong", "strong", "10000000"})){
                    cenaWywolawcza = Double.parseDouble(request.getParameter("cenaWywolawcza"));
                }else{
                    validationIssues.add("Cena wywoławcza - błędne dane; wymagana reprezentacja waluty z zakresu 1..10000000.");
                }
            }catch(Exception e){
                //błąd krytyczny - błąd kodu
            }
            if(rodzajAukcji != 0){
                cenaWywolawcza = null;
            }
        }else{
            if(rodzajAukcji == 0) {
                validationIssues.add("Cena wywoławcza - nie podano ceny wywoławczej");
            }
        }

        //cena kup teraz
        Double cenaKupTeraz = null;
        if(request.getParameter("cenaKupTeraz") != null){
            try{
                if(ValidationHelper.isCorrectCurrencyValue(request.getParameter("cenaKupTeraz"), new String[] {"1", "strong", "strong", "10000000"})){
                    cenaKupTeraz = Double.parseDouble(request.getParameter("cenaKupTeraz"));
                    if(cenaWywolawcza != null) {
                        if(cenaKupTeraz < cenaWywolawcza){
                            validationIssues.add("Cena Kup Teraz - cena Kup Teraz powinna być wyższa niż cena wywoławcza");
                        }
                    }
                }else{
                    validationIssues.add("Cena Kup Teraz - błędne dane; wymagana reprezentacja waluty z zakresu 1..10000000.");
                }
            }catch(Exception e){
                //błąd krytyczny - błąd kodu
            }
        }else{
            if(rodzajAukcji == 1) {
                validationIssues.add("Cena Kup Teraz - nie podano ceny Kup Teraz");
            }
        }

        //cena minimalna
        Double cenaMinimalna = null;
        if(request.getParameter("czyCenaMinimalna") != null && rodzajAukcji == 0 && (cenaWywolawcza != null || cenaKupTeraz != null)) {
            Double upperVal;
            if(cenaWywolawcza != null && cenaKupTeraz != null) {
                upperVal = Math.max(cenaWywolawcza, cenaKupTeraz);
            }else{
                if(cenaWywolawcza != null){
                    upperVal = cenaWywolawcza;
                }else{
                    upperVal = cenaKupTeraz;
                }
            }

            if(request.getParameter("cenaMinimalna") != null){
                try{
                    if(ValidationHelper.isCorrectCurrencyValue(request.getParameter("cenaMinimalna"), new String[] {"1", "strong", "strong", upperVal.toString()})){
                        cenaMinimalna = Double.parseDouble(request.getParameter("cenaMinimalna"));
                    }else{
                        validationIssues.add("Cena minimalna - błędne dane; wymagana reprezentacja waluty o wartości mniejszej niż cena wywoławcza oraz cena kup teraz.");
                    }
                }catch(Exception e){
                    //błąd krytyczny - błąd kodu
                }
            }else{
                validationIssues.add("Cena minimalna - nie ustalono ceny minimalnej");
            }
        }

        //czas trwania
        int czasTrwania = -1;
        if(request.getParameter("czasTrwania") != null){
            czasTrwania = Integer.parseInt(request.getParameter("czasTrwania"));
        }else{
            validationIssues.add("Czas trwania - wymagane określenie długości okresu trwania aukcji.");
        }

        //termin rozpoczecia
        String terminStartu = request.getParameter("terminStartu");
        Timestamp terminRozpoczecia = null;

        if(terminStartu.equals("pozniej")){

            int dzien = request.getParameter("dzienRozp") == null? -1 : Integer.parseInt(request.getParameter("dzienRozp"));
            int godzina = request.getParameter("godzinaRozp") == null? -1 : Integer.parseInt(request.getParameter("godzinaRozp"));
            int minuta = request.getParameter("minutaRozp") == null? -1 : Integer.parseInt(request.getParameter("minutaRozp"));

            if(dzien == -1 || godzina == -1 || minuta == -1){
                validationIssues.add("Niepoprawnie określony termin rozpoczęcia aukcji");
            }

            Calendar futureDate = Calendar.getInstance();
            futureDate.add(Calendar.DATE, dzien);
            futureDate.add(Calendar.HOUR, godzina);
            futureDate.add(Calendar.MINUTE, minuta);

            terminRozpoczecia = new Timestamp(
                    futureDate.get(Calendar.YEAR),
                    futureDate.get(Calendar.MONTH),
                    futureDate.get(Calendar.DAY_OF_MONTH),
                    futureDate.get(Calendar.HOUR),
                    futureDate.get(Calendar.MINUTE),
                    0,
                    0);
        }

        //formy płatności
        List<String> wybraneFormyPlatnosci = new ArrayList<String>();
        for(int i=0; i<FormaPlatnosciEnum.values().length; i++){
            if(request.getParameter(String.format("formaPlatnosci%s", i)) != null){
                wybraneFormyPlatnosci.add(FormaPlatnosciEnum.values()[i].name());
            }
        }
        if(wybraneFormyPlatnosci.size() == 0){
            validationIssues.add("Wybrane formy płatności - wymagana conajmniej jedna z opcji.");
            wybraneFormyPlatnosci = null;
        }

        //dodatkowe informacje o płatności i dostawie
        String dodatkoweInfoOPlatnosciIDostawie = null;
        if(request.getParameter("dodatkoweInfoOPlatnosciIDostawie") != null){
            if(ValidationHelper.hasCorrectLength(request.getParameter("dodatkoweInfoOPlatnosciIDostawie"), 1, 200)) {
                dodatkoweInfoOPlatnosciIDostawie = request.getParameter("dodatkoweInfoOPlatnosciIDostawie");
            }else{
                validationIssues.add("Dodatkowe informacje o płatności i dostawie - długość wiadomości nie może przekroczyć 200 znaków");
            }
        }

        //koszt pokrywa sprzedawca
        boolean kosztPokrywaSprzedawca = false;
        if(request.getParameter("kosztPokrywaSprzedawca") != null){
            kosztPokrywaSprzedawca = true;
        }

        //numer konta 1
        String numerKonta1 = null;
        if(request.getParameter("numerKonta1") != null){
            if(ValidationHelper.isValidNumerKonta(request.getParameter("numerKonta1"))){
                numerKonta1 = request.getParameter("numerKonta1");
            }else{
                validationIssues.add("Numer konta 1 - niepoprawny numer konta.");
            }
        }

        //numer konta 2
        String numerKonta2 = null;
        if(request.getParameter("numerKonta2") != null){
            if(ValidationHelper.isValidNumerKonta(request.getParameter("numerKonta2"))){
                numerKonta2 = request.getParameter("numerKonta2");
            }else{
                validationIssues.add("Numer konta 2 - niepoprawny numer konta.");
            }
        }

        //wysylka za granice
        boolean wysylkaZaGranice = false;
        if(request.getParameter("wysylkaZaGranice") != null){
            wysylkaZaGranice = true;
        }

        //wysytawiam faktury VAT
        boolean fakturaVAT = false;
        if(request.getParameter("fakturaVAT") != null){
            fakturaVAT = true;
        }

        //lokalizacja
        String miejscowosc = null;
        String kodPocztowy = null;
        Long wojewodztwoId = null;
        Long krajId;
        boolean krajMaWojewodztwa = false;
        if(request.getParameter("miejscowosc") != null){
            if(ValidationHelper.isCorrectMiejscowoscName(request.getParameter("miejscowosc"))){

            }else{
                validationIssues.add("Lokalizacja - nieprawidłowa nazwa miejscowości");
            }
        }else{
            validationIssues.add("Lokalizacja - pole miejscowość jest wymagane.");
        }
        if(request.getParameter("kodPocztowy") != null){
            if(ValidationHelper.isCorrectKodPocztowy(request.getParameter("kodPocztowy"))){

            }else{
                validationIssues.add("Lokalizacja - nieprawidłowy kod pocztowy");
            }
        }else{
            validationIssues.add("Lokalizacja - pole kod pocztowy jest wymagane.");
        }
        if(request.getParameter("kraj") != null){
            krajId = Long.parseLong(request.getParameter("kraj"));
            krajMaWojewodztwa = krajService.czyKrajMaWojewodztwa(krajId);

            if(request.getParameter("wojewodztwo") != null){
                WojewodztwoTO current = wojewodztwoService.getWojewodztwoById(Long.parseLong(request.getParameter("wojewodztwo")));
                if(current.getKraj().getId() == krajId){
                    wojewodztwoId = current.getId();
                }
            }else{
                if(krajMaWojewodztwa){
                    validationIssues.add("Lokalizacja - pole województwo jest wymagane.");
                }
            }
        }else{
            validationIssues.add("Lokalizacja - pole kraj jest wymagane.");
        }

        //Płatność i dostawa
        String nazwaNowegoCennika = null;

        if(request.getParameter("nowyCennikNazwa") != null){
            if(ValidationHelper.hasCorrectLength(request.getParameter("nowyCennikNazwa"), 10, 50)){
                nazwaNowegoCennika = request.getParameter("nowyCennikNazwa");
            }else{
                validationIssues.add("Nazwa cennika - długość nazwy powinna zawierać się między 10 a 50 znaków");
            }
        }

        //Opcje dostawy - Przedpłata
        Map<Long, SposobDostawyTO> wszystkieSposobyDostawy = sposobDostawyService.getAllSposobyDostawy();
        List<SzczegolyDostawyTO> wybraneSposobyDostawy = new ArrayList<SzczegolyDostawyTO>();
        SzczegolyDostawyBuilder newSzczegolyDostawyBuilder;
        String currentSzczegolDostawyValPierwszaSztuka;
        String currentSzczegolDostawyValKolejnaSztuka;
        String currentSzczegolDostawyValLiczbaWPaczce;

        for(Map.Entry<Long, SposobDostawyTO> val : wszystkieSposobyDostawy.entrySet()){

            if(!val.getValue().getEdytowalny()){
                if(request.getParameter("optWys+^[idOpcji]".replace("+^[idOpcji]", "+^" + val.getKey())) != null){
                    newSzczegolyDostawyBuilder = new SzczegolyDostawyBuilder();
                    newSzczegolyDostawyBuilder.setId(
                            szczegolyDostawyService.getSzczegolyDostawyBySposobDostawy(
                                    val.getValue().getId())
                                    .getId());
                    wybraneSposobyDostawy.add(new SzczegolyDostawyTO(newSzczegolyDostawyBuilder));
                    continue;
                }
            }

            currentSzczegolDostawyValPierwszaSztuka = request.getParameter("optWys+^[idOpcji]+^[nrPola]"
                    .replace("+^[idOpcji]", "+^" + val.getKey())
                    .replace("+^[nrPola]", "+^" + 1));

            currentSzczegolDostawyValKolejnaSztuka = request.getParameter("optWys+^[idOpcji]+^[nrPola]"
                    .replace("+^[idOpcji]", "+^" + val.getKey())
                    .replace("+^[nrPola]", "+^" + 2));

            currentSzczegolDostawyValLiczbaWPaczce = request.getParameter("optWys+^[idOpcji]+^[nrPola]"
                    .replace("+^[idOpcji]", "+^" + val.getKey())
                    .replace("+^[nrPola]", "+^" + 3));

            if(currentSzczegolDostawyValPierwszaSztuka == null &&
                    currentSzczegolDostawyValKolejnaSztuka == null &&
                    currentSzczegolDostawyValLiczbaWPaczce == null) {
            }else {
                newSzczegolyDostawyBuilder = new SzczegolyDostawyBuilder();
                newSzczegolyDostawyBuilder.setSposobDostawy(val.getValue());

                if(currentSzczegolDostawyValPierwszaSztuka != null) {
                    if (!ValidationHelper.isCorrectCurrencyValue(currentSzczegolDostawyValPierwszaSztuka)) {
                        validationIssues.add(String.format("Opcja dostawy %s - błędna kwota pierwszej sztuki", val.getValue().getName()));
                    }else{
                        newSzczegolyDostawyBuilder.setKosztPierwszejSztuki(Double.parseDouble(currentSzczegolDostawyValPierwszaSztuka));
                    }
                }else{
                    validationIssues.add(String.format("Opcja dostawy %s - wymagana kwota pierwszej sztuki", val.getValue().getName()));
                }
                if(currentSzczegolDostawyValKolejnaSztuka != null) {
                    if (!ValidationHelper.isCorrectCurrencyValue(currentSzczegolDostawyValKolejnaSztuka)) {
                        validationIssues.add(String.format("Opcja dostawy %s - błędna kwota kolejnej sztuki", val.getValue().getName()));
                    }else{
                        newSzczegolyDostawyBuilder.setKosztKolejnejSztuki(Double.parseDouble(currentSzczegolDostawyValKolejnaSztuka));
                    }
                }else{
                    validationIssues.add(String.format("Opcja dostawy %s - wymagana kwota kolejnej sztuki", val.getValue().getName()));
                }
                if(currentSzczegolDostawyValLiczbaWPaczce != null) {
                    try {
                        if (!ValidationHelper.isNumericType(
                                currentSzczegolDostawyValLiczbaWPaczce,
                                new String[]{"0", "weak", "weak", "1000"},
                                Integer.TYPE)) {
                            validationIssues.add(String.format("Opcja dostawy %s - ilość sztuk w paczce to liczba całkowita z zakresu 1..999", val.getValue().getName()));
                        }else{
                            newSzczegolyDostawyBuilder.setLiczbaWPaczce(Integer.parseInt(currentSzczegolDostawyValLiczbaWPaczce));
                        }
                    } catch (Exception e) {
                        //blad krytyczny - blad w kodzie
                    }
                }else{
                    validationIssues.add(String.format("Opcja dostawy %s - wymagana ilość sztuk w paczce", val.getValue().getName()));
                }

                wybraneSposobyDostawy.add(new SzczegolyDostawyTO(newSzczegolyDostawyBuilder));
            }
        }

        //Opis aukcji
        String opisAukcji = null;
        if(request.getParameter("opisAukcji") != null){
            if(ValidationHelper.hasCorrectLength(request.getParameter("opisAukcji"), 1, 255)){
                opisAukcji = request.getParameter("opisAukcji");
            }else{
                validationIssues.add("Opis aukcji - długość opisu powinna zawierać maksymalnie 255 znaków");
            }
        }
        ////walidacja//////////////////////////////////////////////////////////////////////////


        AukcjaBuilder newAukcjaBuilder = new AukcjaBuilder();
        newAukcjaBuilder.setTytul(tytulAukcji);
        newAukcjaBuilder.setKategoria(idWybranejKategorii == < 0? null : new KategoriaEntity())

        AukcjaTO nowaAukcja = new AukcjaTO();



        modelAndView.addObject("aukcja", nowaAukcja);
        modelAndView.addObject("walidacja", validationIssues);

        return modelAndView;
    }

    private ModelAndView getModelAndView(ModelAndView modelAndView, String informacja, String skutek) {
        modelAndView = new ModelAndView("resultatKupna");
        modelAndView.addObject("informacja", informacja);
        modelAndView.addObject("skutek", skutek);
        return modelAndView;
    }

    private ArrayList<String> getRequestParStrings(Enumeration<String> nazwyParametrow, String prefix){
        ArrayList<String> result = new ArrayList<String>();
        String current;

        while(nazwyParametrow.hasMoreElements()){
            current = nazwyParametrow.nextElement();
            if(current.startsWith(prefix)){
                result.add(current);
            }
        }

        return result;
    }




}
