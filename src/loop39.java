import java.util.Scanner;

public class loop39 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter one number =>");
        int no = sc.nextInt();
        for (int i=1;i<=no;i++)
        {
            for (int j = 1; j <= i; j++)
            {
                if (i % 2 == 0)
                {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
//                        0
//                        1 1
//                        0 0 0
//                        1 1 1 1
//                        0 0 0 0 0