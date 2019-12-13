package com.task2_1.model;

import com.task2_1.model.entity.Shape;

import java.util.Arrays;
import java.util.Comparator;

public class ShapesOperations {
    public void showShapes(Shape[] shapes) {
        for (Shape shape:shapes) {
            shape.draw();
        }
    }

    public double getTotalArea(Shape[] shapes) {
        double area = 0;
        for (Shape shape: shapes) {
            area = shape.calcArea()+area;
        }

        return area;
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

    public double getAreaByTypes (Shape[] shapes, String type) {

        double area = 0;
        for (Shape shape: shapes) {
            if (shape.getClass().getSimpleName().equalsIgnoreCase(type)) {
                area = shape.calcArea()+area;
            }
        }

        return area;

    }

    public Shape[] sortShapes(Shape[] shapes, Comparator comparator) {

        Shape[] sortedShapes = Arrays.copyOf(shapes,shapes.length);

        Arrays.sort(sortedShapes,comparator);

        return sortedShapes;
    }

    public void setAreaOrder(Shape[] shapes){
        Arrays.sort(shapes,new ShapesAreaComparator());
    }

    public void setColorOrder(Shape[] shapes){
        Arrays.sort(shapes,new ShapesColorComparator());
    }



}
