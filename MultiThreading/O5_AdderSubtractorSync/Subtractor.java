package MultiThreading.O5_AdderSubtractorSync;

public class Subtractor implements Runnable{
    private Counter counter;

    public Subtractor(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run(){
        for(int i=1;i<=100000;i++){
            synchronized (counter) {
                counter.setValue(counter.getValue() - i);
            }
        }
    }

}
