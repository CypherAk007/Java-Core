package MultiThreading.O1_Syncronization;

import java.util.concurrent.locks.Lock;

public class MyThread2Lock extends Thread{
    private Lock lock;
    private MyData myData;
    public MyThread2Lock(MyData myData, Lock lock){
        this.myData = myData;
        this.lock = lock;
    }

    @Override
    public void run(){
        lock.lock();
        myData.display("Welcome");
        lock.unlock();
    }


}
