//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class loop7 {
    public loop7() {
    }

    public static void main(String[] args) {
        int i;
        int k;
        for(i = 1; i <= 5; ++i) {
            for(k = 5; k >= i; --k) {
                System.out.print(" ");
            }

            for(k = 1; k <= i; ++k) {
                System.out.print("*");
            }

            System.out.println();
        }

        for(i = 4; i >= 1; --i) {
            for(k = i; k <= 5; ++k) {
                System.out.print(" ");
            }

            for(k = i; k >= 1; --k) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
