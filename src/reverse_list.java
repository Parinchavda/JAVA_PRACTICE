//revers array using list;
import java.util.ArrayList;

public class reverse_list {
    public static void reverse(ArrayList<Integer> list){
        int i=0;
        int j =list.size()-1;
        while (i<j)
        {
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i ,list.get(j));
            list.set(j , temp);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println("original list"+ list);
        reverse(list);
        System.out.println("reversed list" +  list);
//        for (int i=list.size()-1;i>=0;i--)
//        {
//            System.out.print(list.get(i));
//        }

    }
}
