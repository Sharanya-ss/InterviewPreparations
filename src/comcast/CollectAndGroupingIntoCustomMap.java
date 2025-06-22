package comcast;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class CollectAndGroupingIntoCustomMap {
	public static void main(String[] args) {
		List<Employee1> employees = Arrays.asList(
			    new Employee1("HR", 5000),
			    new Employee1("IT", 7000),
			    new Employee1("HR", 6000),
			    new Employee1("IT", 8000)
			);
		TreeMap<String, Map<String, List<Employee1>>> groupedByDeptAndSalary = employees.stream()
		        .collect(Collectors.groupingBy(
		                Employee1::getDipartment,TreeMap::new,
		                Collectors.groupingBy(emp -> emp.getSalary() >= 6000 ? "High" : "Low",Collectors.toList())
		        ));
		
		System.out.println(groupedByDeptAndSalary);
	}
	
}
