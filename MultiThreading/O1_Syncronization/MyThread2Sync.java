package MultiThreading.O1_Syncronization;

public class MyThread2Sync extends Thread{
    private MyDataSync myData;
    public MyThread2Sync(MyDataSync myData){
        this.myData = myData;
    }
    @Override
    public void run(){
        myData.display("Welcome");
    }
}
