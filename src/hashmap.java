import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        Map<Integer , Integer> mp = new HashMap<>();
        mp.put(1 , 10);
        mp.put(2 , 20);
        mp.put(3 , 30);
        mp.put(4, 40);
        mp.put(5 , 50);
        System.out.println(mp);

        mp.remove(1);
        System.out.println(mp);

        mp.putIfAbsent(6,60);
        System.out.println(mp);

        System.out.println(mp.containsValue(60));
        System.out.println(mp.containsValue(70));
        System.out.println(mp.entrySet());
        System.out.println(mp.keySet());
        System.out.println(mp.values());
    }
}
