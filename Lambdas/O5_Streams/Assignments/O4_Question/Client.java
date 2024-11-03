package Lambdas.O5_Streams.Assignments.O4_Question;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) {
//        For a list of integers, return a list of the squares of each number.
//                List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        question4();
    }

    private static void question4(){
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

//        Stream<Integer> squares = numbers.stream()
//                .map(Client::square);
////        This TERMINAL OPERATION IS REQUIRED FOR EXECUTION OF STREAM
//        squares.forEach(System.out::println);
//        System.out.println(squares);

        List<Integer> squares = numbers.stream()
                .map(Client::square)
                .collect(Collectors.toList()); // used to collect the data

        System.out.println(squares);

    }

    private static int square(int num){
        System.out.println("Square function called ");
        return num*num;
    }
}
