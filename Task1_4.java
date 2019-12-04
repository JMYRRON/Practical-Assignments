package lesson1;

import java.util.Random;
import java.util.Scanner;

public class Task4 {

    private static int width;

    public static void main (String[] args) {
        setWidth();
        int [][] matrix1 = new int [width][width];

        generateRandomMatrix(matrix1);
        printMatrix(matrix1);
        matrixRotation(matrix1);
        printMatrix(matrix1);

    }

    public static void setWidth() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Task4.width = n;
    }

    public static void generateRandomMatrix (int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = new Random().nextInt(10);
            }
        }
    }

    public static void matrixRotation (int[][] matrix) {
        int [][] matrix2 = new int[width][width];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width; j++) {
                matrix2[i][j] = matrix[i][j];
            }
        }
        for (int y = 0; y < width; y++) {
            int indexx = width-1;
            for (int x = 0; x < width; x++) {
                matrix[x][y] = matrix2[y][indexx];
                indexx--;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int y = 0; y < width; y++) {
            for (int x = 0; x < width; x++) {
                System.out.print(matrix[y][x]);
            }
            System.out.println();
        }

    }
}

