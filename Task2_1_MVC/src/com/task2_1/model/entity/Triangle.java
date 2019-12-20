package com.task2_1.model.entity;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle (String colorShape, double a, double b, double c) {
        super(colorShape, "Triangle");
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static Triangle parseShape(String data) {
        String[] tokens = data.split("[;,]");
        return new Triangle(tokens[1], Double.parseDouble(tokens[2]), Double.parseDouble(tokens[3]),
                Double.parseDouble(tokens[4]));
    }


    @Override
    public String toString() {
        return super.toString() +
                "; a=" + a +
                ", b=" + b +
                ", c=" + c;
    }

    @Override
    public double calcArea() {
        double p = (a+b+c)/2;
        double s = (p*(p-a)*(p-b)*(p-c));
        return Math.sqrt(s);
    }

}
