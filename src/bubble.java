import java.util.Scanner;
//pela element jode bijo element karto revano
//first element is comapre with second element and then continue this process untill your is not sorted
public class bubble
{
    public static void printarr(int[] arr)
    {
        System.out.println("sorted array");
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size =>");
        int no = sc.nextInt();
        int[] arr = new int[no];

        int i;
        System.out.println("enter array elements for array =>");
        for (i=0;i< arr.length;i++)
        {
            arr[i] =sc.nextInt();
        }
        System.out.println("original array");
        for (i=0;i< arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (i=0;i< arr.length-1;i++)
        {
            for (int j=0;j< arr.length-i-1;j++)
            {
                if (arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        printarr(arr);
    }
}