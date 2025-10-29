import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class isomorphic
{
    public static boolean isismorphic(String s , String t)
    {
        Map<Character , Character> mp = new HashMap<>();
        for (int i=0;i<s.length();i++)
        {
            Character sch = s.charAt(i);
            Character tch = t.charAt(i);
            if (mp.containsKey(sch))
            {
                if(mp.get(sch) !=  tch) return  false;
            } else if (mp.containsValue(tch)) {
                return  false;
            }
            else {
                mp.put(sch , tch);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = "aab";
        String s2 = "xxy";
        isismorphic(s1 , s2);
    }
}
