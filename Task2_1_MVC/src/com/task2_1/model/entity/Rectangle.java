package com.task2_1.model.entity;

public class Rectangle extends Shape {
    private double w;
    private double h;

    public Rectangle (String colorShape, double w, double h) {
        super(colorShape, "Rectangle");
        this.w = w;
        this.h = h;
    }

    public static Rectangle parseShape(String data) {
        String[] tokens = data.split("[;,]");
        return new Rectangle(tokens[1], Double.parseDouble(tokens[2]), Double.parseDouble(tokens[3]));
    }

    private boolean validateTriangle(int a, int b, int c) {
        if (a>c && a>b) {
            if (c+b>a) {return true;}
        }
        else if (b>a && b>c) {
            if (a+c>b) {return true;}
        }
        else if (c>a && c>b) {
            if (a+b>c) {return true;}
        }
        return false;
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




}
