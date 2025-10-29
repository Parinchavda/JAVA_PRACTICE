public class practice {
    static void printarrar(int[] arr)
    {
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {

        int[] arr = new int[]{5,4,3,2,1};
        int[] ans = new int[0];

        for (int i=0;i<arr.length-1;i++)
        {
            int minimum  = arr[0];
            if (minimum < arr[i+1])
            {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp ;
            }
        }
        printarrar(arr);
    }
}
