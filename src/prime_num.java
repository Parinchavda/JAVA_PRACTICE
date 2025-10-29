import java.util.Scanner;

public class prime_num {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        System.out.println("number is" + (isprime(no) ? " prime" : " not prime" ));
    }

    public static Boolean isprime(int num) {
        for (int i = 2; i < num; i++)
        {
            if (num % i ==0)
            {
                return  false ;
            }
        }
        return true;
    }
}

