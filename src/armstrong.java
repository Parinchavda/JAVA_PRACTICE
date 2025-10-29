//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

//153 = 1^3 * 5^3 * 3^3 = 1 + 125 + 27 = 153
import java.util.Scanner;

public class armstrong {
    public armstrong() {
    }

    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int num = sc.nextInt();

        for(int i = num; 0 < i; i =i/ 10) {
            int rem = i % 10;
            sum = sum + rem * rem * rem;
        }

        if (sum == num) {
            System.out.println("is an armstrong");
        } else {
            System.out.println("is not an armstrong");
        }

    }
}
