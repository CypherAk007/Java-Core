package Generics.O1_GenericsArray;

public class GenericArray<T> {
//    T arr[] = new T[10];  // not possibe as it should be Type object and typecasted to T
    T[] arr = (T[])new Object[10];
    int idx = 0;
    public void append(T val){
        arr[idx] = val;
        idx++;
    }
    public void display(){
        for(int i=0;i<10;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
