package com.epam.controller;

import com.epam.model.entities.Insurance;

public class ConverterToString {
    public static String converteToString(Insurance[] agreement) {
        String result="";
        for (Insurance item:agreement) {
            result+=item.toString();
        }
        return result;
    }
}
