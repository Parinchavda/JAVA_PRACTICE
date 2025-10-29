import java.util.Scanner;

public class odd_largest {
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

        int max =arr[0];
        for (int i=1;i<arr.length;i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }
        }
        if (max %2 != 0)
        {
            for (int i=0;i<arr.length;i++)
            {
                if (arr[i]==max)
                {
                    arr[i]= (int) Math.pow(arr[i] , 2);
                }
            }
        }
        else {
            System.out.println("largest element not even");
        }
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
