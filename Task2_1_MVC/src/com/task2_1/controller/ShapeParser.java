package com.task2_1.controller;

import com.task2_1.model.ShapesGenerator;
import com.task2_1.model.entity.*;

public class ShapeParser {
    public static Shape parse(String shape) {
        String type = shape.substring(0, shape.indexOf(":")).toUpperCase();
        switch (ShapeTypes.valueOf(type)) {
            case CIRCLE: return Circle.parseShape(shape);
            case RECTANGLE: return Rectangle.parseShape(shape);
            case TRIANGLE: {
                String[] tokens = shape.split("[;,]");
                ShapesGenerator validator = new ShapesGenerator();
                if (validator.validateTriangle(Double.parseDouble(tokens[2]),Double.parseDouble(tokens[3]),
                        Double.parseDouble(tokens[4]))) {
                    return Triangle.parseShape(shape);
                }
            }
            default: return null;
        }
    }
}
