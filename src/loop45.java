public class loop45 {
    public static void main(String[] args) {
        for (int i=1;i<=3;i++)
        {
            for (int j=3;j>=i;j--)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++)
            {
                System.out.print(k);
            }
            for (int y=i-1;y>=1;y--)
            {
                System.out.print(y);
            }
            System.out.println();
        }
        for (int i = 2; i >= 1; i--) {

            for (int j = 3; j >=i; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
