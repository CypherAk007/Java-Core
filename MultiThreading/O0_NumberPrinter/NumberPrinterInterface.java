package MultiThreading.O0_NumberPrinter;

public class NumberPrinterInterface implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hello From NumberPrinter : "+i);
        }
    }
}
