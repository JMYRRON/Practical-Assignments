package com.epam.model.entities;

public abstract class PlasticToy extends Toy{
    public PlasticToy() {
    }

    public PlasticToy(String name, int agelimit, int price) {
        super(name, agelimit, price);
    }
}
