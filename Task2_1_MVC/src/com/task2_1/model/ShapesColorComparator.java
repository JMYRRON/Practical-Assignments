package com.task2_1.model;

import com.task2_1.model.entity.Shape;

import java.util.Comparator;

public class ShapesColorComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String shape1 = ((Shape) o1).getColorShape();
        String shape2 = ((Shape) o2).getColorShape();
        return shape1.compareTo(shape2);
    }
}
