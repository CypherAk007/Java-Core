package MultiThreading.O1_Syncronization;

public class MyThread2 extends Thread{
    private MyData myData;
    public MyThread2(MyData myData){
        this.myData = myData;
    }
    @Override
    public void run(){
        myData.display("Welcome");
    }
}
