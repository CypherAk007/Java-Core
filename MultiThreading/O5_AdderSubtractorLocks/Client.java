package MultiThreading.O5_AdderSubtractorLocks;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        Counter counter = new Counter(atomicInteger);

        Lock lock = new ReentrantLock();

        Adder adder = new Adder(counter,lock);
        Subtractor subtractor = new Subtractor(counter,lock);

        Thread adderThread = new Thread(adder);
        Thread subtractorThread = new Thread(subtractor);

        adderThread.start();
        subtractorThread.start();

        adderThread.join();
        subtractorThread.join();

        System.out.println("Counter value is: "+counter.getValue());
    }
}
