import java.util.Scanner;

public class guss_game {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num =4 , guess;
        do {
            System.out.println("enter number for guessing =>");
            guess = sc.nextInt();
        }while (num!=guess);
        System.out.println("successfully guessing the number");
    }
}
