package com.epam.model;

import com.epam.model.entities.*;

import java.util.Arrays;
import java.util.Comparator;

public class InsuranceModel {
    private Insurance[] agreement;
    private boolean check = false;
    private int agreement_index = 0;

    public boolean isCheck() {
        return check;
    }

    public int getAgreement_index() {
        return agreement_index;
    }

    public void setAgreement (int number) {
        agreement = new Insurance[number];
        check = true;
    }

    public Insurance[] getAgreement() {
        return agreement;
    }

    public void addInsuranceItem (String type, String description, int price, int risk, Duration duration) {
            for (Insurance item:agreement) {
                boolean flag = false;
                if (item==null) {
                    switch (type.toLowerCase()) {
                        case "life": agreement[agreement_index] = new LifeInsurance(price,risk,duration,description); break;
                        case "car": agreement[agreement_index] = new CarInsurance(price,risk,duration,description); break;
                        case "property": agreement[agreement_index] = new PropertyInsurance(price,risk,duration,description); break;
                    }
                    agreement_index++;
                    flag = true;
                }
                if (flag) break;
        }
    }

    public int getTotalPrice(){
        int totalsum = 0;
        for (Insurance item:agreement) {
            if (item instanceof Insurance) {
                totalsum+=item.getPrice();
            }
        }
        return totalsum;
    }

    public Insurance[] getItemsByPrice(int first, int second) {
        int index = 0;
        for (Insurance item:agreement) {
            if (item instanceof Insurance && item.getPrice()>first-1 && item.getPrice()<second+1){
                index++;
            }
        }
        Insurance[] items = new Insurance[index];
        if (index>0) {
            int num = 0;
            for (int i = 0; i< agreement.length;i++){
                if (agreement[i] instanceof Insurance && agreement[i].getPrice()>first-1 && agreement[i].getPrice()<second+1){
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
            if ( item instanceof Insurance && item.getRisk()>first-1 && item.getRisk()<second+1){
                index++;
            }
        }
        Insurance[] items = new Insurance[index];
        if (index>0) {
            int num = 0;
            for (int i = 0; i< agreement.length;i++){
                if (agreement[i] instanceof Insurance && agreement[i].getRisk()>first-1 && agreement[i].getRisk()<second+1){
                    items[num] = agreement[i];
                    num++;
                }
            }
        } else {
            items = new Insurance[] {new NoItem()};
        }

        return items;
    }

    public Insurance[] getSortedByRisk(){
        Insurance[] sorted = checkForNull();
        Arrays.sort(sorted, new Comparator<Insurance>() {
            @Override
            public int compare(Insurance o1, Insurance o2) {
                return o1.getRisk()-o2.getRisk();
            }
        });
        return sorted;
    }

    public Insurance[] getSortedByPrice(){
        Insurance[] sorted = checkForNull();
        Arrays.sort(sorted, new Comparator<Insurance>() {
            @Override
            public int compare(Insurance o1, Insurance o2) {
                return o1.getPrice()-o2.getPrice();
            }
        });
        return sorted;
    }

    public Insurance[] getSortedByDuration(){
        Insurance[] sorted = checkForNull();
        Arrays.sort(sorted, new Comparator<Insurance>() {
                    @Override
                    public int compare(Insurance o1, Insurance o2) {
                        return o1.getDuration().compareTo(o2.getDuration());
                    }
                });
        return sorted;
    }

    private Insurance[] checkForNull() {
        int index = 0;
        for (Insurance item:agreement) {
            if ( item instanceof Insurance){
                index++;
            }
        }
        Insurance[] checked = new Insurance[index];
        if (index>0) {
            int num = 0;
            for (int i = 0; i< agreement.length;i++){
                if (agreement[i] instanceof Insurance){
                    checked[num] = agreement[i];
                    num++;
                }
            }
        }
    return checked;
    }

}
