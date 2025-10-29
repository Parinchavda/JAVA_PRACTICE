public class loop46 {
    public static void main(String[] args) {
        int y = 1;
        char p = 'A';
        for (int i=1;i<=5;i++)
        {
            for (int j=1;j<=i;j++)
            {
                if (i % 2 == 0)
                {
                    System.out.print(y);
                    y++;
                }
                else
                {
                    System.out.print(p);
                    p++;
                }
            }
            System.out.println();
        }
    }
}
