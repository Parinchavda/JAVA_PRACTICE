public class bubbleshortnewmethod {
     static void printarrar(int[] arr)
     {
         for (int i=0;i<arr.length;i++)
         {
             System.out.print(arr[i] + " ");
         }
     }
    public static void main(String[] args) {
        int[] arr = new int[]{5,4,3,2,1};
        boolean flag= true ;
        for (int i = 0; i < arr.length - 1; i++)
        {
            for (int j = i + 1; j > 0; j--)
            {
                if (arr[j] < arr[j - 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    flag = false ;
                }
            }
            if (!flag)
            {
                return;
            }
        }
        printarrar(arr);
    }
}
/*  when array is nearly sorted(2,1,3,4,5) that time you have to check the if any any
swaping is happend or not and if answer is not return from the loop
        */

