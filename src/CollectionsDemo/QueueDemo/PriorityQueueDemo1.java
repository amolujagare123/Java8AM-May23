package CollectionsDemo.QueueDemo;

import java.util.PriorityQueue;

public class PriorityQueueDemo1 {


    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(89);
        pq.offer(19);
        pq.offer(81);
        pq.offer(29);
        pq.offer(72);

        // 19,29,72,81,89
        System.out.println(pq);
        System.out.println(pq.poll());
       // System.out.println(pq);
        System.out.println(pq.poll());
       // System.out.println(pq);
        System.out.println(pq.poll());
       // System.out.println(pq);
        System.out.println(pq.poll());
      //  System.out.println(pq);
        System.out.println(pq.poll());
       // System.out.println(pq);

    }
}
