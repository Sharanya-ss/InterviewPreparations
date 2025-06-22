package comcast;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


class Employeemaping {
    String department;
    int salary;
    
    Employeemaping(String department, int salary) {
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() { return department; }
    public int getSalary() { return salary; }
}
public class CollectorsMapping {
	public static void main(String[] args) {
		List<Employeemaping> employees = Arrays.asList(
				new Employeemaping("HR", 5000),
			    new Employeemaping("IT", 7000),
			    new Employeemaping("HR", 6000),
			    new Employeemaping("IT", 8000)
			);
		Map<String,List<String>> groupedByDeptAndSalary = employees.stream()
		        .collect(Collectors.groupingBy(
		                Employeemaping::getDepartment,
		                Collectors.mapping(i->String.valueOf(i.getSalary()).concat(":").concat(i.getDepartment()), Collectors.toList())
		        ));
		
		System.out.println(groupedByDeptAndSalary);
	}
}
