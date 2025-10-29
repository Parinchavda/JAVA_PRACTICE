//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class sumofdigit2 {
    public sumofdigit2() {
    }

    public static void main(String[] args) {
        int sum = 0 ;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter array size =>");
        int no = sc.nextInt();
        int[] arr = new int[no];

        System.out.println("Enter array elements => ");
        for (int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < arr.length; ++i) {
            sum += arr[i];
            System.out.println("number "+  i + " is " + arr[i]);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("answer is  " + sum);
    }
}
