import java.util.Scanner;

public class count_vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter one string =>");
        String s = sc.nextLine();
        String s2 = "aeiou";
        int vowels = 0;
        int consonants = 0 ;
        for (int i=0;i<s.length();i++)
        {
            for (int j = 0; j < s2.length(); j++)
            {
                if (s.charAt(i) ==  s2.charAt(j))
                {
                    vowels++;
                }
            }
        }
        System.out.println("vowels " + vowels);
    }
}
