package MultiThreading.O4_producerConsumerSemaphores;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    private String name;
    private Queue<Shirt> store;

    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;
    public Producer(String name, Queue<Shirt> store,  Semaphore producerSemaphore, Semaphore consumerSemaphore){
        this.name = name;
        this.store = store;

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
//            if(store.size()<maxSizeOfStore){
                System.out.println("Producer "+name+" is Producing. Current Store size is "+store.size());
                store.add(new Shirt());
//            }
            consumerSemaphore.release();
        }
    }
}
