package Lambdas.O5_Streams.Assignments.O2_Question;

import java.util.List;

public class Client {
    public static void main(String[] args) {
//        Find below a list of integers. Iterate over it and print every even number.
        question2();
    }
    private static void question2(){
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream()
//                .filter(num->num%2==0)
                .filter(Client::isEven)
                .forEach(System.out::println);


    }
    private static boolean isEven(int num){
        return num%2==0;
    }
}
