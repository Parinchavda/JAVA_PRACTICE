import java.util.Scanner;

public class direction_90_2 {
    public static void printarray(int[][] arr)
    {
        for (int i=0;i<arr.length;i++)
        {
            for (int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] transforms(int[][] arr , int r , int c)
    {
        int[][] ans = new int[c][r];
        for (int i=0;i<c;i++)
        {
            for (int j=0;j<r;j++)
            {
                ans[i][j] = arr[j][i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter raw =>");
        int no1 = sc.nextInt();
        System.out.println("Enter column =>");
        int no2 = sc.nextInt();

        System.out.println("enter " + no1 * no2 + " elements =>");
        int[][] arr = new int[no1][no2];

        for (int i=0;i<no1;i++)
        {
         for (int j=0;j<no2;j++)
         {
             arr[i][j] = sc.nextInt();
         }
        }

        int[][] ans = transforms(arr , no1 , no2);
        printarray(ans);

    }
}
