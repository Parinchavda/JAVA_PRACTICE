//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class loop20 {
    public loop20() {
    }

    public static void main(String[] args) {
        for(int i = 1; i <= 5; ++i) {
            int y;
            for(y = 5; y >= i; --y) {
                System.out.print(" ");
            }

            for(y = i; y >= 1; --y) {
                System.out.print(y);
            }

            y = 2;

            for(int p = 2; p <= i; ++p) {
                System.out.print(y);
                ++y;
            }

            System.out.println();
        }

    }
}
