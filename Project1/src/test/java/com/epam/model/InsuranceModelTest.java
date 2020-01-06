package com.epam.model;

import com.epam.model.entities.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InsuranceModelTest {

    InsuranceModel model = new InsuranceModel();

    @Before
    public void setTestModel() {
        model.setAgreement(3);
        model.addInsuranceItem("life","cancer",50,5, Duration.MONTH_1);
        model.addInsuranceItem("car","DTP",100,6, Duration.MONTHS_6);
    }

    @Test
    public void isCheck() {
        assertTrue(model.isCheck());
    }

    @Test
    public void getAgreement() {
        Insurance[] agreement = new Insurance[]{
                new LifeInsurance(50,5,Duration.MONTH_1,"cancer"),
                new CarInsurance(100,6,Duration.MONTHS_6,"DTP"),
                null
                //new PropertyInsurance(300,3,Duration.YEAR,"fire")
        };
        assertArrayEquals(agreement,model.getAgreement());
    }

    @Test
    public void addInsuranceItem() {
        Insurance[] agreement = new Insurance[]{
                new LifeInsurance(50,5,Duration.MONTH_1,"cancer"),
                new CarInsurance(100,6,Duration.MONTHS_6,"DTP"),
                new PropertyInsurance(300,3,Duration.YEAR,"fire")
        };

        model.addInsuranceItem("property","fire",300,3,Duration.YEAR);

        assertArrayEquals(agreement,model.getAgreement());
    }

    @Test
    public void getTotalPrice() {
        assertEquals(150,model.getTotalPrice());
    }

    @Test
    public void getItemsByPrice() {
        Insurance[] agreement = new Insurance[]{
                new LifeInsurance(50,5,Duration.MONTH_1,"cancer"),
        };
        assertArrayEquals(agreement,model.getItemsByPrice(40,60));
    }

    @Test
    public void getItemsByRisk() {
        Insurance[] agreement = new Insurance[]{
                new LifeInsurance(50,5,Duration.MONTH_1,"cancer"),
        };
        assertArrayEquals(agreement,model.getItemsByRisk(4,5));
    }

    @Test
    public void getSortedByRisk() {
        Insurance[] agreement = new Insurance[]{
                new LifeInsurance(50,5,Duration.MONTH_1,"cancer"),
                new CarInsurance(100,6,Duration.MONTHS_6,"DTP")
        };
        assertArrayEquals(agreement, model.getSortedByRisk());
    }

    @Test
    public void getSortedByPrice() {
        Insurance[] agreement = new Insurance[]{
                new LifeInsurance(50,5,Duration.MONTH_1,"cancer"),
                new CarInsurance(100,6,Duration.MONTHS_6,"DTP")
        };
        assertArrayEquals(agreement, model.getSortedByPrice());
    }
}