package Task1_2;
import Task1_2.View;
import Task1_2.Model;

import java.util.Scanner;

public class Controller {

    public static void main(String[] args) {

        View.message();
        scanI();
        findAbsoluteNumbers(Model.getI());
    }


    public static void findAbsoluteNumbers(int i) {

        for (int j = 1; j < i; j++) {
            int sum = 0;
            for (int n = 1; n < j; n++) {
                if (j % n == 0) {
                    sum = sum + n;
                }
            }
            if (sum == j) {
                View.message(j);
            }

        }
    }

    public static void scanI() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Model.setI(n);
    }
}
