package Lambdas.O5_Streams;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1,2,3,4,5,6,7,8,9,10);
//        for(int i=0;i<integers.size();i++){
////            Do Somthing
//        }

//        for(Integer number:integers){
////            Do Somthing
//
//            List<Integer> squares = List.of(1,4,9);
//            for( Integer square:squares){
////                Do Somthing
//            }
//        }





//        Do operation using stream api
//        we have passed lambda in for each
        integers.stream()
                .forEach(integer -> System.out.println(integer));

//        Simplifing the lambda
        integers.stream()
                .forEach(System.out::println);

        System.out.println("-----------------------");

//        DOING THE ABOVE USING CUSTOM PRINT FUNCTION
        //        Do operation using stream api
//        we have passed lambda in for each
        integers.stream()
                .forEach(integer -> print(integer));

//        Simplifing the lambda
        integers.stream()
                .forEach(Client::print);

    }

//    CUSTOM PRINT FUNCTION
//    Also a CONSUMER IN INBUILT FNC INTERFACE WHICH TAKES ARG AND RETURN VOID
    private static <T> void print(T object){
        System.out.println(object);
    }
}
