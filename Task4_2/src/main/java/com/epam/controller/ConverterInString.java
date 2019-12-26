package com.epam.controller;

import com.epam.model.Book;

public class ConverterInString {

    public static String convertArrayBooks(Book[] books) {
        String result = "";
        for (Book book:books) {
            result += book.toString();
        }

        return result;
    }

    public static String convertDouble (double value, String message) {
        return String.format("%s = %.2f\n", message, value);
    }

}
