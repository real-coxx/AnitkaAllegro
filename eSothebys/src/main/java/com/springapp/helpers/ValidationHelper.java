package com.springapp.helpers;

import com.springapp.customExceptions.UserInputValidationException;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.RegularExpression;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.HashMap;


/**
 * Created by Internet on 2015-02-07.
 */
public class ValidationHelper {

    //comparison predicate like:
    // [0]:{lowerVal | "INF"}
    // [1]:{"strong","weak"}
    // [2]:{"strong","weak"}
    // [3]:{upperVal | "INF"}
    public static <T extends Comparable<? super T>> boolean isNumericType(String s, String[] comparisonPredicate, Class<T> destType) throws Exception {
        T lowerVal = GenericConverterHelper.convert(comparisonPredicate[0], destType);
        T upperVal = GenericConverterHelper.convert(comparisonPredicate[3], destType);
        T examinedVal = GenericConverterHelper.convert(s, destType);

        if(examinedVal == null){
            return false;
        }

        for(int i=0; i<4; i = i++) {
            if(i==0 || i==3) {
                if (!comparisonPredicate[i].equals("INF")) {
                    if((i==0 && lowerVal == null) ||
                            (i==3 && upperVal == null))
                        throw new Exception("Comparison Predicate Error");

                    if(i==3 && lowerVal != null){
                        if(upperVal.compareTo(lowerVal) < 1)
                            throw new Exception("Comparison Predicate Error");
                    }
                }
            }else{
                if (!(comparisonPredicate[i].equals("strong") ||
                        comparisonPredicate[i].equals("weak"))) {
                    throw new Exception("Comparison Predicate Error");
                }
            }
        }

        Boolean result = null;
        for(int i=1; i<3; i++) {
            if (comparisonPredicate[i].equals("strong")) {
                if(i==1) {
                    result = result == null? (lowerVal.compareTo(examinedVal) < 1) : (result && (lowerVal.compareTo(examinedVal) < 1));
                }else{
                    result = result == null? (upperVal.compareTo(examinedVal) > -1) : (result && (lowerVal.compareTo(examinedVal) > -1));
                }
            } else {
                if(i==1) {
                    result = result == null? (lowerVal.compareTo(examinedVal) < 0) : (result && (lowerVal.compareTo(examinedVal) < 0));
                }else{
                    result = result == null? (upperVal.compareTo(examinedVal) > 0) : (result && (lowerVal.compareTo(examinedVal) > 0));
                }
            }
        }

        return result;
    }

    public static boolean matchesRegex(String s, String regex){
        RegularExpression validationRegex = new RegularExpression(regex);
        if(validationRegex.matches(s))
            return true;
        return false;
    }

    public static boolean isCorrectCurrencyValue(String s){
        return matchesRegex(s, RegexHelper.POSITIV_BIG_DECIMAL);
    }

    public static boolean isCorrectCurrencyValue(String s, String[] comparisonPredicate) throws UserInputValidationException {
        try {
            return isNumericType(s, comparisonPredicate, Double.TYPE) && matchesRegex(s, RegexHelper.POSITIV_BIG_DECIMAL);
        } catch (Exception e) {
            throw new UserInputValidationException(String.format("Error while validating %s for cohesion with currency number format.", s));
        }
    }

    public static boolean isURL(String s){
        return matchesRegex(s, RegexHelper.URL);
    }

    public static boolean hasCorrectLength(String s, int minLength, int maxLength){
        return (s.length() >= minLength) && (s.length() <= maxLength);
    }

    public static boolean tytulAukcjiCorrectChars(String s){
        return matchesRegex(s, RegexHelper.AUCTION_TITLE);
    }

    public static boolean aukcjaEANISBNCorrectChars(String s) {
        return matchesRegex(s, RegexHelper.AUCTION_EANISBN);
    }

    public static boolean isCorrectMiejscowoscName(String s) {
        return matchesRegex(s, RegexHelper.CITY);
    }

    public static boolean isCorrectKodPocztowy(String s) {
        return matchesRegex(s, RegexHelper.POSTAL_CODE);
    }

    public static boolean isValidNumerKonta(String s) {
        return matchesRegex(s, RegexHelper.ACCOUNT_NUMBER);
    }
}
