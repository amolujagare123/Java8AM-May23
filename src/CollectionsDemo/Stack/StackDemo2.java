package CollectionsDemo.Stack;

import java.util.Stack;

public class StackDemo2 {

    public static void main(String[] args) {

        Stack<Integer> s = new Stack();

        s.push(12);
        s.push(32);
        s.push(13);
        s.push(42);
        s.push(14);

        System.out.println(s);

        System.out.println(s.search(56));
        System.out.println(s.search(32));


    }
}
