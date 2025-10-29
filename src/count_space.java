import java.util.Scanner;

public class count_space {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter one string =>");
        String s = sc.nextLine();
        String s2 = " ";
        int space = 0;

        for (int i=0;i<s.length();i++)
        {
            if (s.charAt(i) == ' ')
            {
                space++;
            }
        }
        System.out.println(space);
    }
}
