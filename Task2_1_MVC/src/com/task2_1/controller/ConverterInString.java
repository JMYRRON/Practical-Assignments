package com.task2_1.controller;

import com.task2_1.model.entity.Shape;

public class ConverterInString {

    public static String convertArrayShapes(Shape[] shapes) {
        String result = "";
        for (Shape shape:shapes) {
            result += shape.draw();
        }

        return result;
    }

    public static String convertDouble (double value, String message) {
        return String.format("%s = %.2f\\n", message, value);
    }

}
