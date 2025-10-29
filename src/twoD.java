//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class twoD {
    public twoD() {
    }

    static void printmatrix(int[][] arr) {
        for(int i = 0; i < arr.length; ++i) {
            for(int j = 0; j < arr[i].length; ++j) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }

    }

    static void add(int[][] arr1, int r1, int c1, int[][] arr2, int r2, int c2) {
        if (r1 != c1 && r2 != c2) {
            System.out.println("sum is not possible ");
        }

        int[][] sum = new int[r1][c1];

        for(int i = 0; i < r1; ++i) {
            for(int j = 0; j < c1; ++j) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        printmatrix(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers and rows for matrix 1 =>");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] arr1 = new int[r1][c1];
        System.out.println("Enter vlaue for matrix 1 =>");

        int r2;
        int c2;
        for(r2 = 0; r2 < r1; ++r2) {
            for(c2 = 0; c2 < c1; ++c2) {
                arr1[r2][c2] = sc.nextInt();
            }
        }

        System.out.println("Enter rows and colmns for matrix  2 =>");
        r2 = sc.nextInt();
        c2 = sc.nextInt();
        int[][] arr2 = new int[r2][c2];
        System.out.println("Enter value for matrix 2 =>");

        for(int i = 0; i < r2; ++i) {
            for(int j = 0; j < c2; ++j) {
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix 1");
        printmatrix(arr1);
        System.out.println("Matrix 1");
        printmatrix(arr2);
        System.out.println("two matrix addition is");
        add(arr1, r1, c1, arr2, r2, c2);
    }
}
