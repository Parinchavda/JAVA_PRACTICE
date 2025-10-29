//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class loop30 {
    public loop30() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter one Number =>");
        int no = sc.nextInt();
        int space = 1;
        int star = no / 2 + 1;

        for(int j = 1; j <= no; ++j) {
            int i;
            for(i = 1; i <= star; ++i) {
                System.out.print("* ");
            }

            for(i = 1; i <= space; ++i) {
                System.out.print("  ");
            }

            for(i = 1; i <= star; ++i) {
                System.out.print("* ");
            }

            if (j <= no / 2) {
                --star;
                space += 2;
            } else {
                ++star;
                space -= 2;
            }

            System.out.println();
        }

    }
}
