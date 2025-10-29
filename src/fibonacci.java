//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class fibonacci {
    public static  int isfibo(int num) {
        if (num == 1)
        {
            return 0;
        }
        if (num==2)
        {
            return 1;
        }
        return  (isfibo(num-1) + isfibo(num-2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers : ");
        int no = sc.nextInt();
        int a = 0;
        int b = 1;

        for(int i = 1; i <= no; ++i) {
            System.out.print(isfibo(i) + " ");
        }
    }
}

