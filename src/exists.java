import java.util.ArrayList;
import java.util.Scanner;

public class exists {
    public static void main(String[] args) {

        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        System.out.print(l);
        Scanner sc =new Scanner(System.in);
        int no = sc.nextInt();

            if (l.contains(no)) {  //exicestance of element  check
                System.out.println("number is in the list");
            } else {
                System.out.println("number is not in list");
            }
        }
    }

