package com.springapp.helpers;

/**
 * Created by Alicja on 2015-01-31.
 */
public enum RodzajPlatnosci {

    ZGory, PrzyOdbiorze;

    public static String getPelnaNazwa(String opcja) {
        if (ZGory.toString().equals(opcja)) {
            return "Z góry";
        }
        else if (PrzyOdbiorze.toString().equals(opcja)) {
            return "Przy odbiorze";
        }
        else {
            return null;
        }
    }
}
