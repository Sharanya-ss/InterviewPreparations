package Java8Interview_questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

class Employee2 {
    private int id;
    private String name;
    private String city;
    private Double salary;
    private String department;
    private boolean active;

    

    public Employee2(int id, String name, String city, Double salary, String department, boolean active) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.salary = salary;
		this.department = department;
		this.active = active;
	}
	// Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getCity() { return city; }
    public Double getSalary() { return salary; }
    public String getDepartment() { return department; }
    public boolean isActive() { return active; }

    // Setters
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setCity(String city) { this.city = city; }
    public void setSalary(Double salary) { this.salary = salary; }
    public void setDepartment(String department) { this.department = department; }
    public void setActive(boolean active) { this.active = active; }

    @Override
    public String toString() {
        return "Employee {id=" + id + ", name=" + name + ", salary=" + salary + "}";
    }
}


public class WiproTrickyQuestions {
	
	public static void main(String[] args) {
        List<String> emp = Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "1", "2", "3", "4", "5", "6", "7", "8", "9");
        List<Employee2> list = Arrays.asList(
                new Employee2(1, "Antony", "Chennai",50000.00,"Java DEV",true),
                new Employee2(2, "Priyanka", "Vishak",100000.00,"Java DEV",true),
                new Employee2(3, "Sharanya", "Chennai",70000.00,"Java DEV",false),
                new Employee2(4, "Immanuel", "Hyderabad",60000.00,"Devops",false)
            );

        // Max salary
        Employee2 maxSalary = list.stream()
            .collect(Collectors.maxBy(Comparator.comparingDouble(Employee2::getSalary)))
            .get();
        System.out.println(maxSalary);

        // Min salary
        Employee2 minSalary = list.stream()
            .collect(Collectors.minBy(Comparator.comparingDouble(Employee2::getSalary)))
            .get();
        System.out.println(minSalary);

        // Max salary per department using reducing and groupingBy
        Map<String, Optional<Employee2>> maxSalaryPerDept = list.stream()
            .collect(Collectors.groupingBy(Employee2::getDepartment,
                Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee2::getSalary)))));
        maxSalaryPerDept.forEach((dept, empOpt) -> System.out.println(dept + " - " + empOpt.orElse(null)));

        // Count active vs inactive employees
        Map<Boolean, Long> activeStatus = list.stream()
            .collect(Collectors.groupingBy(Employee2::isActive, Collectors.counting()));
        activeStatus.forEach((status, count) -> System.out.println(status + " - " + count));

        // Employee count per department
        Map<String, Long> deptCounts = list.stream()
            .collect(Collectors.groupingBy(Employee2::getDepartment, Collectors.counting()));
        deptCounts.forEach((dept, count) -> System.out.println(dept + " - " + count));

        // Detailed employee list per department
        Map<String, List<Employee2>> empDetails = list.stream()
            .collect(Collectors.groupingBy(Employee2::getDepartment));
        empDetails.forEach((dept, employees) -> System.out.println(dept + " - " + employees));
    }


}
