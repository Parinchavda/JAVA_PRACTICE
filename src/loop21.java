//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class loop21 {
    public loop21() {
    }

    public static void main(String[] args) {
        for(int i = 1; i <= 5; ++i) {
            for(int j = 1; j <= i; ++j) {
                if (j == 1) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }

            System.out.println();
        }

    }
}
