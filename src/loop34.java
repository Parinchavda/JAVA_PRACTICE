//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class loop34 {
    public loop34() {
    }

    public static void main(String[] args) {
        for(int i = 1; i <= 5; ++i) {
            for(int j = 1; j <= 5; ++j) {
                if (i != j && i + j != 6) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }

            System.out.println();
        }

    }
}
