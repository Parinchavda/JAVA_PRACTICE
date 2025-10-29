//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class loop2 {
    public loop2() {
    }

    public static void main(String[] args) {
        int y = 1;

        for(int i = 1; i < 5; ++i) {

            for(int k = 4; k > i; --k) {
                System.out.print(" ");
            }

            for(int j = 1; j <= i; ++j) {
                System.out.print(" " + y);
                ++y;
            }

            System.out.println();
        }

    }
}

//                     1
//                    2 3
//                   4 5 6
//                  7 8 9 10