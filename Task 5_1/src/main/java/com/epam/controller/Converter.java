package com.epam.controller;

import com.epam.model.Note;

public class Converter {
    public static String convertToString (Note[] register) {
        String message = "";
        int index = 0;

        for (Note note:register) {
            if (note instanceof Note) {
                message += note.toString() + "\n";
                index++;
            }
        }
        if (index==0) {
            message = "Notes were not found";
        }
        return message;
    }
}
