package Java8Interview_questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindSecondHighestAge {
	public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
            new Employee(1, "Antony", 27, "Chennai"),
            new Employee(2, "Priyanka", 25, "Vishak"),
            new Employee(3, "Sharanya", 24, "Chennai"),
            new Employee(4, "Immanuel", 26, "Hyderabad")
        );

        Integer secondHighestAge = list.stream()
            .map(Employee::getAge)
            .distinct()
            .sorted(Comparator.reverseOrder())
            .skip(1)
            .findFirst().get();
        System.out.println(secondHighestAge);
    }
}
