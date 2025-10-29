//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class loop35 {
    public loop35() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter one number =>  ");
        int no = sc.nextInt();
        int a = 0;
        int b = 1;

        for(int i = 1; i <= no; ++i)
        {
            for(int j = 1; j <= i; ++j)
            {
                System.out.print(a + "  ");
                int c = a + b;
                a = b;
                b = c;
            }
            System.out.println();
        }
    }
}
