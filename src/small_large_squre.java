import java.util.Arrays;
import java.util.Scanner;

public class small_large_squre {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter array size =>");
        int no = sc.nextInt();
        int[] arr = new int[no];

        System.out.println("Enter array elements =>");
        for (int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }

        for (int i=0;i<arr.length;i++)
        {
            int temp = arr[0];
            arr[0] = arr[arr.length-1];
            arr[arr.length-1] = temp;
        }
        int min = arr[0];
        int max = arr[arr.length-1];
        System.out.println();
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i] == min)
            {
                arr[i] = (int) Math.pow(min , 2);
            }
        }
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i] == max)
            {
                arr[i] = (int) Math.pow(max , 2);
            }
        }
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
