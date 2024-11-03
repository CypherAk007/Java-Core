package Lambdas.O5_Streams.Assignments.O8_Question;

import java.util.List;

public class Client {
    public static void main(String[] args) {
//        For a list of integers, find the sum of all the numbers.
//        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        question8();
    }

    private static void question8(){
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        int sum = 0;
//        for(Integer num:numbers){
//            sum+=num;
//        }
//        System.out.println(sum);

//        Do using streams & Reduce function
//        What is Identity?
//        number <operation> <identity>  = number
//        5 * ? = 5
//        ans: 5* 1 = 5 // 1-> is identity here
//        5 + 0 = 5
//        Lambda -> accumalator(Intermidatory container) , current number( that is being processed )

        Integer sumValue = numbers.stream()
//                .reduce(0,(accumulator,currentNumber)-> accumulator+currentNumber);
                .reduce(0,Integer::sum); //above can be replaced with Integer.sum
//        As sum takes two integer values and returns integer after sum
//        public static int sum(int a, int b) {
//            return a + b;
//        }

        System.out.println(sumValue);


    }


}
