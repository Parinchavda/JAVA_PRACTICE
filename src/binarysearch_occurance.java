public class binarysearch_occurance {
    public static int checkoccurance(int[] arr, int x)
    {
        int start = 0;
        int end = arr.length-1;
        int firstoccurance = -1 ;

        while (start <= end)
        {
            int mid = start + (end - start)/2 ;
            if (arr[mid] == x)
            {
                firstoccurance = mid ;
                end = mid -1 ;
            }
            else if (x < arr[mid])
            {
                end = mid - 1 ;
            }
            else {
                start  = mid + 1 ;
            }
        }
        return firstoccurance;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{ 1,5,5,5,5,5,6,6,6,2,4};
        int x = 5 ;
        System.out.println(checkoccurance(arr, x));
    }
}
//find first occurance