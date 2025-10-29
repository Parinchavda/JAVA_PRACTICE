import java.util.Arrays;
import java.util.Scanner;

public class anagrams {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter one string =>");
        String string1 = sc.nextLine();
        System.out.println("Enter second string =>");
        String string2 = sc.nextLine();

        if (string1.length() != string2.length()) {
            System.out.println("not anagrams");
        }
        char[] s = string1.toCharArray();
        char[] S = string2.toCharArray();

        Arrays.sort(s);
        Arrays.sort(S);

        if (Arrays.equals(s , S))
        {
            System.out.println("anagrams");
        }
        else {
            System.out.println("not anagrams");
        }
    }
}
