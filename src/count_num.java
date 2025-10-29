//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class count_num {
    public count_num() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Numner=>>");
        int n = sc.nextInt();
        int count = 0;

        int originalnumber;
        for(originalnumber = n; 0 < n; ++count)
        {
            n /= 10;
        }

        System.out.println("The count number of " + originalnumber + " is " + count);
    }
}
