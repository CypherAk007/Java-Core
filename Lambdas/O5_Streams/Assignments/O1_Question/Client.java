package Lambdas.O5_Streams.Assignments.O1_Question;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        question1();

        Client client = new Client();
        client.question1Obj();



    }
    private static void question1(){
//        Find below a list of integers. Iterate over it and print the square of each number.
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

//        M1-> regular
//        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        for(int i=0;i<numbers.size();i++){
//            int square = numbers.get(i)*numbers.get(i);
//            System.out.print(square + " ");
//        }
//        System.out.println();

//        M2-> using streams
        numbers.stream()
                .forEach(integer -> System.out.print(integer*integer+" "));
        System.out.println();
//        BUT IF WE ARE CREATING READABLE CODE THEN WE WOULD HAVE CREATED square function ->M3
//        we use map which uses functional interface
        numbers.stream()
                .map(number ->number*number)
                .forEach(System.out::println);

//        M3->BUT IF WE ARE CREATING READABLE CODE THEN WE WOULD HAVE CREATED square function
        numbers.stream()
                .map(Client::squareClass)
                .forEach(System.out::println);



    }

    private void question1Obj(){
        //        Find below a list of integers. Iterate over it and print the square of each number.
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        M3->BUT IF WE ARE CREATING READABLE CODE THEN WE WOULD HAVE CREATED square function
//        WITHOUT USING STATIC
        numbers.stream()
                .map(this::squareObj)
                .forEach(System.out::println);
    }


    private static int squareClass(int num){
            return num*num;
    }
    private int squareObj(int num){
            return num*num;
    }

}
