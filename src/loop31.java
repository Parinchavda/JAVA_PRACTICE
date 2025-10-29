//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class loop31 {
    public loop31() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter one Number =>");
        int no = sc.nextInt();

        for(int i = no; i >= 1; --i) {
            for(int j = no; j >= 1; --j) {
                if (j == i) {
                    System.out.print("  ");
                } else {
                    System.out.print("*");
                }
            }

            System.out.println();
        }

    }
}
