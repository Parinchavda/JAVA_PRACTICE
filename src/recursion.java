//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class recursion {
    static void print(int n) {
        if (n == 1) {
            System.out.println(n);
        } else {
            System.out.println(n);
            print(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter One Number :- ");
        int n = sc.nextInt();
        print(n);
    }
}
