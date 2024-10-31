package Collections.O32_CustomQueue;

public class QueueMain {
    public static void main(String[] args) throws Exception{
        DynamicQueue queue = new DynamicQueue(5);
        queue.insert(2);
        queue.insert(2);
        queue.insert(4);
        queue.insert(4);
        queue.insert(4);
        queue.insert(4);
        queue.insert(5);
        queue.insert(6);
        System.out.println(queue.insert(6));
//
////        These dont get inserted as queue is full
//        queue.insert(6);
//        queue.insert(6);
//        System.out.println(queue.remove());

        queue.display();
    }
}
