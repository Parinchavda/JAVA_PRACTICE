import java.util.*;

public class odd_even_arrangement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size =>");
        int no = sc.nextInt();
        int[] arr = new int[no];

        System.out.println("Enter array elements =>");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> oddList = new ArrayList<>();
        ArrayList<Integer> evenList = new ArrayList<>();

        for (int num : arr) {
            if (num % 2 == 0) {
                evenList.add(num);
            } else {
                oddList.add(num);
            }
        }

        ArrayList<Integer> mergedList = new ArrayList<>();
        mergedList.addAll(oddList);
        mergedList.addAll(evenList);

        int max = mergedList.get(0);
        int index = 0;
        for (int i = 1; i < mergedList.size(); i++) {
            if (mergedList.get(i) > max) {
                max = mergedList.get(i);
                index = i;
            }
        }
        int res = (int) Math.pow(max , 2);
        mergedList.set(index , res);

        for (int num : mergedList) {
            System.out.print(num + " ");
        }
    }
}
