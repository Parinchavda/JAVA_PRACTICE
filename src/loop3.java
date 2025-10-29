//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class loop3 {


    public static void main(String[] args) {
        for(int i = 1; i <= 5; ++i)
        {
            int k;
            for(k = 5; k >= i; --k)
            {
                System.out.print(" ");
            }
            for(k = 1; k <= i * 2 - 1; ++k)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//                            *
//                           ***
//                          *****
//                         *******
//                        *********