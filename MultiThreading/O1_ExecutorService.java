package MultiThreading;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class O1_ExecutorService {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for(int i=1;i<100;i++){
            O2_NumberPrinter numberPrinter = new O2_NumberPrinter(i);
            
            // Thread t1 = new Thread(numberPrinter);
            // t1.start();

            executorService.submit(numberPrinter);

        }
        executorService.shutdown();
    }
}
