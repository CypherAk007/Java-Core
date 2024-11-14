package Lambdas.O5_Streams.Assignments.O9_Question;

import java.util.List;

public class Client {
    public static void main(String[] args) {
//        For a list of integers, find the sum of the squares of all the numbers.
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sum = numbers.stream()
                .map(Client::squareFnc)
                .reduce(0,(accumalator,currentNumber)-> accumalator+currentNumber);

        System.out.println(sum);
    }

    public static int squareFnc(int n){
        return n*n;
    }

    public static int sumFnc(int a, int b) {
            return a + b;
        }
}
