//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class compare {
    public compare() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Two Numbers:-");
        int no1 = sc.nextInt();
        int no2 = sc.nextInt();
        if (no1 > no2) {
            System.out.println("no1 is greater");
        } else if (no1 < no2) {
            System.out.println("no2 is greater");
        } else if (no1 == no2) {
            System.out.println("number is equal");
        } else {
            System.out.println("please  enter numners");
        }

    }
}
