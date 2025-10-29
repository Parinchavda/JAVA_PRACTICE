import java.util.Scanner;

public class find_unique_int {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter array size =>");
        int no = sc.nextInt();
        int[] arr = new int[no];
        int res = 0;

        System.out.println("Enter Array Elements =>");
        for (int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        for (int i=0;i<arr.length;i++)
        {
            res = res ^ arr[i];  // bitwise operator XOR(exclusive OR)
        }
        System.out.println(res);
    }
}
