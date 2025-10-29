//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class loop4 {


    public static void main(String[] args) {
        int i;
        int j;
        for(i = 1; i <= 5; ++i) {
            for(j = 1; j <= i; ++j) {
                System.out.print(" *");
            }

            System.out.println();
        }

        for(i = 4; i >= 1; --i) {
            for(j = i; j >= 1; --j) {
                System.out.print(" *");
            }

            System.out.println();
        }

    }
}
//                 *
//                 * *
//                 * * *
//                 * * * *
//                 * * * * *
//                 * * * *
//                 * * *
//                 * *
//                 *