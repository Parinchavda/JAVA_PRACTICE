//find same largest number and squre them
import java.util.Scanner;

public class occurance_squre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entyer Array Elements =>");
        int no = sc.nextInt();
        int[] arr = new int[no];

        System.out.println("Enter array elements =>");
        for (int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        for (int i=1;i<arr.length;i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }
        }
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i] == max)
            {
                System.out.println(arr[i]);
                arr[i] = (int) Math.pow(arr[i] , 2);
            }
            else {
                System.out.println(arr[i]);
            }
        }
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}

//find largest number nd squre them nut only one largest number

//import java.util.Scanner;
//
//public class larg_and_squre {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Entyer Array Elements =>");
//        int no = sc.nextInt();
//        int[] arr = new int[no];
//
//        System.out.println("Enter array elements =>");
//        for (int i=0;i<arr.length;i++)
//        {
//            arr[i] = sc.nextInt();
//        }
//
//        for (int i=0;i<arr.length;i++)
//        {
//            System.out.print(arr[i] + " ");
//        }
//
//        int max= arr[0];
//        int index = 0;
//        for (int i=1;i<arr.length;i++)
//        {
//            if (arr[i] > max )
//            {
//                max = arr[i];
//                index=i;
//            }
//        }
//
//         System.out.println();
//         arr[index] = (int) Math.pow(max , 2);
//
//        for (int i=0;i<arr.length;i++)
//        {
//            System.out.print( arr[i] + " ");
//        }
//    }
//}
