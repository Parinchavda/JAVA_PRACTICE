import java.util.Scanner;
public class arr_odd {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number :=");
        int no = sc.nextInt();
        int[] arr = new int[no];

        System.out.println("Enter array elements :-");
        for (int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println();
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("Even numbers");
        for (int i=0;i<arr.length;i++)
        {
            if (i%2==1)
            {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        System.out.println("odd numbers");
        for (int i=0;i<arr.length;i++)
        {
            if (i%2==0)
            {
                System.out.print(arr[i] + " ");
            }
        }
    }
}