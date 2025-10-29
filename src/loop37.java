//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class loop37 {
    public loop37() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number =>");
        int no = sc.nextInt();
        int star = 1;
        int space = no / 2;

        for(int i = 1; i <= no; ++i) {
            int j;
            for(j = 1; j <= space; ++j) {
                if (i == no / 2 + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for(j = 1; j <= star; ++j) {
                System.out.print("* ");
            }

            if (i <= no / 2) {
                ++star;
            } else {
                --star;
            }

            System.out.println();
        }

    }
}
