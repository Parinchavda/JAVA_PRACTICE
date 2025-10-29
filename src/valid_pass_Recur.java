import java.util.Scanner;

public class valid_pass_Recur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1;
        do {
            System.out.println("Enter a valid password ->");
             s1 = sc.next();
        }while (!isvalid(s1));
        System.out.println("thanks for Entering valid password");
    }
    public  static  boolean isvalid(String s)
    {
        return s.equals("parin123");
    }
}
