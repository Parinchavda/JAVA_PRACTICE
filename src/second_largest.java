import java.util.Scanner;

public class second_largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size =>");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements =>");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max =arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for (int i = 0; i < n; i++) { //convert all maximum value into infinity
            if (arr[i] == max) {
                arr[i] = Integer.MIN_VALUE;
            }
        }

        int secondMax = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("No second maximum found (all elements are equal).");
        } else {
            System.out.println("Second maximum number => " + secondMax);
        }
    }
}
