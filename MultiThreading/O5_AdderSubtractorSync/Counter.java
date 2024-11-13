package MultiThreading.O5_AdderSubtractorSync;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    private int counter;
    public Counter(int counter){
        this.counter = counter;
    }
    public int getValue(){
        return this.counter;
    }

    public void setValue(int value){
         this.counter=value;
    }
}
