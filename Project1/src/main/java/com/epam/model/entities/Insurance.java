package com.epam.model.entities;

import java.util.Objects;

public abstract class Insurance {
    private int price;
    private int risk;
    private Duration duration;
    private String description;

    public Insurance(int price, int risk, Duration duration, String description) {
        this.price = price;
        this.risk = risk;
        this.duration = duration;
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRisk() {
        return risk;
    }

    public void setRisk(int risk) {
        this.risk = risk;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int result = price + risk;
        return 31*result + Objects.hash(duration,description);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Insurance insurance = (Insurance) o;
        return price == insurance.price &&
                risk == insurance.risk &&
                duration == insurance.duration &&
                Objects.equals(description, insurance.description);
    }

    @Override
    public String toString() {
        return "Item: description (" + description +"); price (" + price + "); risk (" + risk + "); " +
                "duration (" +duration + ").\n" ;
    }
}
