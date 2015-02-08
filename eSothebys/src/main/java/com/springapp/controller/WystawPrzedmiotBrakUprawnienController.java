package com.springapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Internet on 2015-02-07.
 */

@Controller
@RequestMapping("/wystawPrzedmiotBrakUprawnien")
public class WystawPrzedmiotBrakUprawnienController {

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView brakUprawnien(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView result = new ModelAndView();

        result.addObject(request.getParameter("wiadomoscOBledzie"));

        return result;
    }

}
