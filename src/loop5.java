//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class loop5 {
    public loop5() {
    }

    public static void main(String[] args) {
        for(int i = 5; i >= 1; --i) {
            int k;
            for(k = i; k <= 5; ++k) {
                System.out.print(" ");
            }

            for(k = i * 2 - 1; k >= 1; --k) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
//                   *********
//                    *******
//                     *****
//                      ***
//                       *