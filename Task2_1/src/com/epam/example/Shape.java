package com.epam.example;

public abstract class Shape implements Drawable{

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

    @Override
    public String toString() {
        return getClass().getSimpleName() + " colorShape = " + colorShape;
    }
}
