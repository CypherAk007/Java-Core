package MultiThreading;
import java.util.Date;


public class O2_NumberPrinter implements Runnable{
    private int number;
    public O2_NumberPrinter(int number){
        this.number = number;
    }

    @Override
    public void run(){
        System.out.println(new Date() +" Number is :"+number+" : "+Thread.currentThread());
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
