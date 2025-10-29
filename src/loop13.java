//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class loop13 {
    public loop13() {
    }

    public static void main(String[] args) {
        for(int i = 5; i >= 1; --i) {
            for(int j = i; j >= 1; --j) {
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
