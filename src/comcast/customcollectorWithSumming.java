package comcast;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Employees {
    String department;
    int salary;
    
    Employees(String department, int salary) {
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() { return department; }
    public int getSalary() { return salary; }
}

public class customcollectorWithSumming {
	public static void main(String[] args) {
		List<Employees> employees = Arrays.asList(
			    new Employees("HR", 5000),
			    new Employees("IT", 7000),
			    new Employees("HR", 6000),
			    new Employees("IT", 8000)
			);

			Map<String,Integer> salaryByDept = employees.stream()
			        .collect(Collectors.groupingBy(Employees::getDepartment,Collectors.summingInt(Employees::getSalary)));
			
			Map<String, Optional<Employees>> salaryBydepartment=employees.stream().collect(Collectors.groupingBy(Employees::getDepartment,Collectors.reducing((a,b)->a.getSalary()>b.getSalary()?a:b)));

			System.out.println(salaryByDept);
			System.out.println(salaryBydepartment);
	}
	
}
