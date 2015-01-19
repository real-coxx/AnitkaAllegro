package com.springapp.controller;

import com.springapp.dto.AukcjaTO;
import com.springapp.service.AukcjaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/")
public class SkladanieOfertyController {

    @Autowired
    private AukcjaService aukcjaService;

    @RequestMapping(method = RequestMethod.GET)
    public String zlozOfertę(ModelMap model) {
        AukcjaTO aukcja = aukcjaService.getAukcjaByIdForSkladanieOferty(0);

        return "skladanieOferty";
    }
}