//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class matrix_twoArr {
    public matrix_twoArr() {
    }

    public static void main(String[] args) {
        int[][] a = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Elements:");

        int i;
        int j;
        for(i = 0; i < 3; ++i) {
            for(j = 0; j < 3; ++j) {
                a[i][j] = sc.nextInt();
            }
        }

        for(i = 0; i < 3; ++i) {
            for(j = 0; j < 3; ++j) {
                System.out.print(a[i][j] + " ");
            }

            System.out.println();
        }

    }
}
