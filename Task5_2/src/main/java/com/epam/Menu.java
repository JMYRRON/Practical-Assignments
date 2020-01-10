package com.epam;

import java.util.*;

public class Menu {
    private List<Integer> list = new ArrayList<>();
    private Set<Integer> set = new HashSet<>();

    public Menu(int length, int min, int max) {
        for (int i = 0; i < length; i++) {
            int number = new Random().nextInt(max) + min;
            set.add(number);
            list.add(number);
        }
    }

    public void showData(){
        System.out.println(list);
        System.out.println(set);
    }

    public static int scanInt() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static void main(String[] args){
        System.out.println("Enter the length of list and set -> ");
        int length = scanInt();
        System.out.println("Enter the min number of list and set -> ");
        int min = scanInt();
        System.out.println("Enter the max number of list and set -> ");
        int max = scanInt();
        Menu menu = new Menu(length,min,max);
        menu.showData();
    }
}
