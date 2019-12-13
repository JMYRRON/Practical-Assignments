package com.task2_1.model.entity;

public class Circle extends Shape {
    private double r;

    public Circle (String colorShape, double r) {
        super(colorShape, "Circle");
        this.r = r;
    }

    @Override
    public String toString() {
        return super.toString() +
                "; r=" + r;
    }

    @Override
    public double calcArea() {
        return Math.PI*r*r;
    }

}
