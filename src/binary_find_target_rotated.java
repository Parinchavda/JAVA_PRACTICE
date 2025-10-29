public class binary_find_target_rotated {
    static  int checktarget(int[] arr , int target)
    {
        int start = 0;
        int end = arr.length-1;

        while (start<=end)
        {
            int mid = start +  (end - start) / 2 ;
            if (arr[mid] == target)
            {
                return mid;
            }
            else if (arr[mid] < arr[end]) // mid to end is sorted
            {
                if (target > arr[mid] && target <= arr[end] )
                {
                    start = mid + 1 ;
                }
                else {
                    end = mid -1 ;
                }
            }
            else { //start to mid is sorted
                if (target >=  arr[start] && target  < arr[mid])
                {
                    end = mid -1;
                }
                else{
                    start  = mid + 1 ;
                }
            }
        }
        return  -1;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{3,4,5,1,2};
        int target = 4; // who from the array
        System.out.println(checktarget(arr , target));
    }
}
