package Java8Interview_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class USTGlobal {
	public static void main(String[] args) {
		// Task 1: Filter names starting with 'A'
        List<String> names = Arrays.asList("Amit", "Antony", "Ramesh", "Vikram", "Anto", "anto");
        List<String> A_Array = names.stream()
            .filter(s -> s.toUpperCase().startsWith("A"))
            .collect(Collectors.toList());
        System.out.println(A_Array);

        // Task 2: Group employees by gender
        List<Employee> Emplist = Arrays.asList(new Employee(1, "Antony", 27, "Vishak"),
                new Employee(2, "Priyanka", 25, "Vishak"),
                new Employee(3, "Sharanya", 24, "Chennai"),
                new Employee(4, "Immanuel", 26, "Hyderabad")
            );
        Map<String, List<Employee>> CityGrouping = Emplist.stream()
            .collect(Collectors.groupingBy(Employee::getName));
        CityGrouping.forEach((k, v) -> System.out.println(k + " - " + v));

        // Task 3: Find non-duplicate characters in a string
        String[] s = "asdasdadgtfsfcz".split("");
        List<String> sl = Arrays.asList(s);
        Map<String, Long> dup_count = sl.stream()
            .filter(i -> Collections.frequency(sl, i) == 1)
            .collect(Collectors.groupingBy(String::valueOf, Collectors.counting()));
        System.out.println(dup_count);
	}

}
