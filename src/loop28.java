//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class loop28 {
    public loop28() {
    }

    public static void main(String[] args) {
        for(int i = 1; i <= 5; ++i) {
            int p;
            for(p = 4; p > i - 1; --p) {
                System.out.print("-");
            }

            for(p = 1; p <= i; ++p) {
                System.out.print(p);
            }

            for(p = i - 1; p >= 1; --p) {
                System.out.print(p);
            }

            System.out.println();
        }
    }
}
