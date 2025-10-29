//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Arrays;
import java.util.Scanner;

public class array_1 {
    public array_1() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array =>");
        int no = sc.nextInt();
        int[] arr = new int[no];
        System.out.println("Enter element of array =>");

        int result;
        for(result = 0; result < arr.length; ++result) {
            arr[result] = sc.nextInt();
        }

        for(result = 0; result < arr.length; ++result) {
            System.out.print(arr[result] + " ");
        }

        Arrays.sort(arr);
        System.out.println();

        for(result = 0; result < arr.length; ++result) {
            System.out.print(arr[result] + " ");
        }

        System.out.println();
        result = arr[arr.length - 1] - arr[0];
        System.out.println("Difference between largest  and smallest number is : " + result);
    }
}
