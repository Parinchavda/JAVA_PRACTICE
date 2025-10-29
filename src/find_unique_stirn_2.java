public class find_unique_stirn_2 {
    public static void main(String[] args) {
        String s = "aaa";
        for (int i=0;i<s.length();i++)
        {
            boolean flag = false;
            for (int j=1;j<s.length();j++)
            {
                if (i != j && s.charAt(i) == s.charAt(j))
                {
                                flag = true;
                }
            }
            if (flag != true)
            {
                System.out.println(s.charAt(i));
                break;
            }
        }
    }
}
