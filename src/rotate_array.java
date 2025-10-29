import java.util.Scanner;

public class rotate_array {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter array size =>");
        int no = sc.nextInt();
        int[] arr = new int[no];

        System.out.println("Enter array elements =>");
        for (int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter array rotation time =>");
        int k = sc.nextInt();

            k = Math.floorMod(k, arr.length);
            int[] ans = new int[arr.length];
            int j = 0;
            for (int i = arr.length - k;i<arr.length;i++)
            {
                ans[j++] = arr[i];
            }
        for (int i =0;i<arr.length-k;i++)
        {
            ans[j++] = arr[i];
        }

        for (int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i] + " ");
        }
    }
}
