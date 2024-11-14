package Lambdas.O5_Streams.Assignments.O6_Question;

import java.util.Comparator;
import java.util.List;

public class Client {
    public static void main(String[] args) {
//        Question :For a list of strings, filter out the strings which do not start with the letter T and then uppercase the remaining strings.

        List<String> names = List.of("Tantia Tope", "Rani Lakshmibai", "Mangal Pandey", "Nana Sahib");

        List<String> parsedNames = names.stream()
                .filter(Client::parser)
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .toList();

        parsedNames.stream()
                .forEach(System.out::println);

    }

    private static boolean parser(String name){
        return !name.startsWith("T");
    }
}
