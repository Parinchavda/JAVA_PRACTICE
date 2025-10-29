public class binarysearch_targetFind {
    public static boolean findtarget(int[]arr , int target)
    {
        int strart = 0;
        int end = arr.length-1;

        while (strart <= end)
        {
            int mid = (strart + end) / 2;
            if (target == arr[mid])
            {
                return true ;
            }
            else if (target < arr[mid])
            {
                end = mid - 1;
            }
            else {
                strart = mid +1;
            }
        }
        return false;
    }

    //using recursive technique

    public static boolean recursivefind( int[] arr , int start , int end  ,int target) {
        if (start > end) return false;
        //int mid = (start + end) / 2;// when end is in big amount and you have to plus this show error overflow error
        int mid = start + (end - start) / 2 ;//using this method dont show error when plus start and end
        if (target == arr[mid]) {
            return true;
        } else if (target < arr[mid]) {
            return recursivefind(arr, start, mid - 1, target);
        } else {
            return recursivefind(arr, mid + 1, end, target);
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{ 5,8,9,10,12,48,65,70};
        int target = 70;
        while (target != 75)//multiple testcase to run the same code without multiple inputes
        {
            System.out.printf("%d exists in array => %b\n" ,target , recursivefind(arr , 0 ,arr.length-1 ,target));
            System.out.printf("%d exists in  array => %b\n", target , findtarget(arr, target));
            System.out.println();
            target++;
        }
    }
}
