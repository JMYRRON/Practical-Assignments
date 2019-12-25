package com.epam.model.entities;

public class PhysicalDamage  extends LifeInsurance {
    private String bodyelement;
    public PhysicalDamage(int risk, int price, String bodyelement) {
        super(risk, price);
        this.bodyelement = bodyelement;
    }

    @Override
    public String toString() {
        return "Damaged: " + bodyelement + ", risk: " + getRisk() + ", price: " + getPrice() +" $/year.\n";
    }
}
