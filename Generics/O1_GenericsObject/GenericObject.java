package Generics.O1_GenericsObject;

public class GenericObject<T>{
    private T obj;
    public GenericObject(T obj){
        this.obj = obj;
    }

    public T getValue(){
        return obj;
    }

    public void setValue(T obj){
        this.obj = obj;
    }

}
