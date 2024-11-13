package MultiThreading.O1_Syncronization;

public class MyData {
    public void display(String data){
        for(int i=0;i<data.length();i++){
            System.out.println(data.charAt(i)+" "+Thread.currentThread().getName());
        }
    }
}
