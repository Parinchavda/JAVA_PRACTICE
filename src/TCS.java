import java.util.Scanner;

public class TCS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            arr[i] = Math.abs(arr[i]);
        }

        int max = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }

        arr[index] = (int) Math.pow(max, 2);
        for (int j=0;j<arr.length;j++)
        {
            System.out.print(arr[j] + " ");
        }
    }
}
