package Lambdas.O5_Streams.Assignments.O15_Question;

import java.util.List;

public class Client {
    public static void main(String[] args) {

//        Given a list of strings, find the first string that is longer than 10 characters.
        List<String> names = List.of("Tan", "Rani Lakshmibai", "Mangal Pandey", "Nana Sahib");
        List<String> parsedNames = names.stream()
                .filter((name)->name.length()>10)
                .toList();

        System.out.println(names);
        System.out.println(parsedNames);


//        Find the first String > 10
        String first = names.stream()
                .filter((name)->name.length()>10)
                .findFirst()
                .orElse("No String Found");

        System.out.println(first);
    }
}
