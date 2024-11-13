package MultiThreading.O5_AdderSubtractorSyncMethod;

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

    public synchronized void incrementValue(int value){
        this.counter+=value;
    }

    public synchronized void decrementValue(int value){
        this.counter-=value;
    }
}
