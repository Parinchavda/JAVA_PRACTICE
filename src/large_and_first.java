import java.util.Arrays;
import java.util.Scanner;

public class large_and_first {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter array size =>");
        int no = sc.nextInt();
        int[] arr = new int[no];

        System.out.println("Enter array elements");
        for (int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println();
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }

        Arrays.sort(arr);

        int  max = arr[arr.length - 1]; //after soting max mean last number
            int temp = arr[0]; // swap the first and last number
            arr[0] = arr[arr.length-1];
            arr[arr.length-1] = temp;
            arr[0] = (int) Math.pow(arr[0] , 2); //first mean max is on first number and square them

        System.out.println();
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
