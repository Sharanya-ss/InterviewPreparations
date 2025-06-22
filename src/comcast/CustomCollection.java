package comcast;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class CustomCollection {
           public static void main(String[] args) {
        	   List<String> names = Arrays.asList("Alice","Alice", "Bob", "Anna", "Brian");
        	   TreeMap<Character, Set<String>> groupedBySet = names.stream()
        		        .collect(Collectors.groupingBy(name -> name.charAt(0),TreeMap::new, Collectors.toSet()));

        		System.out.println(groupedBySet);
		}
}
