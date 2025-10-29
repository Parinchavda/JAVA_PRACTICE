//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class second {
    public second() {
    }

    public static void main(String[] args) {
        System.out.println("positive or nagetive");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println(a);
        System.out.println("Enter b:");
        int b = sc.nextInt();
        System.out.println(b);
        if (b < a) {
            System.out.println("a is greater");
        } else {
            System.out.println("b is greater");
        }

    }
}
