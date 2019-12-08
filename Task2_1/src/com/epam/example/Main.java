package com.epam.example;

public class Main extends ShapesGenerator{

    public static void main (String[] args) {
        ShapesGenerator shgen = new ShapesGenerator();
        ShapesOperations shop = new ShapesOperations();
        Shape[] shapes = shgen.getShapesArray(3);
        shop.showShapes(shapes);
        System.out.println();
        shop.showTotalArea(shapes);
        System.out.println();
        shop.showTypesArea(shapes);
        System.out.println();
        shop.setAreaOrder(shapes);
        System.out.println();
        shop.setColorOrder(shapes);
    }
}
