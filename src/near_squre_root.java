import java.util.Scanner;

public class near_squre_root {
    static int checksqrt(int x)
    {
        long start = 0 ;
        long end = x;
        long ans = -1 ;

        while (start <= end)
        {
            long mid = start + (end - start) / 2 ;
            long value = mid * mid ;
            if (x == value)
            {
                return (int) mid;
            } else if (value > x )
            {
            end = mid -1 ;
            }
            else {
                ans = mid ;
                start = mid + 1;
            }
        }
        return (int) ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter one number");
        long no = sc.nextInt();
        System.out.printf("%d squreroot is %d\n" , no ,  checksqrt((int) no));

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter one number");
//        int no = sc.nextInt();
//        System.out.println((int) Math.sqrt(no));
    }
}
