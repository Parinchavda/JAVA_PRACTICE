//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
// 1 2 3 4 5
// 1 3 6 10 15
//1+2+3+4+5
import java.util.Scanner;

public class prefix_sum {
    public prefix_sum() {
    }

    public static void print(int[] arr) {
        for(int i = 1; i < arr.length; ++i) {
            arr[i] += arr[i - 1];
        }

    }

    static void printarr(int[] arr) {
        for(int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }

    }

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

        for(i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        print(arr);
        printarr(arr);
    }
}
