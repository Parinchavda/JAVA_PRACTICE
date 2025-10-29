//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class selection {

    public static void printarray(int[] arr) {
        System.out.println("sorted array =>");

        for(int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size =>");
        int no = sc.nextInt();
        int[] arr = new int[no];
        System.out.println("Enter Elements => ");

        int i;
        for(i = 0; i < arr.length; ++i) {
            arr[i] = sc.nextInt();
        }

        System.out.println("original array ");

        for(i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for(i = 0; i < arr.length - 1; ++i) {
            int minmum_index = i;

            int j;
            for(j = i + 1; j < arr.length; ++j) {
                if (arr[j] < arr[minmum_index]) {
                    minmum_index = j;
                }
            }

            j = arr[minmum_index];
            arr[minmum_index] = arr[i];
            arr[i] = j;
        }

        printarray(arr);
    }
}
