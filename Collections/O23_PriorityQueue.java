package Collections;

import java.util.Comparator;
import java.util.PriorityQueue;

public class O23_PriorityQueue {
    public static void main(String[] args) {
        // Min Heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(12);
        pq.offer(22);
        pq.offer(2);
        pq.offer(32);
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq);

        // Max Heap 
        PriorityQueue<Integer> pqMaz = new PriorityQueue<>(Comparator.reverseOrder());
        pqMaz.offer(12);
        pqMaz.offer(22);
        pqMaz.offer(2);
        pqMaz.offer(32);
        System.out.println(pqMaz);
        System.out.println(pqMaz.peek());
        System.out.println(pqMaz.poll());
        System.out.println(pqMaz);

    }
}
