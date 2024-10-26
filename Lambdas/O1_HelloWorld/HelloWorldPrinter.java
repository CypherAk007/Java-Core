package Lambdas.O1_HelloWorld;

public class HelloWorldPrinter implements Runnable{

    @Override
    public void run(){
        System.out.println("Hello World!! "+Thread.currentThread().getName());
    }
}
