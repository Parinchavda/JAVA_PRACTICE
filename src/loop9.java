//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class loop9 {
    public loop9() {
    }

    public static void main(String[] args) {
        for(int i = 1; i <= 5; ++i) {
            for(int j = 1; j <= i; ++j) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }

            System.out.println();
        }

    }
}
