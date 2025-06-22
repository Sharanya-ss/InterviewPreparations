package comcast;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByMultipleProperties {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "kiwi", "avocado", "cherry", "pear","plov", "pear");

        Map<Integer, Map<Character, List<String>>> grouped = words.stream()
            .collect(Collectors.groupingBy(
                String::length, 
                Collectors.groupingBy(word -> word.charAt(0))
            ));
        
        System.out.println(grouped);

        grouped.forEach((length, group) -> {
            System.out.println("Length: " + length);
            group.forEach((firstChar, wordsList) -> {
                System.out.println("  First letter: " + firstChar + " -> " + wordsList);
            });
        });
    }
}
