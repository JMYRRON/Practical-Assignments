package com.epam.model.entities;

public abstract class Insurance {

    private int risk;
    private int price;

    public Insurance(int risk, int price) {
        this.risk = risk;
        this.price = price;

    }

    public int getRisk() {
        return risk;
    }

    public int getPrice() {
        return price;
    }

}
