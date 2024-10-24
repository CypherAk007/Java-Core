package MultiThreading.O4_producerConsumerSemaphores;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    private String name;
    private Queue<Shirt> store;
    private int maxSizeOfStore;
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;
    public Producer(String name, Queue<Shirt> store, int maxSizeOfStore, Semaphore producerSemaphore, Semaphore consumerSemaphore){
        this.name = name;
        this.store = store;
        this.maxSizeOfStore = maxSizeOfStore;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }

    @Override
    public void run(){
        while (true){

            try {
                producerSemaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(store.size()<maxSizeOfStore){
                System.out.println("Producer "+name+" is Producing. Current Store size is "+store.size());
                store.add(new Shirt());
            }
            consumerSemaphore.release();
        }
    }
}
