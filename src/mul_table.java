//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class mul_table {
    public mul_table() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number between 1 to 100:-");
        int num = sc.nextInt();

        for(int i = 1; i <= 10; ++i) {
            System.out.println("" + num + "*" + i + "=" + num * i);
        }

        System.out.println();
    }
}
