//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class loop29 {
    public loop29() {
    }

    public static void main(String[] args) {
        int no = 5;
        int sp = no / 2;
        int star = 1;

        for(int i = 1; i <= no; ++i) {
            int k;
            for(k = 1; k <= sp; ++k) {
                System.out.print(" ");
            }

            for(k = 1; k <= star; ++k) {
                System.out.print("*");
            }

            if (i <= no / 2) {
                --sp;
                star += 2;
            } else {
                ++sp;
                star -= 2;
            }

            System.out.println();
        }

    }
}
