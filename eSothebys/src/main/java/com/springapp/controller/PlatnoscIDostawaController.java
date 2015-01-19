package com.springapp.controller;

import com.springapp.model.KrajEntity;
import com.springapp.service.KrajService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/platnosc")
public class PlatnoscIDostawaController {

    @RequestMapping(method = RequestMethod.POST)
    public String potwierdzLicytację(HttpServletRequest request, HttpServletResponse response){
        return "platnoscIDostawa";
    }
}