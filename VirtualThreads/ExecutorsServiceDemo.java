package VirtualThreads;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;


class Task implements Runnable{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}
// Write above and assign to Runnable interface  using Lambda expression
// ()-> System.out.println(Thread.currentThread().getName());


public class ExecutorsServiceDemo {
    public static void main(String[] args) {
        // // newSingleThreadExecutor -> creates only one thread 
        // Executor e = Executors.newSingleThreadExecutor();
        // for(int i=0;i<5;i++){
        //     e.execute(new Task());
        // }
        // // op -> 
        // // pool-1-thread-1
        // // pool-1-thread-1
        // // pool-1-thread-1
        // // pool-1-thread-1
        // // pool-1-thread-1

        // Executor e = Executors.newFixedThreadPool(3);
        // // Lambda expression 
        // Runnable r = ()-> System.out.println(Thread.currentThread().getName());
        // for(int i=0;i<5;i++){
        //     // e.execute(new Task());

        //     e.execute(r);
        // }

        // Above method does not return response as run method return void 
        Executor e = Executors.newFixedThreadPool(3);
        // // Lambda expression 
        Runnable r = ()-> System.out.println(Thread.currentThread().getName());
        // e.submit();

    }
}
