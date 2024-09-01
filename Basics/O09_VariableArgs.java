package Basics;

public class O09_VariableArgs {
    static void show(int ...x){
        for(int i=0;i<x.length;i++){
            System.out.println(x[i]);
        }
    }
    public static void main(String[] args) {
        show();
        show(10,20,30);
        show(new int[]{200,400,600});
    }
}
