//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class check_array {
    public check_array() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array =>");
        int no = sc.nextInt();
        int[] arr = new int[no];
        System.out.println("Enter The Elemnt of array =>");

        int i;
        for(i = 0; i < arr.length; ++i) {
            arr[i] = sc.nextInt();
        }

        for(i = 0; i < arr.length; ++i) {
            System.out.println(arr[i] + " ");
        }

        boolean check = true;
        int j = 1;
        if (i < arr.length && arr[i] > arr[i - 1]) {
            check = true;
        }

        if (check) {
            System.out.println("not sorted ");
        } else {
            System.out.println("is sorted");
        }

    }
}
