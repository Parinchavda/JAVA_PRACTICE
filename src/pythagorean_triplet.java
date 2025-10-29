//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class pythagorean_triplet {
    public pythagorean_triplet() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number one :-");
        int num1 = sc.nextInt();
        System.out.println("enter number two :-");
        int num2 = sc.nextInt();
        System.out.println("enter number three :-");
        int num3 = sc.nextInt();
        int max = num1;
        if (num2 >= num1) {
            max = num2;
        }

        if (num3 >= max) {
            max = num3;
        }

        boolean box2;
        if (max == num1) {
            box2 = num2 * num2 + num3 * num3 == num1 * num1;
            System.out.println(box2);
        } else if (max == num2) {
            box2 = num1 * num1 + num3 * num3 == num2 * num2;
            System.out.println(box2);
        } else {
            box2 = num2 * num2 + num1 * num1 == num3 * num3;
            System.out.println(box2);
        }

    }
}
