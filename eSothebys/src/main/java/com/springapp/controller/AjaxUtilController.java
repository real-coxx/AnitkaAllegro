package com.springapp.controller;

/**
 * Created by Internet on 2015-01-30.
 */
import com.springapp.dto.WojewodztwoTO;
import com.springapp.helpers.HtmlControlGeneratorHelper;
import com.springapp.model.KrajEntity;
import com.springapp.service.KrajService;
import com.springapp.service.WojewodztwoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/ajaxUtil")
public class AjaxUtilController {
    @Autowired
    WojewodztwoService wojewodztwoService;

    @RequestMapping(value = "/getWojewodztwa", params = "kraj", method = RequestMethod.GET)
    public @ResponseBody
    String pobierzWojewodztwaDlaKraju(String krajId){
        String result = "";

        List<WojewodztwoTO> wojewodztwa = wojewodztwoService.getWojewodztwaByKrajId(Long.parseLong(krajId));

        List<Map.Entry<String, String>> selectControlData = new ArrayList<Map.Entry<String, String>>();

        for(WojewodztwoTO woj : wojewodztwa){
            selectControlData.add(new AbstractMap.SimpleEntry<String, String>(woj.getId().toString(), woj.getNazwa()));
        }

        result = HtmlControlGeneratorHelper.generateOptionsHTML(selectControlData);

        return result;
    }


}
