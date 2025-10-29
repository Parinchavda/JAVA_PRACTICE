//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
 //using recursion
public class reverse_string {
    public static String reverse(String str) {
        if (str.isEmpty())
        {
            return str ;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }


    public static void main(String[] args) {
        String str = "sssdiit";
        System.out.println(reverse(str));
    }
}
