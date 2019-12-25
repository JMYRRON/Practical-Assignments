package com.epam.model.entities;

public class MentalProblems  extends LifeInsurance {
    private String diagnosis;
    public MentalProblems(int risk, int price, String diagnosis) {
        super(risk, price);
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "Diagnosis: " + diagnosis + ", risk: " + getRisk() + ", price: " + getPrice() +" $/year.\n";
    }
}
