public class loop48 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            for (int p = i - 1; p >= 1; p--) {
                System.out.print(p);
            }
            System.out.println();
        }
        for (int y = 1; y <= 4; y++) {
            // print spaces
            for (int x = 1; x <=y+1; x++) {
                System.out.print(" ");
            }
            // print numbers
            for (int t = 1; t <= 5-y ; t++) {
                System.out.print(t);
            }
            for (int f =3;f>=y;f--)
            {
                System.out.print(f);
            }
            System.out.println(); // move to next line
        }
    }
}
