

import java.util.Scanner;

public class even_largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size =>");
        int no = sc.nextInt();
        int[] arr = new int[no];

        System.out.println("Enter array elements =>");
        for (int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }

        // Step 1: Find largest number
        int max = arr[0];
        for (int i=1;i<arr.length;i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Step 2: If max is even → square only that element
        if (max % 2 == 0) {
            for (int i=0;i<arr.length;i++) {
                if (arr[i] == max) {
                    arr[i] = (int) Math.pow(arr[i], 2);
                }
            }
        }
        else {
            System.out.println(" XXXX largest elemnet is not even XXXX");
        }

        // Step 3: Print final array
        System.out.println("Updated Array:");
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

//import java.util.Scanner;
//
//public class even_largest {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Entyer Array Elements =>");
//        int no = sc.nextInt();
//        int[] arr = new int[no];
//
//        System.out.println("Enter array elements =>");
//        for (int i=0;i<arr.length;i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        int max = arr[0];
//        for (int i=1;i<arr.length;i++) {
//            if (arr[i] > max)
//            {
//                max = arr[i];
//            }
//        }
//        if (max % 2 == 0) {
//            for (int i=0;i<arr.length;i++) {
//                if (arr[i] == max) {
//                    arr[i] = (int) Math.pow(arr[i], 2);
//                }
//            }
//        }
//
//        for (int i=0;i<arr.length;i++)
//        {
//            System.out.print(arr[i] + " ");
//        }
//    }
//}
