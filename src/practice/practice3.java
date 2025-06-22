package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class practice3 {
    public static void main(String[] args) {
		List<Integer> l=IntStream.rangeClosed(0, 10).boxed().collect(Collectors.toList());
		//sum of pair should be 10
	    //IntStream.rangeClosed(1,10/2).mapToObj(num->"("+num+","+(10-num)+")").forEach(System.out::println);
		//find numbers in String
		String s="123";
		int n =s.chars().filter(Character::isDigit).map(Character::getNumericValue).sum();
		System.out.println(n);
	}
}
