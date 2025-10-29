//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class multiplied {
    public multiplied() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any one number ==>");
        int a = sc.nextInt();
        System.out.println("Enter any one number ==>");
        int b = sc.nextInt();
        int ans = 1;

        for(int i = 1; i <= b; ++i) {
            ans *= a;
        }

        System.out.println(ans * a + "  " + ans);
    }
}
