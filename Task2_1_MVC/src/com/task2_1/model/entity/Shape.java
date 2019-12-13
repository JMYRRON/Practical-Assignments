package com.task2_1.model.entity;

import com.task2_1.model.Drawable;

public abstract class Shape implements Drawable {

    private String colorShape;
    private String type;

    public String getType() {
        return type;
    }

    public Shape(String colorShape, String type) {
        this.colorShape = colorShape;
        this.type = type;
    }

    public String getColorShape() {
        return colorShape;
    }

    public void setColorShape(String colorShape) {
        this.colorShape = colorShape;
    }

    public abstract double calcArea();

    public String draw() {
        return String.format("%s; area = %.2f\n", this, calcArea());
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " colorShape = " + colorShape;
    }
}
