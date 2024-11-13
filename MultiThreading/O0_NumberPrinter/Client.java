package MultiThreading.O0_NumberPrinter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
//        PS: Q1. -> This illustrates it runs on seprate thread

//        EXTENDING Thread Class
//        NumberPrinterThread npt = new NumberPrinterThread();
//        npt.start();

//        Using Executor Service
//        ExecutorService executorService = Executors.newCachedThreadPool();
//        executorService.submit(npt);
//        executorService.shutdown();


////        IMPLEMENTING Runnable Interface
//        NumberPrinterInterface np = new NumberPrinterInterface();
//        Thread t1 = new Thread(np);
//        t1.start();
//
////        Using Executor Service
//        ExecutorService executorService = Executors.newCachedThreadPool();
//        executorService.submit(np);
//        executorService.shutdown();

//        System.out.println("Hello world From Main Class");


//        PS:Q2. -> EACH NUMBER IS PRINTED ON SEPRATE THREAD

        ExecutorService executorService = Executors.newCachedThreadPool();
        int n = 100;
        for(int i=0;i<n;i++){
            executorService.submit(new NumberPrinter(i));
        }
        executorService.shutdown();
        System.out.println("Hello world From Main Class");


    }
}
