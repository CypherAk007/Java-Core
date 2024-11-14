package Lambdas.O5_Streams.Assignments.O5_Question;

import java.util.List;
import java.util.stream.Collectors;

public class Client {
    public static void main(String[] args) {
//        Question: For a list of strings, return a list of the length of each string.
//        List<String> names = List.of("Tantia Tope", "Rani Lakshmibai", "Mangal Pandey", "Nana Sahib");

        List<String> names = List.of("Tantia Tope", "Rani Lakshmibai", "Mangal Pandey", "Nana Sahib");
        List<Integer> nameLen = names.stream()
                .map(String::length)
                .collect(Collectors.toList());

        nameLen.stream()
                .forEach(System.out::println);
    }
}
