//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class SEARCH_ELEMENT {
    public SEARCH_ELEMENT() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array =>");
        int no = sc.nextInt();
        int[] arr = new int[no];
        int ans = -1;
        System.out.println("Enter Elements = ");

        int x;
        for(x = 0; x < no; ++x) {
            arr[x] = sc.nextInt();
        }

        for(x = 0; x < args.length; ++x) {
            System.out.println(arr[x] + " ");
        }

        System.out.println("Enter x for know the index number =>");
        x = sc.nextInt();

        for(int i = 0; i < no; ++i) {
            if (x == arr[i]) {
                ans = i;
                break;
            }
        }

        System.out.println("" + x + " is index on " + ans);
    }
}
