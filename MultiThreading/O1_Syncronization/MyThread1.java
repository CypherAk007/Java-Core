package MultiThreading.O1_Syncronization;

public class MyThread1 extends Thread{
    private MyData myData;
    public MyThread1(MyData myData){
        this.myData = myData;
    }
    @Override
    public void run(){
        myData.display("HelloWorld");
    }
}
