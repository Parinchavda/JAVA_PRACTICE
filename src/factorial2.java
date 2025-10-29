//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class factorial2 {
    public factorial2() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any  Number==>");
        int n = sc.nextInt();
        int fact = 1;

        for(int i = 1; i <= n; ++i) {
            fact *= i;
        }

        System.out.println("factorial of " + n + " =>" + fact);
    }
}
