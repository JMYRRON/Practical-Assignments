package com.epam.model;

import com.epam.model.entities.EpidemicProblems;
import com.epam.model.entities.Insurance;
import com.epam.model.entities.MentalProblems;
import com.epam.model.entities.PhysicalDamage;
import org.junit.Test;

import static org.junit.Assert.*;

public class InsuranceModelTest {

    InsuranceModel model = new InsuranceModel();


    @Test
    public void getAgreementItems() {

        Insurance[] agreement = new Insurance[]{
                new EpidemicProblems(3,20,"CVT"),
                new EpidemicProblems(6,40,"APBN"),
                new EpidemicProblems(4,25,"FTG"),
                new MentalProblems(2,20,"Bipolar disorder"),
                new MentalProblems(2,20,"Schizophrenia"),
                new PhysicalDamage(5,25,"Hand"),
                new PhysicalDamage(5,30,"Leg"),
                new PhysicalDamage(4,45,"Head"),
                new PhysicalDamage(4,55,"Back"),
                new PhysicalDamage(3,10,"Finger")
        };

        assertArrayEquals(agreement, model.getAgreementItems());
    }

    @Test
    public void getTotalPrice() {
        assertEquals(290,model.getTotalPrice());
    }

    @Test
    public void getSorted() {
        Insurance[] agreement = new Insurance[]{
                new MentalProblems(2,20,"Bipolar disorder"),
                new MentalProblems(2,20,"Schizophrenia"),
                new EpidemicProblems(3,20,"CVT"),
                new PhysicalDamage(3,10,"Finger"),
                new EpidemicProblems(4,25,"FTG"),
                new PhysicalDamage(4,45,"Head"),
                new PhysicalDamage(4,55,"Back"),
                new PhysicalDamage(5,25,"Hand"),
                new PhysicalDamage(5,30,"Leg"),
                new EpidemicProblems(6,40,"APBN"),
        };
        assertArrayEquals(agreement,model.getSorted());
    }

    @Test
    public void getItemsByPrice() {
        Insurance[] agreement = new Insurance[]{
                new EpidemicProblems(3,20,"CVT"),
                new MentalProblems(2,20,"Bipolar disorder"),
                new MentalProblems(2,20,"Schizophrenia"),
                new PhysicalDamage(3,10,"Finger"),
        };
        assertArrayEquals(agreement, model.getItemsByPrice(10,20));
    }

    @Test
    public void getItemsByRisk() {
        Insurance[] agreement = new Insurance[]{
                new EpidemicProblems(6,40,"APBN"),
                new PhysicalDamage(5,25,"Hand"),
                new PhysicalDamage(5,30,"Leg"),
        };
        assertArrayEquals(agreement, model.getItemsByRisk(5,6));
    }
}