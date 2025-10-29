//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class loop1 {
    public loop1() {
    }

    public static void main(String[] args) {
        for(char i = 'A'; i <= 'E'; ++i) {
            for(char j = 'A'; j <= i; ++j) {
                System.out.print(j);
            }

            System.out.println();
        }

    }
}
//        A
//        AB
//        ABC
//        ABCD
//        ABCDE