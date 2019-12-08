package com.epam.example;

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

    @Override
    public void draw() {
        System.out.printf("%s; area = %.2f\n", this, calcArea());
    }
}
