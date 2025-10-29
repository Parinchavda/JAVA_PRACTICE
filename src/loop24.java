//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class loop24 {
    public loop24() {
    }

    public static void main(String[] args) {
        int i;
        int p;
        int y;
        for(i = 1; i <= 5; ++i) {
            for(p = 5; p >= i; --p) {
                System.out.print(" ");
            }

            for(p = i; p >= 1; --p) {
                System.out.print(p);
            }

            p = 2;

            for(y = 2; y < i + 1; ++y) {
                System.out.print(p);
                ++p;
            }

            System.out.println();
        }

        for(i = 4; i >= 1; --i) {
            for(p = 5; p >= i; --p) {
                System.out.print(" ");
            }

            for(p = i; p >= 1; --p) {
                System.out.print(p);
            }

            p = 2;

            for(y = 2; y < i + 1; ++y) {
                System.out.print(p);
                ++p;
            }

            System.out.println();
        }

    }
}
