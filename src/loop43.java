public class loop43 {
    public static void main(String[] args) {
        for (int i=5;i>=1;i--)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(j + " ");
            }
            for (int k=1;k<=5;k++)
            {
                for (int p=i;p>=1;p--)
                {
                    System.out.print(p +" ");
                }
            }
            System.out.println();
        }
    }
}
