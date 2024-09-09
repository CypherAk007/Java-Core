package ObjectOriented;

class GenericMethod<T>{
    public T data;
    public void setData(T data){
        this.data = data ;
    }
    public T getData(){
        return this.data;
    }
}

public class O019_Generics {
    public static void main(String[] args) {
        GenericMethod<String> gm = new GenericMethod<>();
        gm.setData("Abhishek");
        System.out.println(gm.getData());
    }
}
