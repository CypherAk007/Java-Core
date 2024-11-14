package Lambdas.O5_Streams.Assignments.O13_Question;

import java.util.List;

public class Client {
    public static void main(String[] args) {
//        Given a list of numbers, find the average of all the numbers.
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        double num = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);

        System.out.println(num);

    }
}
