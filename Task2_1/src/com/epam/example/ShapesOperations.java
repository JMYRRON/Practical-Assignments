package com.epam.example;

import java.util.Arrays;
import java.util.Comparator;

public class ShapesOperations {
    public void showShapes(Shape[] shapes) {
        for (Shape shape:shapes) {
            shape.draw();
        }
    }

    public void showTotalArea(Shape[] shapes) {
        double area = 0;
        for (Shape shape: shapes) {
            area = shape.calcArea()+area;
        }
        System.out.println("total area = " +area);
    }

    public void showTypesArea(Shape[] shapes) {
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

    public void setAreaOrder(Shape[] shapes){
        Arrays.sort(shapes,new ShapesAreaComparator());
        showShapes(shapes);
    }

    public void setColorOrder(Shape[] shapes){
        Arrays.sort(shapes,new ShapesColorComparator());
        showShapes(shapes);
    }



}
