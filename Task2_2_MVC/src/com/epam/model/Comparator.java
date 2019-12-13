package com.epam.model;

public class Comparator implements java.util.Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Book book1 = (Book)o1;
        Book book2 = (Book)o2;


        return book1.getPublisher().compareTo(book2.getPublisher());
    }
}
