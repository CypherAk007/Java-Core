package Lambdas.O1_HelloWorld;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
//        Q1: HELLO WORLD PRINTER  PRINT HELLO WORLD USING THREAD

        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
//        M1 - Using thread class to execute thread
        Thread thread = new Thread(helloWorldPrinter);
        thread.start();

//        M2 - using executor service to execute thread
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(helloWorldPrinter);
        executorService.shutdown();

//        M3 - Eliminating creating seprate HelloWorldPrinter class and using anyonomus class
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World!! "+Thread.currentThread().getName());
            }
        };
        Thread thread1 = new Thread(runnable);
        thread1.start();

//        M4 - Using lambdas - Eliminating creating seprate HelloWorldPrinter class and using anyonomus class
//        NOTE: As Runnable is SAM Interfaces -> Single Abstract Method we can use lambda
        Runnable runnable1 = ()-> System.out.println("Hello World!! "+Thread.currentThread().getName());
        Thread thread2 = new Thread(runnable1);
        thread2.start();

//        M5 - Shorten the code more
        new Thread(()-> System.out.println("Hello World!! "+Thread.currentThread().getName())).start();

//        CURRENT OUTPUT
//        Hello World!! Thread-0
//        Hello World!! pool-1-thread-1
//        Hello World!! Thread-1
//        Hello World!! Thread-2
//        Hello World!! Thread-3
    }


}
