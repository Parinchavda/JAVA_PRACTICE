import java.util.Scanner;

public class nag_to_pos {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter array size =>");
        int no = sc.nextInt();
        int[] arr = new int[no];

        System.out.println("Enter Array elements => ");
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
            arr[i] = Math.abs(arr[i]);
        }
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
