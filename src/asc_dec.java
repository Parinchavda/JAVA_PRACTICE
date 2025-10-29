import java.util.ArrayList;
import java.util.Collections;

import static java.util.Collections.reverseOrder;

public class asc_dec {
    public static void main(String[] args) {
        ArrayList<Integer> l1=  new ArrayList<>();
        l1.add(5);
        l1.add(2);
        l1.add(6);
        l1.add(8);
        l1.add(1);

        System.out.println("original array" + l1);

        Collections.sort(l1);//ascending order
        System.out.println("sorted array" + l1);

        Collections.sort(l1 , Collections.reverseOrder());//decending order
        System.out.println("sorted array" + l1);




    }
}
