import java.util.Scanner;

public class remove_duplicate_string_1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter one string => ");
        String s = sc.nextLine();
         for (int i=0;i<s.length();i++)
        {
            boolean found = false;
            for (int j=i+1;j<s.length();j++)
            {
                if (s.charAt(i) == s.charAt(j))
                {
                    found = true;
                    break;
                }
            }
            if (found == false)
            {
                System.out.print(s.charAt(i));
            }
        }
    }
}
