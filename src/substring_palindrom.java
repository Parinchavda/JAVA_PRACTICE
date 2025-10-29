public class substring_palindrom {
    public static boolean checkpalindrom(String str) {
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return  false ;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        int count = 0;
        String s = "ABBD";
        for (int i = 0; i <= 3; i++) {
            for (int j = i + 1; j <= 4; j++) {
                if (checkpalindrom(s.substring(i , j)) == true){
                    System.out.print(s.substring(i , j) + " ");
                    count++;
                }
            }
        }
        System.out.println("The number of palindromic substrings are " + "| " + count + " |");
    }
}
