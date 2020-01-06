package com.epam.view;

import java.util.Scanner;

public class InputData {
    public static String scan() {
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    public static int scanInt() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
