package com.springapp.helpers;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.RegularExpression;

/**
 * Created by Internet on 2015-02-08.
 */
public class RegexHelper {
    private RegexHelper(){};

    public static final String URL = "(https?:\\/\\/)?([\\da-z\\.-]+)\\.([a-z\\.]{2,6})([\\/\\w \\.-]*)*\\/?";
    public static final String POSITIV_BIG_DECIMAL = "(?:\\d+(?:\\.\\d+)?|\\.\\d+)";
    public static final String AUCTION_TITLE = "[A-Za-zżźćńółęąśŻŹĆĄŚĘŁÓŃ _,.!?-]*";
    public static final String AUCTION_EANISBN = "[0-9 \\-]*";
    public static final String POSTAL_CODE = "\\d{2}-\\d{3}";
    public static final String CITY = "?[A-Za-z -.]*";
    public static final String ACCOUNT_NUMBER = "PL\\d{2}[ ]\\d{4}[ ]\\d{4}[ ]\\d{4}[ ]\\d{4}[ ]\\d{4}[ ]\\d{4}|PL\\d{26}";

}
