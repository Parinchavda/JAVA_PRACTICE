import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class convert_array {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1,200,3,0,33,73,53,333};
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(arr));
        System.out.println(arr2);
    }
}
