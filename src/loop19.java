//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class loop19 {
    public loop19() {
    }

    public static void main(String[] args) {
        for(int i = 5; i >= 1; --i) {
            int j;
            for(j = 1; j <= i; ++j) {
                System.out.print(" ");
            }

            for(j = i; j <= 5; ++j) {
                System.out.print(j);
            }

            System.out.println();
        }

    }
}
