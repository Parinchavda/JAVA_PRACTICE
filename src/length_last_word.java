public class length_last_word {

    public static int check(String s) {
        s=s.trim(); // remove extra spaces
        int len=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' ')
                return len;
            len++;
        }
        return len;
    }

    public static void main(String[] args) {
        System.out.println(check("hello world"));
    }
}