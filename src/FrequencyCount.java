import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(5);
        arr.add(7);
        arr.add(7);
        arr.add(8);
        arr.add(8);
        arr.add(8);

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.size(); i++) {
            int count = 1; // reset count for each element

            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i).equals(arr.get(j))) {
                    count++;
                    arr.remove(j); //  remove duplicate so it won’t be counted again
                    j--;           // adjust index after removal
                }
            }

            map.put(arr.get(i), count);
        }

        System.out.println(map);
    }
}
