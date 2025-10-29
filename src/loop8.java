//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class loop8 {
    public loop8() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of lines :");
        int no = sc.nextInt();

        for(int i = 1; i <= no; ++i) {
            int k;
            for(k = 5; k >= i; --k) {
                System.out.print(" ");
            }

            for(k = 1; k <= i; ++k) {
                System.out.print(k);
            }

            int a = i - 1;

            for(k = 1; k <= i - 1; ++k) {
                System.out.print(a);
                --a;
            }

            System.out.println();
        }

    }
}
