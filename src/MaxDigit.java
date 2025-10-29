//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class MaxDigit {
    public MaxDigit() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array =>");
        int no = sc.nextInt();
        int[] arr = new int[no];
        System.out.println("Enter Elements in array = >");

        int sum = 0;
        for(sum = 0; sum < arr.length; ++sum) {
            arr[sum] = sc.nextInt();
        }

        for(sum = 0; sum < arr.length; ++sum) {
            System.out.print(arr[sum] + " ");
        }

        for(int i = 0; i < arr.length; ++i) {
            if (sum < arr[i]) {
                sum = arr[i];
            }
        }

        System.out.println();
        System.out.println("larger element is " + sum);
    }
}
