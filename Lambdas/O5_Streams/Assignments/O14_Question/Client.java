package Lambdas.O5_Streams.Assignments.O14_Question;

import java.util.List;
import java.util.OptionalDouble;

public class Client {
    public static void main(String[] args) {
//        Give a list of strings, find the average length of all the strings.
        List<String> names = List.of("Tantia Tope", "Rani Lakshmibai", "Mangal Pandey", "Nana Sahib");

        double avg = names.stream()
                .map(String::length)
                .mapToInt(Integer::intValue)
                .average()
                        .orElse(0);

        System.out.println(avg);
    }
}
