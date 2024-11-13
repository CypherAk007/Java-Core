package MultiThreading.O5_AdderSubtractorSyncMethod;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter(0);


        Adder adder = new Adder(counter);
        Subtractor subtractor = new Subtractor(counter);

        Thread adderThread = new Thread(adder);
        Thread subtractorThread = new Thread(subtractor);

        adderThread.start();
        subtractorThread.start();

        adderThread.join();
        subtractorThread.join();

        System.out.println("Counter value is: "+counter.getValue());
    }
}
