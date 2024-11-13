package MultiThreading.O0_NumberPrinter;

public class NumberPrinter implements Runnable{
    private int n;
    public NumberPrinter(int n){
        this.n = n;
    }

    @Override
    public void run(){
        System.out.println(n+" On Thread : "+ Thread.currentThread().getName());
        try{
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
