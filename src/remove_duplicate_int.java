import java.util.ArrayList;

public class remove_duplicate_int {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(6);
        list.add(5);
        list.add(5);

        System.out.println("Original ArrayList: " + list);

        // Remove duplicates using nested loop
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);  // remove duplicate
                }
            }
        }
        System.out.println("After removing duplicates: " + list);
    }
}
