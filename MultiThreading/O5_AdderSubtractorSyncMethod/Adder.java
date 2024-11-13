package MultiThreading.O5_AdderSubtractorSyncMethod;

public class Adder implements Runnable{
    private Counter counter;

    public Adder(Counter counter){
        this.counter = counter;

    }

    @Override
    public void run(){
        for(int i=1;i<=100000;i++){
//            Replacing synchronized block with method
//            synchronized (counter) {
//                counter.setValue(counter.getValue() + i);
//            }
            counter.incrementValue(i);
        }
    }

}
