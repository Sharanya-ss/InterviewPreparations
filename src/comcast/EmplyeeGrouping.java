package comcast;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

final class Employee{
	private final String name;
	private final int salary;
	Employee(String name,int salary ){
		this.name=name;
		this.salary=salary;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
}

public class EmplyeeGrouping {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 1500),
            new Employee("Alice", 1500),
            new Employee("Bob", 2500),
            new Employee("Charlie", 3500),
            new Employee("Dave", 4500)
        );

        // Group by salary range
        Map<String, List<Integer>> groupedBySalary = employees.stream()
            .collect(Collectors.groupingBy( i->{
            if(i.getSalary()>1000 && i.getSalary()<2000) {
            	return "1000-2000";
            }else if(i.getSalary()>2000 && i.getSalary()<3000) {
            	return "2000-3000";
            }else if(i.getSalary()>3000 && i.getSalary()<4000) {
            	return "3000-4000";
            }else {
            	return "4000+";
            }
            }
            ,Collectors.mapping(emp->emp.getSalary(), Collectors.toList())));
        
        System.out.println(groupedBySalary);

        // Display grouped results
		/*
		 * groupedBySalary.forEach((range, empList) -> {
		 * System.out.println("Salary Range: " + range); empList.forEach(emp ->
		 * System.out.println(" - " + emp.getName())); });
		 */
    }
}