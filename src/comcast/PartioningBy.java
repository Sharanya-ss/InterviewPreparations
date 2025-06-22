package comcast;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class PartioningBy {
    public static void main(String[] args) {
    	List<Employee1> employees = Arrays.asList(
			    new Employee1("HR", 5001),
			    new Employee1("IT", 7000),
			    new Employee1("HR", 6000),
			    new Employee1("IT", 8000)
			);
        Map<Boolean, List<Employee1>> map= employees.stream().collect(Collectors.partitioningBy(e->e.getSalary()%2==0));
        
        Map<String,Optional<Employee1>> depmax=employees.parallelStream().collect(Collectors.groupingBy(Employee1::getDipartment,Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee1::getSalary)))));
        System.out.println(map);
	} 
    
}
