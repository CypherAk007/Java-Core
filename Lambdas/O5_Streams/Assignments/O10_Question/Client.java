package Lambdas.O5_Streams.Assignments.O10_Question;

import java.util.List;

public class Client {
    public static void main(String[] args) {
//        For a list of integers, find the sum of the squares of all the even numbers.
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sum = numbers.stream()
                .filter(Client::evenFnc)
                .map(Client::squareFnc)
//                .reduce(0,(acc,curNum)->acc+curNum);
                .reduce(0, Integer::sum);

        System.out.println(sum);
    }

    public static int squareFnc(int n){
        return n*n;
    }

    public static boolean evenFnc(int n){
        return n%2==0;
    }
}
