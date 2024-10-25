package MultiThreading.O5_AdderSubtractorLocks;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    private AtomicInteger counter;
    public Counter(AtomicInteger counter){
        this.counter = counter;
    }
    public AtomicInteger getValue(){
        return this.counter;
    }

    public void setValue(AtomicInteger value){
        this.counter=value;
    }
}
