import java.util.Scanner;

public class Areaoftriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number one =>");
        int no1  =  sc .nextInt();

        System.out.println("Enter number two =>");
        int no2  = sc.nextInt();

        double result = 0.5 * no1 * no2 ;
        //double result = (no1 * no2) / 2 ;
        System.out.println(result);
    }
}
