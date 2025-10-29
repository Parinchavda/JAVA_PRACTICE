import java.util.ArrayList;

public class Check_same {
    public static void main(String[] args) {
        ArrayList li = new ArrayList();
        li.add(45);
        li.add(4);
        li.add(50);
        li.add(57);
        li.add(58);

        ArrayList l2 = new ArrayList();
        l2.add(43);
        l2.add(4);
        l2.add(50);
        l2.add(52);
        l2.add(60);

        ArrayList common = new ArrayList<>();
        for (int i = 0; i < li.size(); i++)
        {
            for (int j = 0; j < l2.size(); j++)
            {
                if (li.get(i) == l2.get(j))
                {
                    common.add(li.get(i));
                }
            }
        }
            System.out.println(common);
        }
    }

