package LinkList;

import java.util.LinkedList;

public class NewOne {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(12);
        list.add(13);
        list.addFirst(123);
        list.addLast(345);
        System.out.println(list);
    }
}
