package MultiThreading.O0_NumberPrinter;

public class NumberPrinterThread extends Thread{
    @Override
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hello From NumberPrinter : "+i);
        }
    }
}
