public class string_palindrom {
    public static void main(String[] args) {
        String s = "ypy";
        int i =0 ;
        int j = s.length()-1 ;
        boolean flag = true ;
        while (i<j)
        {
            if (s.charAt(i) != s.charAt(j))
            {
                flag = false ;
                break;
            }
            i++;
            j--;
        }
        if (flag == true){
            System.out.println("palindrom");
        }
        else {
            System.out.println("not palindrom");
        }
    }
}
//check first and last element and is not match return falsu and say not palindrom
//if first and last element is same then if condition is true and say palindrom
//and then check second and last second element and then continue checking

//second trick is using string builder convert reverse string and compare then if same return palidrom
//in this trick use create new string builder and new string and fill the string builder in
// string through space and then compare both string
//in this method use more memory for create string and stringbuilder