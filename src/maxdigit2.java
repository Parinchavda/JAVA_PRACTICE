import java.util.Arrays;

public class maxdigit2 {
    public static void main(String[] args)
    {
        int min=0;
        int max=0;
        int[] arr = new int[]{1 ,333,5,3,6,7,87,88};
        Arrays.sort(arr);
        int[] sorted = new int[arr.length];
        for (int i = 0; i < sorted.length; i++)
        {
            System.out.println(arr[i]);
        }
            System.out.println(arr[0]);
            System.out.println(arr[arr.length-1]);
    }
}
