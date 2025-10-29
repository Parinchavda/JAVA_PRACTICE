//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class loop33 {
    public loop33() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter one Number =>");
        int no = sc.nextInt();

        for(int i = 1; i <= no; ++i) {
            for(int j = 1; j <= no; ++j) {
                if (i == j) {
                    System.out.print("*");
                } else {
                    System.out.print("   ");
                }
            }

            System.out.println();
        }

    }
}
