//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class direction_90_1 {

    static void printarray(int[][] arr) {
        for(int i = 0; i < arr.length; ++i) {
            for(int j = 0; j < arr[i].length; ++j) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void printmatrix(int[][] arr, int row, int column) {
        for(int i = 0; i < column; ++i) {
            for(int j = i; j < row; ++j) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

    }

    static void reverse(int[] arr) {
        int i = 0;

        for(int j = arr.length - 1; j < arr.length - 1; --j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            ++i;
        }

    }

    static void matrix(int[][] arr, int n) {
        printmatrix(arr, n, n);

        for(int i = 0; i < arr.length; ++i) {
            reverse(arr[i]);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns for matrix =>");
        int row = sc.nextInt();
        int column = sc.nextInt();
        int[][] arr = new int[row][column];
        int total = row * column;
        System.out.println("Enter " + total + " elements =>");

        for(int i = 0; i < row; ++i) {
            for(int j = 0; j < column; ++j) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Input matrix =>");
        printarray(arr);
        System.out.println("Transformed matrix =>");
        printmatrix(arr, row, column);
        printarray(arr);
    }
}
