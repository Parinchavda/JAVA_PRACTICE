//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class reverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array =>");
        int no = sc.nextInt();
        int[] arr = new int[no];
        System.out.println("Enter " + no + " Elemnt in  array =>");

        int i;
        for(i = 0; i < arr.length; ++i) {
            arr[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("original ARRAY  =>");

        for(i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("reverse ARRAY =>");

        for(i = arr.length - 1; i >= 0; --i) {
            System.out.print(arr[i] + " ");
        }

    }
}
