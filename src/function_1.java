//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class function_1 {
    public function_1() {
    }

    public static int fact(int x) {
        int f = 1;

        for(int i = 1; i <= x; ++i) {
            f *= i;
        }

        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n  =>");
        int n = sc.nextInt();
        System.out.print("enter r  =>");
        int r = sc.nextInt();
        int nfact = fact(n);
        int nmrfact = fact(n - r);
        int npr = nfact / nmrfact;
        System.out.println("" + n + "P" + r + " = " + npr);
    }
}
