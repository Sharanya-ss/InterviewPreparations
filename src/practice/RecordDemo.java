package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

record Person(int id, String name) {}  // for creating immutable class in java, minimum boiler plate codes,
//java 21 //automatically implemets eqluals,hashcode and tostring method

public class RecordDemo {
	public static void main(String[] args) {
		List<Person> l=Arrays.asList(new Person(1,"Antony"),new Person(2,"Akash"));
		List<Integer> id=l.stream().map(i->i.id()).collect(Collectors.toList());
		System.out.println(id);
	}
}
