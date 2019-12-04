package lesson1;

import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {

    private static int i;

    public static void main(String[] args) {

        setI();
        findAbsoluteNumbers(i);
    }

    public static void findAbsoluteNumbers(int i) {
        int absolutenumber = 0;
        for (int j = 1; j<i+1; j++) {
            absolutenumber = absolutenumber + j;
            if (absolutenumber>i){
                break;
            }
            printNumber(absolutenumber);
        }
    }

    public static void printNumber (int number) {
        System.out.print(number + ", ");
    }

    public static boolean toCompare(int first, int second) {
        if (first>second)
        {
            return true;
        }
        return false;
    }
    public static void setI() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Task2.i = n;
    }
}
