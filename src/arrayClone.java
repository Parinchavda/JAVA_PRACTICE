//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Arrays;
import java.util.Scanner;

public class arrayClone {
    public arrayClone() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array");
        int no = sc.nextInt();
        int[] arr = new int[no];
        System.out.println("Enter element of Array =>");

        int i;
        for(i = 0; i < no; ++i) {
            arr[i] = sc.nextInt();
        }

        System.out.println("ORIGINAL ARRAY");

        for(i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("COPIED ARRAY");
        int[] ar = (int[])arr.clone();

        for(int j = 0; j < arr.length; ++j) {
            System.out.print(ar[j] + " ");
        }

        ar[0] = 0;
        ar[1] = 0;
        System.out.println();
        System.out.println("AFTER CHANGING SOME VALUES THEN COPIED ARRAY");
        int[] arrr = Arrays.copyOf(ar, ar.length);

        for(int k = 0; k < arr.length; ++k) {
            System.out.print(arrr[k] + " ");
        }

        System.out.println();
        System.out.println("THEN COPIED ARRAY");
        int[] arra = Arrays.copyOfRange(ar, 0, ar.length);

        for(int y = 0; y < arr.length; ++y) {
            System.out.print(arra[y] + " ");
        }

    }
}
