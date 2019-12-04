package lesson1;

import java.util.Scanner;

public class Task1_3 {

    private static int levels;
    private static int maxwidth = 2 * levels - 1;

    public static void main(String [] args) {
        setLevels();
        buildPiramyd(levels);

    }

    public static void setLevels() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Task3.levels = n;
    }

    public static void buildPiramyd(int levels) {
        for (int level = 1; level < levels+1; level++) {
            for (int i = levels; i > level; i--) {
                System.out.print(" ");
            }
            for (int n = 1; n < level + 1; n++) {
                System.out.print(n);
            }
            for (int n = level - 1; n > 0; n--) {
                System.out.print(n);
            }
            for (int i = levels+level; i < maxwidth+1; i++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
