import java.util.Scanner;

public class loop40 {
    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        System.out.println("Enter one number =>");
//        int no = sc.nextInt();

        for (int i=1;i<= 5 ;i++)
        {
            for (int j=i;j>=1;j--)
            {
                if(j%2 != 0)
                {
                    System.out.print("1 ");
                }
                else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
