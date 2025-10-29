//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Actisystem_1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1 =>");
        int no1 = sc.nextInt();
        System.out.println("Enter Number 2 =>");
        int no2 = sc.nextInt();
        System.out.println("Enter Number 3 =>");
        int no3 = sc.nextInt();

        int i;
        int k;
        for(i = 1; i <= no1; ++i) {
            for(k = no1; k >= i; --k) {
                System.out.print(" ");
            }

            for(k = i; k >= 1; --k) {
                System.out.print("" + i + " ");
            }

            System.out.println();
        }

        for(i = 1; i <= no2; ++i) {
            for(k = no2; k >= i; --k) {
                System.out.print(" ");
            }

            for(k = i; k >= 1; --k) {
                System.out.print("" + i + " ");
            }

            System.out.println();
        }

        for(i = 1; i <= no3; ++i) {
            for(k = no3; k >= i; --k) {
                System.out.print(" ");
            }

            for(k = i; k >= 1; --k) {
                System.out.print("" + i + " ");
            }

            System.out.println();
        }

    }
}
