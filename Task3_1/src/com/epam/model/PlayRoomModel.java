package com.epam.model;

import com.epam.model.entities.*;
import com.epam.view.InputData;

import java.util.Arrays;
import java.util.Comparator;

public class PlayRoomModel <T extends Toy> {
    private Object [] toys;
    private int index;

    public PlayRoomModel() {
        this.toys = new Object[5];
        this.index = 0;
    }

    public void addToy (T toy) {
        if (index==toys.length){
            Object[] newtoys = new Object[toys.length+2];
            System.arraycopy(toys,0,newtoys,0,toys.length);
            toys = newtoys;
        }
        toys[index] = toy;
        index++;
    }

    public void removeToy (int num) {
        System.arraycopy(toys,num+1,toys,num,toys.length-num);
        index--;
        if (toys.length-2==index) {
            Object[] newtoys = new Object[toys.length-2];
            System.arraycopy(toys,0,newtoys,0,toys.length);
            toys = newtoys;
        }
    }

    public String getTotalPrice(){
        Toy[] toysN = new Toy[index];
        System.arraycopy(toys,0,toysN,0,index);
        String result = "";
        int total = 0;
        for (Toy toy:toysN) {
            total += toy.getPrice();
        }
        return result = "" +total;
    }

    public Toy[] sortToys(Comparator comparator) {
        Toy[] toysN = new Toy[index];
        System.arraycopy(toys,0,toysN,0,index);

        Arrays.sort(toysN,comparator);

        return toysN;
    }

    public String getSortedToys() {
        System.out.println("Enter criteria sorting (name, price) ->");
        String message = "";
        String criteria = InputData.input().toLowerCase();
        Comparator comparator = null;
        switch (criteria) {
            case "price":
                comparator = new Comparator<T>() {
                    @Override
                    public int compare(T o1, T o2) {
                        return (int) (o1.getPrice()-o2.getPrice());
                    }
                };
                break;
            case "name":
                comparator = new Comparator<T>() {
                    @Override
                    public int compare(T o1, T o2) {
                        return o1.getName().compareTo(o2.getName());
                    }
                };
                break;
        }
        if (comparator!=null) {
            message = convertToString(sortToys(comparator));
        } else {
            message = "Invalid criteria";
        }
        return message;
    }

    public String convertToString (Toy[] toys) {
        String result = "";
        for (int i = 0; i < index; i ++) {
            result += toys[i].toString();
        }
        return result;
    }

    public String showToys() {
        String result = "";
        for (int i = 0; i < index; i ++) {
            result += toys[i].toString();
        }
        return result;
    }

}
