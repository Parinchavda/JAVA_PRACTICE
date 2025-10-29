//work on FIFO
import java.util.ArrayDeque;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue aq = new ArrayDeque();
        aq.add(20);
        aq.add(50);
        aq.add(56);
        aq.add(78);
        System.out.println(aq);
        System.out.println(" peek first element =>" + aq.peek());
        System.out.println("remove first element =>" + aq.remove());
        System.out.println(aq);
    }
}
