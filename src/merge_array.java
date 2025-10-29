import java.util.Arrays;

public class merge_array {
    public static void main(String[] args) {
        int[] arr1 = new int[]{34,67,87,44,33,69,1,20};
        int[] arr2 = new int[]{6,5,12,89,90,444,345,678};

        for (int i=0;i< arr1.length;i++)
        {
            for (int j=i+1;j<arr1.length;j++)
            {
                if (arr1[i] > arr1[j])
                {
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
            System.out.println(arr1[i]);
        }
        System.out.println("_____________________");
        for (int i=0;i< arr2.length;i++)
        {
            for (int j=i+1;j<arr2.length;j++)
            {
                if (arr2[i] > arr2[j])
                {
                    int temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
            System.out.println(arr2[i]);
        }
        int[] merged = new int[arr1.length + arr2.length];

        // Copy arr1 into merged
        System.arraycopy(arr1, 0, merged, 0, arr1.length);

        // Copy arr2 into merged (starting after arr1)
        System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);
        

        System.out.println("Merged Array: " + Arrays.toString(merged));
    }
}
