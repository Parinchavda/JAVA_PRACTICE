//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class coll {
    public coll() {
    }

    public static void main(String[] args) {
        ArrayList<Integer> ls = new ArrayList();
        ls.add(0, 1);
        ls.add(1, 4);
        ls.add(2, 4);
        System.out.println(ls);
        List linkedList = new LinkedList();
        linkedList.add(0, 10);
        linkedList.add(1, 20);
        System.out.println(linkedList);
        Vector<String> vector = new Vector();
        vector.add("Parin");
        vector.add("arin");
        System.out.println(vector);
        Stack<Integer> stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
