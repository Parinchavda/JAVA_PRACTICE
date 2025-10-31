public class twopointersapproach2 {
    static void printarr(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    static void swap(int[] arr , int i , int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp ;
    }
    static void twopointers(int[] arr)
    {
        for (int i=0;i<arr.length;i++) {
            for (int j = arr.length - 1; j >= 0; j--)
            {
                while (i < j) {
                    if (arr[i] == 1 && arr[j] == 0)
                    {
                        swap(arr, i, j);
                        i++;
                        j--;
                    }
                    if (arr[i] == 0) {
                        i++;
                    }
                    if (arr[j] == 1) {
                        j--;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = new  int[]{0,1,0,1,0,1,0,1,0,1};
        printarr(arr);
        twopointers(arr);
        System.out.println();
        printarr(arr);
    }
}
