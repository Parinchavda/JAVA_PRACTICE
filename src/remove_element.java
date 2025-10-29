import java.util.ArrayList;
import java.util.Scanner;

public class remove_element {

    public static void main(String[] args) {
        int[] nums = {1 ,4,5,6,7,7};
        int count = 0;

        for (int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number for remove element =>");
        int val = sc.nextInt();

        int k = 0;
        for (int i=0;i<nums.length;i++)
        {
                if (nums[i] != val) {
                    nums[k]=nums[i];
                    k++;
                }
        }
        System.out.print("Array after removing all duplicates: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println("\nNew array size: " + k);
    }
}
