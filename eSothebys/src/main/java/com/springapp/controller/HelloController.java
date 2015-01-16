package com.springapp.controller;

import com.springapp.model.AdresEntity;
import com.springapp.model.KrajEntity;
import com.springapp.service.KrajService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/")
public class HelloController {

    @Autowired
    private KrajService krajService;

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
        List<KrajEntity> kraje = krajService.getKraje();
        KrajEntity kraj = kraje.get(0);
		model.addAttribute("message", kraj.getNazwa());
		return "hello";
	}
}