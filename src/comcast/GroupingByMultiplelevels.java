package comcast;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

final class Employee1{
	@Override
	public String toString() {
		return "Employee1 [ getSalary()=" + getSalary() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	private final String name;
	private final int salary;
	Employee1(String name,int salary ){
		this.name=name;
		this.salary=salary;
	}
	public String getDipartment() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	
}

public class GroupingByMultiplelevels {
	public static void main(String[] args) {
		List<Employee1> employees = Arrays.asList(
			    new Employee1("HR", 5000),
			    new Employee1("IT", 7000),
			    new Employee1("HR", 6000),
			    new Employee1("IT", 8000)
			);
		Map<String, Map<String, List<Employee1>>> groupedByDeptAndSalary = employees.stream()
		        .collect(Collectors.groupingBy(
		                Employee1::getDipartment,
		                Collectors.groupingBy(emp -> emp.getSalary() > 6000 ? "High" : "Low")
		        ));
		groupedByDeptAndSalary.forEach((department,map)->{
			System.out.println("Departmet :"+department);
			map.forEach((K,v)->{
				System.out.println("range :"+K);
				v.stream().forEach(e->System.out.println(e));
			});
		});
		
	}
	
}
