package comcast;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ATNT {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("rohit", "urmila", "rohit", "urmila", "ram", "sham", "sita", "gita");
		names.stream().sorted(Comparator.comparing(String::valueOf)).toList().forEach(System.out::println);;
		Map<String,Long> namesfreq=names.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(namesfreq);
		
		 Map<Integer, String> map = new HashMap<>();
	        map.put(1, "linode");
	        map.put(2, "heroku");
	        map.put(3, "aws");
	        
	      Map<Integer,String> map2 =map.entrySet().stream().filter(i->i.getValue()=="linode").collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
	      System.out.println(map2);
	      
	      Map<String, Integer> unsortMap = new HashMap<>();

	        unsortMap.put("z", 10);

	        unsortMap.put("b", 5);

	        unsortMap.put("a", 6);

	        unsortMap.put("c", 20);

	        unsortMap.put("d", 1);

	        unsortMap.put("e", 7);

	        unsortMap.put("y", 8);

	        unsortMap.put("n", 99);

	        unsortMap.put("g", 50);

	        unsortMap.put("m", 2);

	        unsortMap.put("f", 9);
	        
	        unsortMap.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey)).forEach(System.out::println);
	        
	}
}
