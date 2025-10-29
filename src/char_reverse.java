public class char_reverse {
    public static void main(String[] args) {
        String s2 = "AB CD YP PY";
        String ans = " " ;
        StringBuilder s = new StringBuilder("");

        for (int i=0;i<s2.length();i++)
        {
            char ch = s2.charAt(i);
            if (ch != ' ')
            {
                s.append(ch);
            }
            else {
                s.reverse();
                ans = ans + s ;
                ans = ans + ' ';
                s = new StringBuilder("");
            }
        }
        s.reverse();
        ans = ans + s ;
        System.out.println(ans);

    }
}
