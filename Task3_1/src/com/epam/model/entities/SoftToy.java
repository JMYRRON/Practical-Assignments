package com.epam.model.entities;

public abstract class SoftToy extends Toy{

    public SoftToy() {
    }

    public SoftToy(String name, int agelimit, int price) {
        super(name, agelimit, price);
    }
}
