//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class gdc_lcm {
    public gdc_lcm() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1 :- ");
        int no1 = sc.nextInt();
        System.out.println("enter number 2 :- ");
        int no2 = sc.nextInt();
        int on1 = no1;

        int on2;
        int rem;
        for(on2 = no2; no1 % no2 != 0; no2 = rem) {
            rem = no1 % no2;
            no1 = no2;
        }

        int lcm = on1 * on2 / no2;
        System.out.println(no2);
        System.out.println(lcm);
    }
}
