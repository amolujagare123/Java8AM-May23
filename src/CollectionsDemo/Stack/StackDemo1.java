package CollectionsDemo.Stack;

import java.util.Stack;

public class StackDemo1 {

    public static void main(String[] args) {

        Stack<Integer> s = new Stack();

        System.out.println(s.empty()); // true

        s.push(12);
        s.push(32);
        s.push(13);
        s.push(42);
        s.push(14);

        System.out.println(s.empty()); // false
        System.out.println(s);
       /* System.out.println(s.pop());
        System.out.println(s);*/

        System.out.println(s.peek());
        System.out.println(s);

    }
}
