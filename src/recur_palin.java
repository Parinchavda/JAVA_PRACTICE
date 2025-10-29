import java.util.Scanner;

public class recur_palin {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter one string =>");
        String s1 = sc.nextLine();
        System.out.println("your number is" + (ispalindrom(s1) ? " palindrom" : " notpalindrom"));
    }
    public static boolean ispalindrom(String s)
    {
        if (s.length()<=1)
        {
            return true;
        }
        if (s.charAt(0) !=s.charAt(s.length()-1))
        {
            return  false;
        }
        String s2 = s.substring(1 , s.length()-1);
        return ispalindrom(s2);
    }
}
