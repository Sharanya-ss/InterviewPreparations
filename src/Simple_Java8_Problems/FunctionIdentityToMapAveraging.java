package Simple_Java8_Problems;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionIdentityToMapAveraging {
	public static void main(String[] args) {
        // Sample data with duplicates
        List<Integer> numbers = List.of(1, 2, 3, 2, 4, 4, 4, 5, 5, 5);

        // Group identical numbers into a Map<Integer, List<Integer>>
        Map<Integer, List<Integer>> grouped = numbers.stream()
            .collect(Collectors.groupingBy(Function.identity()));

        // Calculate the average frequency of each group
        Map<Integer, Double> result = grouped.entrySet().stream()
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                e -> e.getValue().stream()
                      .collect(Collectors.averagingDouble(Integer::doubleValue))
            ));

        System.out.println(result);
    }
}
