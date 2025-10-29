public class binary_find_minimum {
    static int checkminimum(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;
        int count = 0 ;
        while (start <= end)
        {
            int mid = start + (end - start) / 2 ;
            if (arr[mid] <= arr[arr.length-1])
            {
                count = mid ;
                end = mid -1 ;
            } else if (arr[mid] > arr[arr.length-1])
            {
                start = mid + 1 ;
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        int[] arr = new int[]{3,4,5,1,2};
        System.out.println(checkminimum(arr));
    }
}
/*
in binary search you have to sorted array but in this case there are two sorted array mean rotated array
 */
