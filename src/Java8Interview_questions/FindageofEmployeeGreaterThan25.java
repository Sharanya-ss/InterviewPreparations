package Java8Interview_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private int age;
    private String City;

    public Employee(int id, String name, int age, String city) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		City = city;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

public class FindageofEmployeeGreaterThan25 {
	
	public static void main(String[] args) {
        List<Employee> list = Arrays.asList(new Employee(1, "Antony", 27, "Chennai"),
                new Employee(2, "Priyanka", 25, "Vishak"),
                new Employee(3, "Sharanya", 24, "Chennai"),
                new Employee(4, "Immanuel", 26, "Hyderabad")
            );

        List<Employee> EmployeeagemoreThan25 = list.stream()
            .filter(i->i.getAge()>25)
            .collect(Collectors.toList());

        EmployeeagemoreThan25.forEach(System.out::println);
        
    }
  }

}
