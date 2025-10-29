//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class loop22 {
    public loop22() {
    }

    public static void main(String[] args) {
        for(char i = 'A'; i <= 'E'; ++i) {
            char y;
            for(y = 'E'; y >= i; --y) {
                System.out.print(" ");
            }

            for(y = i; y >= 'A'; --y) {
                System.out.print(y);
            }

            int p = 66;

            for(y = 'A'; y < i; ++y) {
                System.out.print((char)p);
                ++p;
            }

            System.out.println();
        }

    }
}
