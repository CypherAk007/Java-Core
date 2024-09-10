package Collections;

import java.util.ArrayDeque;

public class O24_Deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.offerFirst(1); // insert at head
        ad.offerLast(2); // ~ insert at tail ad.offer
        ad.offer(3);
        System.out.println(ad);

        System.out.println(ad.peek());
        System.out.println(ad.peekFirst());
        System.out.println(ad.peekLast());

        System.out.println(ad.pollFirst());
        System.out.println(ad.pollLast());
        System.out.println(ad);
        System.out.println(ad.poll());

    }
}
