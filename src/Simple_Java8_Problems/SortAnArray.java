package Simple_Java8_Problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Collectors;

public class SortAnArray {
    public static void main(String[] args) {
        // Method 1: Custom comparator with Collections.sort
        List<Integer> list1 = Arrays.asList(10, 11, 1, 2, 3, 4, 5, 6);
        Collections.sort(list1, (a, b) -> a < b ? -1 : a > b ? 1 : 0);
        // System.out.println(list1);  // Ascending order

        // Method 2: Stream API - Ascending
        List<Integer> list = Arrays.asList(10, 11, 1, 2, 3, 4, 5, 6);
        List<Integer> sortAsc = list.stream().sorted().collect(Collectors.toList());
        // System.out.println(sortAsc);

        // Method 3: Stream API - Descending
        List<Integer> sortdesc = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        // System.out.println(sortdesc);

        // Method 4: PriorityQueue (min-heap logic)
        List<Integer> list2 = Arrays.asList(10, 11, 1, 2, 3, 4, 5, 6);
        Queue<Integer> q = new PriorityQueue<>();
        for (Integer x : list2) {
            q.add(x);
        }
        // System.out.println(q);

        // Placeholder for Method 5: Loop-based sorting (manually)
    }
}
