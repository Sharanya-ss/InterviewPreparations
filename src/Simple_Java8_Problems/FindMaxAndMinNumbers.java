package Simple_Java8_Problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FindMaxAndMinNumbers {
	public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 1, 2, 3, 4, 5, 6);
        System.out.println(list);

        // Approach 1: Sorting for min and max
        int min = list.stream().sorted().findFirst().get();
        System.out.println(min);

        int max1 = list.stream().sorted(Collections.reverseOrder()).findFirst().get();
        System.out.println(max1);

        int max2 = list.stream().sorted((a, b) -> a < b ? 1 : a > b ? -1 : 0).findFirst().get();
        System.out.println(max2);

        System.out.println("\n***********************************************\n");

        // Approach 2: Using Comparators directly
        int minComparator = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(minComparator);

        int maxComparator = list.stream().max((a, b) -> a < b ? -1 : a > b ? 1 : 0).get();
        System.out.println(maxComparator);
    }
}
