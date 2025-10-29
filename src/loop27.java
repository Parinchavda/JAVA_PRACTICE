//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class loop27 {
    public loop27() {
    }

    public static void main(String[] args) {
        for(int i = 1; i <= 5; ++i) {
            int k;
            for(k = i; k <= 5; ++k) {
                System.out.print( k + "  ");
            }

            for(k = 1; k <= i - 1; ++k) {
                System.out.print(k + "  ");
            }

            System.out.println();
        }

    }
}
