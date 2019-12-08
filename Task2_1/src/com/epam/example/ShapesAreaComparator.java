package com.epam.example;

import java.util.Comparator;

public class ShapesAreaComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        int shape1 = (int) ((Shape) o1).calcArea();
        int shape2 = (int) ((Shape) o2).calcArea();
        return shape1-shape2;
    }
}
