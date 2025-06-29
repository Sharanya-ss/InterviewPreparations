package Simple_Java8_Problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartsWith {
	public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 22, 33, 333, 234, 245);

        List<Integer> numList = list.stream()
            .map(String::valueOf)              // Convert each integer to string
            .filter(i -> i.startsWith("2"))    // Keep those that start with '2'
            .map(Integer::valueOf)             // Convert them back to integers
            .collect(Collectors.toList());

        System.out.println(numList);
    }
}
