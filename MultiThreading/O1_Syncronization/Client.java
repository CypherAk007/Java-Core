package MultiThreading.O1_Syncronization;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) {
//        PS: we have to print 2 threads where each thread should
//                use MyData and print the letters of string passed fm
//                thread method we have to finish printing of thread one and
//        then print thread 2 or vice - print completly dont overlap t1 and t2

//        M1-> This overlaps the t1 and t2 letters

//        MyData md = new MyData();
//        MyThread1 t1 = new MyThread1(md);
//        MyThread2 t2 = new MyThread2(md);
//        t1.start();
//        t2.start();
//        -------------------------------------------

////        M2-> Used locks and solved the problem
////                only one thread should use the display at a time
//        Lock lock = new ReentrantLock();
//        MyData md = new MyData();
//        MyThread1Lock t3 = new MyThread1Lock(md,lock);
//        MyThread2Lock t4 = new MyThread2Lock(md,lock);
//        t3.start();
//        t4.start();
//        ---------------------------------------

        //        M3-> using Synchronized block and Method
        MyDataSync mds = new MyDataSync();
        MyThread1Sync t1 = new MyThread1Sync(mds);
        MyThread2Sync t2 = new MyThread2Sync(mds);
        t1.start();
        t2.start();
//        -------------------------------------------

    }
}
