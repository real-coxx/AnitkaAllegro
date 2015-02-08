package com.springapp.helpers;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.AbstractMap;
import java.util.HashMap;

/**
 * Created by Internet on 2015-02-08.
 */
public final class GenericConverterHelper {
    private static final HashMap<AbstractMap.SimpleEntry<String, String>, Method> TYPE_CONVERTERS =
            new HashMap<AbstractMap.SimpleEntry<String, String>, Method>();
    static{
        Method[] methods = GenericConverterHelper.class.getDeclaredMethods();
        for(int i=0; i<methods.length; i++){
            TYPE_CONVERTERS.put(new AbstractMap.SimpleEntry<String, String>(methods[i].getParameterTypes()[0].getName(),
                    methods[i].getReturnType().getName()), methods[i]);
        }
    }

    private GenericConverterHelper(){}

    public static <T> T convert(Object from, Class<T> to){
        Method selectedConverter = TYPE_CONVERTERS.get(new AbstractMap.SimpleEntry<String, String>(from.getClass().getName(),
                to.getName()));

        if(selectedConverter == null || from == null){
            return null;
        }else{
            try {
                return to.cast(selectedConverter.invoke(to, from));
            } catch (IllegalAccessException e) {
                return null;
            } catch (InvocationTargetException e) {
                return null;
            }
        }
    }

    private static Integer stringToIntConvert(Object s){
        String castedS = (String)s;
        return Integer.parseInt(castedS);
    }

    private static Long stringToLongConvert(Object s){
        String castedS = (String)s;
        return Long.parseLong(castedS);
    }

    private static Double stringToDoubleConvert(Object s){
        String castedS = (String)s;
        return Double.parseDouble(castedS);
    }

    private static BigDecimal stringToBigDecimalConvert(Object s){
        String castedS = (String)s;
        Double dbVal = Double.parseDouble(castedS);
        return dbVal == null? null : BigDecimal.valueOf(dbVal);
    }
}
