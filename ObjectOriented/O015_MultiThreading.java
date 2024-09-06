package ObjectOriented;

class MyThread extends Thread{
    @Override
    public void run(){
        int i = 1;
        while(true){
            System.out.println(i+"Hello");
            i++;
        }
    }
}

class MyRunnableThread implements Runnable{
    @Override
    public void run(){
        int i = 1;
        while(true){
            System.out.println(i+"Hello");
            i++;
        }
    }
}

 
public class O015_MultiThreading {
    public static void main(String[] args) {
        // extending Thread class 
        // MyThread t = new MyThread();
        // t.start();

        // Implements Runnable Interface
        MyRunnableThread m = new MyRunnableThread();
        Thread t = new Thread(m);
        t.start();
        int i=1;
        while(true){
            System.out.println(i+"World");
            i++;
        }
    }
}
