package comcast;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {
	public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve", "Frank","vergin","vergin");

        Map<Object, List<String>> groupedByFirstLetter = names.stream()
                .collect(Collectors.groupingBy(name -> {if((name).startsWith("A")) {
                	return "A";
                }else {
                	return "others";
                }
                }
                		));

        groupedByFirstLetter.forEach((key, value) -> 
            System.out.println(key + ": " + value));
    }
}
