package CollectionsDemo.QueueDemo;

import java.util.ArrayDeque;

public class ArrayDequeueDemo {

    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(89);
        adq.offer(19);
        adq.offer(81);
        adq.offer(29);
        adq.offer(72);

        System.out.println(adq);

        adq.offerFirst(0);
        adq.offerLast(1000);
        System.out.println(adq);

        adq.removeFirst();
        adq.removeLast();

        System.out.println(adq);
    }
}
