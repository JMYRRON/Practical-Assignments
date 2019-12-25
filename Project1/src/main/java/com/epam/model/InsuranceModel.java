package com.epam.model;

import com.epam.model.entities.Insurance;
import com.epam.model.entities.NoItem;

import java.util.Arrays;
import java.util.Comparator;

public class InsuranceModel {

    private Insurance[] agreement;

    public InsuranceModel() {
        this.agreement = new AgreementGenerator().generateAgreement();
    }

    public Insurance[] getAgreementItems(){
        return agreement;
    }

    public int getTotalPrice(){
        int totalsum = 0;
        for (Insurance insurance:agreement) {
            totalsum+=insurance.getPrice();
        }
        return totalsum;
    }

    public Insurance[] getSorted(){
        Insurance[] sorted = new Insurance[agreement.length];
        sorted = Arrays.copyOf(agreement,agreement.length);
        Arrays.sort(sorted, new Comparator<Insurance>() {
            @Override
            public int compare(Insurance o1, Insurance o2) {
                return o1.getRisk()-o2.getRisk();
            }
        });
        return sorted;
    }

    public Insurance[] getItemsByPrice(int first, int second) {
        int index = 0;
        for (Insurance item:agreement) {
            if (item.getPrice()>first-1 && item.getPrice()<second+1){
                index++;
            }
        }
        Insurance[] items = new Insurance[index];
        if (index>0) {
            int num = 0;
            for (int i = 0; i< agreement.length;i++){
                if (agreement[i].getPrice()>first-1 && agreement[i].getPrice()<second+1){
                    items[num] = agreement[i];
                    num++;
                }
            }
        } else {
            items = new Insurance[] {new NoItem()};
        }
        return items;
    }

    public Insurance[] getItemsByRisk(int first, int second) {
        int index = 0;
        for (Insurance item:agreement) {
            if (item.getRisk()>first-1 && item.getRisk()<second+1){
                index++;
            }
        }
        Insurance[] items = new Insurance[index];
        if (index>0) {
            int num = 0;
            for (int i = 0; i< agreement.length;i++){
                if (agreement[i].getRisk()>first-1 && agreement[i].getRisk()<second+1){
                    items[num] = agreement[i];
                    num++;
                }
            }
        } else {
            items = new Insurance[] {new NoItem()};
        }

        return items;
    }
}
