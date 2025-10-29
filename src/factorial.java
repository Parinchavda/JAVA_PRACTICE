//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class factorial {
    public factorial() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any numner:-");
        int number = sc.nextInt();

        for(int i = number - 1; i >= 1; --i) {
            number = number * i;
        }

        System.out.println("factorial is =>" + number);
    }
}
