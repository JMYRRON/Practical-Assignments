package com.epam.model;

import com.epam.model.entities.EpidemicProblems;
import com.epam.model.entities.Insurance;
import com.epam.model.entities.MentalProblems;
import com.epam.model.entities.PhysicalDamage;

public class AgreementGenerator {

    public Insurance[] generateAgreement () {
        Insurance[] agreement = new Insurance[10];
        agreement[0] = new EpidemicProblems(3,20,"CVT");
        agreement[1] = new EpidemicProblems(6,40,"APBN");
        agreement[2] = new EpidemicProblems(4,25,"FTG");
        agreement[3] = new MentalProblems(2,20,"Bipolar disorder");
        agreement[4] = new MentalProblems(2,20,"Schizophrenia");
        agreement[5] = new PhysicalDamage(5,25,"Hand");
        agreement[6] = new PhysicalDamage(5,30,"Leg");
        agreement[7] = new PhysicalDamage(4,45,"Head");
        agreement[8] = new PhysicalDamage(4,55,"Back");
        agreement[9] = new PhysicalDamage(3,10,"Finger");
        return agreement;
    }

}
