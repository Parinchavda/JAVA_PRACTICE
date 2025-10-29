//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class convert_day {
    public convert_day() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of days :-");
        int num = sc.nextInt();
        int year = num / 365;
        int month = num % 365 / 30;
        int days = num % 365 % 30;
        System.out.println("years==>" + year);
        System.out.println("month==>" + month);
        System.out.println("days==>" + days);
    }
}
