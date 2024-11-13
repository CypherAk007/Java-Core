package Generics.O1_GenericsMethods;

public class GenericMethod {
    public <E extends Number> void print(E[] arr){
        for(E ele:arr){
            System.out.println(ele);
        }
    }
}
