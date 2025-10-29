import java.util.Scanner;

public class arr_target_sum {
    static void printtarget(int[] arr , int tafget)
    {
        int ans = 0;
        for (int i=0;i<arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++) {
                if (arr[i] + arr[j] == tafget)
                {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter array size =>");
        int no =sc.nextInt();
        int[] arr = new int[no];

        int count = 0;

        System.out.println("Enter " + no + " elements =>");
        for (int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target =>");
        int target = sc.nextInt();

        printtarget(arr , target);
    }
}
