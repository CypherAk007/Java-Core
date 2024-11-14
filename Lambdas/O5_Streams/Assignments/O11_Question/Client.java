package Lambdas.O5_Streams.Assignments.O11_Question;

import java.util.List;

public class Client {
    public static void main(String[] args) {
//        Given a list of numbers, find the maximum number in the list.
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int maxi = numbers.
                stream().
//                reduce(Integer.MIN_VALUE,(a,b)->Math.max(a,b));
                reduce(Integer.MIN_VALUE,Math::max);


        System.out.println(maxi);
    }
}
