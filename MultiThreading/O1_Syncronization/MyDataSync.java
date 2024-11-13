package MultiThreading.O1_Syncronization;

public class MyDataSync {
//    public void display(String str){ //Prev version

//    M2-> usage of Syncronized Method
    synchronized public void display(String str){
//        M1-> usage of Syncronized block
//        synchronized (this){
            for(int i=0;i<str.length();i++) {
                System.out.println(str.charAt(i)+" "+Thread.currentThread().getName());
            }
//        }
    }
}
