package lesson1;

import java.util.Scanner;

public class Task1 {

    private static int number;
    private static String number2;
    private static String number8;
    private static String number16;

    public static void main(String[] args) {
        setNumber();
        toBinary(number);
        toOctal(number);
        toHexadecimal(number);

        System.out.println(getNumber2());
        System.out.println(getNumber8());
        System.out.println(getNumber16());
    }

    public static void setNumber() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Task1.number = n;
    }

    public static void toBinary(int number) {
        String num = "";
        while (number>0){
            num = number%2 + num;
            number = number/2;
        }
        setNumber2(num);
    }

    public static void toOctal (int number) {
        String num = "";
        while (number>0){
            num = number%8 + num;
            number = number/8;
        }
        setNumber8(num);
    }

    public static void toHexadecimal (int number) {
        String num = "";
        int additionalnum;
        int left;
        while (number>0){
            additionalnum = number/16;
            left = number - additionalnum*16;
            if (left>9){
                num = letterConvertation(left) + num;
            } else {
                num = left + num;
            }
            number = additionalnum;
        }
        setNumber16(num);
    }

    public static String getNumber2() {
        return number2;
    }

    public static String getNumber8() {
        return number8;
    }

    public static String getNumber16() {
        return number16;
    }

    public static void setNumber2(String number2) {
        Task1.number2 = number2;
    }

    public static void setNumber8(String number8) {
        Task1.number8 = number8;
    }

    public static void setNumber16(String number16) {
        Task1.number16 = number16;
    }

    public static String letterConvertation(int number) {
        String num = "";
        if (number == 10) {
            num = "a";
        } else if (number == 11) {
            num = "b";
        } else if (number == 12) {
            num = "c";
        } else if (number == 13) {
            num = "d";
        } else if (number == 14) {
            num = "e";
        } else if (number == 15)
            num = "f";
        return num;
    }


}
