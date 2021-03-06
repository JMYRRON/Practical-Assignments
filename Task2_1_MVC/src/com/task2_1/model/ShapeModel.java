package com.task2_1.model;

import com.task2_1.controller.ConverterInString;
import com.task2_1.model.entity.Shape;
import com.task2_1.view.InputData;

import java.util.Arrays;
import java.util.Comparator;

public class ShapeModel <T extends Shape> {

    private T[] shapes;

    public T[] getShapes() {
        return shapes;
    }

    public ShapeModel(T[] newshapes) {
        shapes = newshapes;
    }

    public void showShapes() {
        for (T shape:shapes) {
            shape.draw();
        }
    }

    public double getTotalArea() {
        double area = 0;
        for (T shape: shapes) {
            area = shape.calcArea()+area;
        }

        return area;
    }

    public void showTypesArea() {
        double rarea = 0;
        double tarea = 0;
        double carea = 0;
        for (Shape shape: shapes) {
            if (shape.getType()=="Rectangle") {
                rarea += shape.calcArea();
            }
            if (shape.getType()=="Triangle") {
                tarea += shape.calcArea();
            }
            if (shape.getType()=="Circle") {
                carea += shape.calcArea();
            }
        }
        System.out.println("Rectangles area = "+ rarea + " Triangles area = " + tarea + " Circles area = " + carea);
    }

    public String getAreaByTypes () {

        String message = "";
        System.out.println("Enter type of shape ->");
        String type = InputData.input();

        double area = 0;
        for (Shape shape: shapes) {
            if (shape.getClass().getSimpleName().equalsIgnoreCase(type)) {
                area = shape.calcArea()+area;
            }
        }
        if (area>0) {
            message = "total area = " + String.format("%.2f", area);
        } else {
            message = "Invalid type";
        }

        return message;

    }


    public T[] sortShapes(Comparator comparator) {

        T[] sortedShapes = Arrays.copyOf(shapes,shapes.length);

        Arrays.sort(sortedShapes,comparator);

        return sortedShapes;
    }

    public String getSorted() {
        System.out.println("Enter criteria sorting (Color, Area) ->");
        String message = "";
        String criteria = InputData.input().toLowerCase();
        Comparator comparator = null;
        switch (criteria) {
            case "area":
                comparator = new Comparator<T>() {
                    @Override
                    public int compare(T o1, T o2) {
                        return (int) (o1.calcArea()-o2.calcArea());
                    }
                };
                break;
            case "color":
                comparator = new Comparator<T>() {
                    @Override
                    public int compare(T o1, T o2) {
                        return o1.getColorShape().compareTo(o2.getColorShape());
                    }
                };
                break;
        }
        if (comparator!=null) {
            message = ConverterInString.convertArrayShapes(sortShapes(comparator));
        } else {
            message = "Invalid criteria";
        }
        return message;
    }


}
