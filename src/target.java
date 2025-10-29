//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class target {
    public target() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array =>");
        int no = sc.nextInt();
        int[] arr = new int[no];
        System.out.println("Enter The Elemnt of array =>");

        int target;
        for(target = 0; target < arr.length; ++target) {
            arr[target] = sc.nextInt();
        }

        for(target = 0; target < arr.length; ++target) {
            System.out.println(arr[target] + " ");
        }

        System.out.println();
        System.out.println("Enter target :-");
        target = sc.nextInt();
        int ans = 0;

        for(int p = 0; p < arr.length; ++p) {
            for(int j = p; j < arr.length; ++j) {
                if (arr[p] + arr[j] == target) {
                    ++ans;
                }
            }
        }

        System.out.println(ans);
    }
}
