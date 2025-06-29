package Java8Interview_questions;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatedAndNonRepeatedChar {
	public static void main(String[] args) {
        String input = "Hello World".replace(" ", "");
        List<String> chars = Arrays.asList(input.split(""));

        Map<String, Long> freqMap = chars.stream()
            .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        System.out.println("Frequency Map: " + freqMap);

        // First repeated character
        freqMap.entrySet().stream()
            .filter(entry -> entry.getValue() > 1)
            .findFirst()
            .ifPresent(e -> System.out.println("First repeated character: " + e.getKey()));

        // First non-repeated character
        freqMap.entrySet().stream()
            .filter(entry -> entry.getValue() == 1)
            .findFirst()
            .ifPresent(e -> System.out.println("First non-repeated character: " + e.getKey()));
    }
}
