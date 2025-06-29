package Java8Interview_questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupEmployeesByCity {
	 public static void main(String[] args) {
	        List<Employee> employees = Arrays.asList(
	            new Employee(1, "Priyanka", 25, "vishak"),
	            new Employee(2, "Antony", 27, "Kancheepuram"),
	            new Employee(3, "Sharanya", 25, "Chennai"),
	            new Employee(4, "Paprao", 30, "Hyderabad")
	        );

	        Map<String, List<Employee>> employeesByCity = employees.stream()
	            .collect(Collectors.groupingBy(Employee::getCity));

	        employeesByCity.forEach((city, emps) -> {
	            System.out.println("City: " + city + " || Employees in this city: " + emps);
	        });
	    }
}
