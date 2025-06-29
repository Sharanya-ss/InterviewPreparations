package Simple_Java8_Problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumbersinArray {
	public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 4, 5, 6, 7, 8, 1, 3, 5, 5, 7);

        // Method 1: Using Collections.frequency
        Set<Integer> duplicates = list.stream()
            .filter(e -> Collections.frequency(list, e) > 1)
            .collect(Collectors.toSet());

        // Method 2: Using HashSet add() return value
        HashSet<Integer> seen = new HashSet<>();
        Set<Integer> duplicates2 = list.stream()
            .filter(i -> !seen.add(i))
            .collect(Collectors.toSet());

        System.out.println(duplicates);
    }
}
