package com.epam.model.entities;

public class Toy {
    private String name;
    private int agelimit;
    private int price;
    private int type;

    public Toy() {}

    public Toy(String name, int agelimit, int price) {
        this.name = name;
        this.agelimit = agelimit;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getAgelimit() {
        return agelimit;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" + "Age limit: " + "+" +agelimit + "\n" + "Price: " + price + "$" +"\n";
    }
}
