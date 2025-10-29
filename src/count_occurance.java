import java.util.Scanner;

public class count_occurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array :-");
        int no = sc.nextInt();
        int[] arr = new int[no];
        System.out.println("Enter element for array :-");

        int x;
        for(x = 0; x < arr.length; ++x) {
            arr[x] = sc.nextInt();
        }

        for(x = 0; x < arr.length; ++x) {
            System.out.print(arr[x] + " ");
        }
        System.out.println();
        System.out.println("find the number of occurance");
        int no1 = sc.nextInt();
        int count=0;
        System.out.println();
        for(x = 0; x < arr.length; ++x) {
            if (no1==arr[x])
            {
                count++;
            }
        }
        System.out.println("number of occurace is " + count);
    }
}
