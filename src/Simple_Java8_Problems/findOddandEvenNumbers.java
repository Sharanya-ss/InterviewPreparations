package Simple_Java8_Problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class findOddandEvenNumbers {
	 public static void main(String[] args) {
	        List<Integer> list = Arrays.asList(1, 3, 4, 5, 6, 7, 8);

	        // Filter odd numbers
	        List<Integer> odd = list.stream()
	                                .filter(i -> i % 2 != 0)
	                                .collect(Collectors.toList());
	        odd.forEach(System.out::println);

	        // Filter even numbers
	        List<Integer> even = list.stream()
	                                 .filter(i -> i % 2 == 0)
	                                 .collect(Collectors.toList());
	        even.forEach(System.out::println);
	    }
}
