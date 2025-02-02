package LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListCLF {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.addFirst(90);
        list.addFirst(34);
        list.addLast(43);
        list.addLast(2342);
        list.addLast(123);
        list.addFirst(78);
        list.addLast(876);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
        list.add(3,56);
        System.out.println(list.remove(5));
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list.reversed());
        System.out.println(list);
    }
}
