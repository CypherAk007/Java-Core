package ObjectOriented;

class MyData{
    int value;
    boolean flag=true;
    synchronized public void set(int v){
        while(flag!=true){
            try{

                wait();
            }catch(Exception e){
                System.out.println(e);
            }
        }
        value = v;

        flag=false;
        notify();

    }

    synchronized public int get(){
        while(flag!=false){
            try{

                wait();
            }catch(Exception e){
                System.out.println(e);
            }
        }
        int x = 0;
        x = value;
        flag=true;
        notify();
        return x;
    }
}

class Producer extends Thread{
    MyData data;
    public Producer(MyData d){
        data = d;
    }

    @Override
    public void run(){
        int count = 1;
        while(true){
            data.set(count);
            System.out.println("Producer "+count);
            count++;
        }
    }
}

class Consumer extends Thread{
    MyData d;
    public Consumer(MyData d){
        this.d = d;
    }

    @Override
    public void run(){
        int value = 0;
        while(true){
            value = d.get();
            System.out.println("Consumer "+value);
        }

    }
}

public class O017_InterThreadComm {
    public static void main(String[] args) {
        MyData d = new MyData();
        Producer p = new Producer(d);
        Consumer c  = new Consumer(d);
        p.start();
        c.start();
    }
}
