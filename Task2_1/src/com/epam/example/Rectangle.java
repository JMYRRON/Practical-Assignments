package com.epam.example;

public class Rectangle extends Shape{
    private double w;
    private double h;

    public Rectangle (String colorShape, double w, double h) {
        super(colorShape, "Rectangle");
        this.w = w;
        this.h = h;
    }

    @Override
    public String toString() {
        return super.toString() +
                "; w=" + w +
                ", h=" + h;
    }

    @Override
    public double calcArea() {
        return w*h;
    }

    @Override
    public void draw() {
        System.out.printf("%s; area = %.2f\n", this, calcArea());
    }
}
