public class find_unique_string {
    public  static  char check(String str)
    {
        for (int i = 0; i < str.length(); i++) {
            boolean found = false;

            for (int j = 1; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if (found != true)
                return str.charAt(i);
        }
        return  '$' ;
    }
    public static void main(String[] args) {
        String s = "aya" ;
        System.out.println(check(s));
    }
}
