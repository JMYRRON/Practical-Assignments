package com.epam.model.entities;

public class EpidemicProblems  extends LifeInsurance {
    private String virus;
    public EpidemicProblems(int risk, int price, String virus) {
        super(risk, price);
        this.virus = virus;
    }

    @Override
    public String toString() {
        return "Virus: " + virus + ", risk: " + getRisk() + ", price: " + getPrice() +" $/year.\n";
    }
}
