package Java8Interview_questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployeesByCityAndName {

	public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
	            new Employee(1, "Priyanka", 25, "vishak"),
	            new Employee(2, "Antony", 27, "Kancheepuram"),
	            new Employee(3, "Sharanya", 25, "Chennai"),
	            new Employee(4, "Paprao", 30, "Hyderabad")
	        );

        // Forward sorting by city, then name
        List<Employee> forwardSorted = employees.stream()
            .sorted(Comparator.comparing(Employee::getCity)
                              .thenComparing(Employee::getName))
            .collect(Collectors.toList());

        System.out.println("Forward sorted by city and name:");
        forwardSorted.forEach(e -> System.out.println(e.getCity() + " - " + e.getName()));

        System.out.println("--------------------------------------------------");

        // Reversed sorting by city, then name
        List<Employee> reverseSorted = employees.stream()
            .sorted(Comparator.comparing(Employee::getCity)
                              .thenComparing(Employee::getName)
                              .reversed())
            .collect(Collectors.toList());

        System.out.println("Reversed sorted by city and name:");
        reverseSorted.forEach(e -> System.out.println(e.getCity() + " - " + e.getName()));
    }
}
