package com.springapp.helpers;

import java.util.List;
import java.util.Map;

/**
 * Created by Internet on 2015-02-08.
 */
public class HtmlControlGeneratorHelper {
    public static String generateOptionsHTML(List<Map.Entry<String, String>> textAndValues){
        StringBuilder result = new StringBuilder();
        for(Map.Entry<String, String> val : textAndValues){
            result.append(" <option value=\"")
                    .append(val.getKey())
                    .append("\">")
                    .append(val.getValue())
                    .append("</option>\n");
        }
        return result.toString();
    }
}
