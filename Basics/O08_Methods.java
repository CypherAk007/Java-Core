package Basics;

public class O08_Methods {
     static int max(int x,int y){
        if (x>y){
            return x ;

        }else{
            return y;
        }
    }

    static void update(int arr[]){
        arr[0] = 100;
    }
    public static void main(String[] args) {
        int a=10,b=15,c;
        c = max(a,b);
        System.out.println(c);

        // Passing objects BY REFERENCE 

        int arr[] = {1,2,3,4,5};
        update(arr);
        System.out.println(arr[0]);

    }
}
