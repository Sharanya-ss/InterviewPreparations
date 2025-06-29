package Java8Interview_questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Techmahindracodeingquestion {
	public static void main(String[] args) {
        // Count frequency of integers
        List<Integer> list = Arrays.asList(5, 3, 4, 1, 3, 7, 2, 9, 9, 4);
        Map<Integer, Long> m = list.stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        m.entrySet().stream()
            .forEach(e -> System.out.println(e.getKey() + "-" + e.getValue()));

        // Count frequency of strings
        List<String> Slist = Arrays.asList("Antony", "Priyanka", "Priyanka", "Priyanka", "Antony", "krishna", "Virtusa");
        Map<String, Long> ms = Slist.stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        ms.entrySet().stream()
            .forEach(e -> System.out.println(e.getKey() + "-" + e.getValue()));
    }
}
