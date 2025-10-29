import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class max_map {
    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        System.out.println("Enter array elemnets =>");
//        int no = sc.nextInt();
        int[] arr = { 1,1,2,4,5,1,6,9,4,5,6,1,6};

        Map<Integer , Integer> mp = new HashMap<>();
        for (int i : arr)
        {
            if (!mp.containsKey(i)) {
                mp.put(i , 1);
            }
            else {
                mp.put(i , mp.get(i) + 1 );
            }
        }
        System.out.println(mp);
        int max = 0 ;
        int anskey = -1;

//        for (var j : mp.keySet())
//        {
//            if (mp.get(j)> max)
//            {
//                max = mp.get(j);
//                anskey=j;
//            }
//        }
        for (var j : mp.entrySet())
        {
            if (j.getValue() > max)
            {
                max = j.getValue();
                anskey = j.getKey();
            }
        }
        System.out.println(anskey +" have max frequency and that occurs " + max + " times");
    }
}
