//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class loop12 {
    public loop12() {
    }

    public static void main(String[] args) {
        for(int i = 1; i <= 5; ++i) {
            for(int j = 1; j <= i; ++j) {
                if (i != 2 && i != 4) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }

            System.out.println();
        }

    }
}
