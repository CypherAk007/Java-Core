package MultiThreading.O1_Syncronization;

import java.util.concurrent.locks.Lock;

public class MyThread1Lock extends Thread{
    private Lock lock;
    private MyData myData;
    public MyThread1Lock(MyData myData, Lock lock){
        this.myData = myData;
        this.lock = lock;
    }

    @Override
    public void run(){
        lock.lock();
        myData.display("HelloWorld");
        lock.unlock();
    }
}
