//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class secolarge {
    public secolarge() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array =>");
        int no = sc.nextInt();
        int[] arr = new int[no];
        int sum = 0;
        System.out.println("Enter " + no + " The positive  Elemnt in  array =>");

        int larg;
        for(larg = 0; larg < arr.length; ++larg) {
            arr[larg] = sc.nextInt();
        }

        for(larg = 0; larg < arr.length; ++larg) {
            System.out.print(arr[larg] + " ");
        }

        for(larg = 0; larg < arr.length; ++larg) {
            if (arr[larg] > sum) {
                sum = arr[larg];
            }
        }

        System.out.println();
        System.out.println("first largest number " + sum);
        larg = 0;

        for(int i = 0; i < arr.length; ++i) {
            if (sum == arr[i]) {
                arr[i] = Integer.MIN_VALUE;
            }

            if (arr[i] > larg) {
                larg = arr[i];
            }
        }

        System.out.println("second largest number =>" + larg);
    }
}
