//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class harmonic {
    public harmonic() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terrms:-");
        int no = sc.nextInt();
        double sum = 0.0;

        for(int i = 1; i <= no; ++i) {
            sum += 1.0 / (double)i;
        }

        System.out.println("the sum of  harmonic series is :" + sum);
    }
}
