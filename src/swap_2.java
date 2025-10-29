//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)


import java.util.Scanner;

public class swap_2 {
    public swap_2() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  Number one  = >");
        int no1 = sc.nextInt();
        System.out.println("Enter  Number two  = > ");
        int no2 = sc.nextInt();
        System.out.println("swaped before number one = >" + no1);
        System.out.println("swaped before number two = >" + no2);
        System.out.println();
        no1  = no1 + no2;
        no2 = no1 - no2;
        no1 = no1 - no2;
        System.out.println("After swaping number one => " + no1);
        System.out.println("After swaping number two =>" + no2);
    }
}
