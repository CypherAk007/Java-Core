package MultiThreading.O1_Syncronization;

public class MyThread1Sync extends Thread{
    private MyDataSync myData;
    public MyThread1Sync(MyDataSync myData){
        this.myData = myData;
    }
    @Override
    public void run(){
        myData.display("HelloWorld");
    }
}
