package MultiThreading.O5_AdderSubtractorSyncMethod;

public class Subtractor implements Runnable{
    private Counter counter;

    public Subtractor(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run(){
        for(int i=1;i<=100000;i++){
            //            Replacing synchronized block with method
//            synchronized (counter) {
//                counter.setValue(counter.getValue() - i);
//            }
            counter.decrementValue(i);
        }
    }

}
