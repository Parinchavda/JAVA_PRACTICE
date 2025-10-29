//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class loop38 {
    public loop38() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter only odd number :-");
        int no = sc.nextInt();
        int star = no;
        int space = 0;

        for(int i = 1; i <= no; ++i) {

            for(int k = 1; k <= space; k++) {
                System.out.print("  ");
            }

            for(int k = 1; k <= star; k++)
            {
                if (i > 1 && i <= no / 2 && k > 1 && k < star)
                {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }

            if (i <= no / 2) {
                ++space;
                star -= 2;
            } else {
                --space;
                star += 2;
            }

            System.out.println();
        }

    }
}
