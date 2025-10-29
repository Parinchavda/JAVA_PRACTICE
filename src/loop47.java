public class loop47 {
    public static void main(String[] args) {
        int f = 12;
        int s = 54;
        int t = 1;

         for (int i = 1; i <=5; i++) {
            for (int j = 1 ;j<=i;j++) {
                if (i == 4) {
                    System.out.print(f + " ");
                    f++;
                } else if (i == 5) {
                    System.out.print(s + " ");
                    s++;
                } else {
                    System.out.print(t + " ");
                    t++;
                }
            }
             System.out.println();
        }
    }
}
