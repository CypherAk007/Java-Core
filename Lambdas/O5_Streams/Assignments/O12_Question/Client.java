package Lambdas.O5_Streams.Assignments.O12_Question;

import java.util.List;

public class Client {
    public static void main(String[] args) {
//        Given a list of numbers with duplicates, find the distinct numbers in the list.
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5);

        List<Integer> disNum = numbers.stream()
                .distinct()
                .toList();

        System.out.println(disNum);
    }
}
