package CollectionsDemo.LinkedListDemo;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<>();

        ll.add("amol");
        ll.add("Ashish");
        ll.add("amol");
        ll.add("Jicky");
        ll.add("Kavita");
        ll.add("Nutesh");
        System.out.println(ll);

        ll.addFirst("first");
        ll.addLast("last");

        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);
    }
}
