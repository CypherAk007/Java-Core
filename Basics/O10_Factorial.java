package Basics;

public class O10_Factorial {

    static int fact(int n){
        if (n<=1){
            return n ;

        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        int n = 5,out;
        out = fact(n);
        System.out.println(out);
    }
}
