public class stringcomprasion {
    public static void main(String[] args) {
        String s = "aaabbbtttyyyyypppp" ;
        String ans = "" + s.charAt(0);
        int count = 0;
        for (int i= 1;i<s.length();i++)
        {
            char curr = s.charAt(i);
            char pre = s.charAt(i-1);
            if(curr == pre)
            {
                count++;
            }
            else {
                if(1<count)ans = ans + count;
                count = 1;
                ans = ans + curr ;
            }
        }
        ans = ans + count ;
        System.out.println(ans);
    }
}
