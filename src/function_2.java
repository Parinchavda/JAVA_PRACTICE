//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class function_2 {
    public function_2() {
    }

    public static void countnum(int[] arr, int x) {
        int count = 0;

        for(int i = 0; i < arr.length; ++i) {
            if (arr[i] == x) {
                ++count;
            }
        }

        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array =>");
        int no = sc.nextInt();
        int[] arr = new int[no];
        System.out.println("Enter Elements of array =>");

        int x;
        for(x = 0; x < no; ++x) {
            arr[x] = sc.nextInt();
        }

        System.out.println();

        for(x = 0; x < arr.length; ++x) {
            System.out.print(arr[x] + " ");
        }

        System.out.println();
        System.out.println("Enter number to get repeated number in array  :");
        x = sc.nextInt();
        countnum(arr, x);
    }
}
