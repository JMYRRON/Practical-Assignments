package com.epam.controller;

import com.epam.model.entities.Insurance;
import com.epam.model.entities.NoItem;

public class ConverterToString {
    public static String converteToString(Insurance[] agreement) {
        String result="";
        for (Insurance item:agreement) {
            if ( item instanceof Insurance) {
                result+=item.toString();
            } else {
                result+=new NoItem().toString();
            }
        }
        return result;
    }
}
