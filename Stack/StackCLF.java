package Stack;

import java.util.Collections;
import java.util.Stack;

public class StackCLF {
    public static void main(String[] args) {
        Stack<Integer> list = new Stack<>();
        list.push(12);
        list.push(10);
        list.push(34);
        list.push(45);
        list.push(32);
        System.out.println(list);
        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list.peek());
        System.out.println(list.size());
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list.reversed());
        System.out.println(list);
    }
}
