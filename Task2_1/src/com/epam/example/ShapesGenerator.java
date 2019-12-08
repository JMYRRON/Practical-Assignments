package com.epam.example;

import java.util.Random;

public class ShapesGenerator {

    private boolean validator;

    public Shape[] getShapesArray(int number) {
        char[] shape = {'r','t','c'};
        String[] color = {"white","blue","pink","black","yellow","brown","purple","green","red"};
        Shape[] shapesarray = new Shape[number];
        for (int i = 0; i<number; i++) {
            char ss = shape[randomIndex(shape.length)];
            String sc = color[randomIndex(color.length)];
            if (ss=='r') {
                int w = randomNumber(15);
                int h = randomNumber(15);
                shapesarray[i] = new Rectangle(sc,w,h);
            }
            if (ss=='t') {
                while (!validator) {
                    int a = randomNumber(15);
                    int b = randomNumber(15);
                    int c = randomNumber(15);
                    validateTriangle(a,b,c);
                    if (validator) {
                        shapesarray[i] = new Triangle(sc,a,b,c);
                    }
                }
                validator = false;
            }
            if (ss=='c') {
                int r = randomNumber(15);
                shapesarray[i] = new Circle(sc,r);
            }
        }
        return shapesarray;
    }

    private int randomIndex(int len) {
        int i = new Random().nextInt(len);
        return i;
    }

    private int randomNumber(int len) {
        int i = new Random().nextInt(len) +1;
        return i;
    }

    public void validateTriangle(int a, int b, int c) {
        if (a>c && a>b) {
            if (c+b>a) {validator = true;}
        }
        else if (b>a && b>c) {
            if (a+c>b) {validator = true;}
        }
        else if (c>a && c>b) {
            if (a+b>c) {validator = true;}
        }
        else {
            validator = false;
        }
    }
}
