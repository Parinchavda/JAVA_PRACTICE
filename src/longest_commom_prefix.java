import org.w3c.dom.Node;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class longest_commom_prefix {

    public static void main(String[] args) {
        int[] arr = new int[]{2,5,3,3,53,3,3,32,22,2,2,2,2};
        Map<Integer , Integer> count = new HashMap<>();
        int max = 0 ;

        for (int i : arr) {
            if (!count.containsKey(i)) {
                count.put(i, 1);
            } else {
                count.put(i, count.get(i) + 1);
            }
        }
        System.out.println(count.entrySet());
        int ans = -1;
        for (var y : count.entrySet())
        {
            if (max < y.getValue())
            {
                max = y.getValue();
                ans = y.getKey();
            }
        }
        System.out.println(ans);
    }
}