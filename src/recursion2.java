//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class recursion2 {
    static void printsum(int i, int no, int sum) {
        if (i == no) {
            sum = sum + i;
            System.out.println(sum);
        } else {
            sum =sum+ i;
            printsum(i + 1, no, sum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number := ");
        int no = sc.nextInt();
        printsum(1, no, 0);
    }
}
