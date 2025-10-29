//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class grater {
    public grater() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array :-");
        int no = sc.nextInt();
        int[] arr = new int[no];
        System.out.println("Enter element for array :-");

        int x;
        for(x = 0; x < arr.length; ++x) {
            arr[x] = sc.nextInt();
        }

        for(x = 0; x < arr.length; ++x) {
            System.out.print(arr[x] + " ");
        }

        System.out.println();
        System.out.println("Enter valuse for find the number greater the x ");
        x = sc.nextInt();

        for(int i = 0; i < arr.length; ++i) {
            if (x < arr[i]) {
                System.out.println(arr[i] + " is greater then " + x);
            }
        }

    }
}
