package practice;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class factorsofthestring {
	
	public static void main(String[] args) {
		var num=11;
		IntStream.range(1,num).boxed().collect(Collectors.toList()).stream().filter(i->num%i==0).forEach(System.out::println);
		
	}

}
