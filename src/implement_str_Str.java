import java.util.Scanner;
//--leetcode -28
public class implement_str_Str {
    public static int check_implement(String s1 , String s2)
    {
        if (s2.isEmpty())
            System.out.println("0");

        for (int i=0;i<s1.length() -s2.length();i++)
        {
            if (s1.substring(i , i + s2.length()).equals(s2))
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
//        String s1 = "abcd";   // haystack
//        String s2 = "bc";     // needle
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter String one =>");
        String s1 = sc.nextLine();

        System.out.println("Enter String one =>");
        String s2 = sc.nextLine();

        System.out.println(check_implement(s1 , s2));

    }
}
/* this progrma is check for one full string is appear in first
 string mean second string is appear in first string
 */