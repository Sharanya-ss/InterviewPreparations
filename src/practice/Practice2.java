package practice;

import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Practice2 {
	public static void main(String[] args) {
		//Find upper case in a string
		//"AntonyImmanueAkash".chars().filter(Character::isUpperCase).mapToObj(Character::toChars).forEach(System.out::println);
		//find sum of didgits in a string
		//String s="Antony1234Akash";
		//int sum=s.chars().filter(Character::isDigit).map(Character::getNumericValue).sum();
		//System.out.println(sum);
		//find count of number in instring
		//Long count=s.chars().filter(Character::isDigit).map(Character::getNumericValue).count();
		//System.out.println(count);
		//count upper caase in a string
		//long count="AntonyImmanueAkash".chars().filter(Character::isUpperCase).mapToObj(Character::toChars).count();
		//System.out.println(count);
		
		//fabonic serier of 10 numbers
		//Stream.iterate(new int[] {0,1}, fab->new int [] {fab[1],fab[0]+fab[1]}).limit(10).map(fab->fab[0]).forEach(System.out::println);
		
		//palindrome 121
		/*
		 * String s=String.valueOf(12221); boolean b=IntStream.range(0,
		 * s.length()/2).allMatch(i->s.charAt(i)==s.charAt(s.length()-1-i));
		 * System.out.println(b);
		 */
		
		//prime fumbers
		//Predicate<Integer> p=n->(n>1 && IntStream.rangeClosed(2,(int) Math.sqrt(n)).allMatch(num->n%num!=0));
		//System.out.println(p.test(29));
		
		//number 1 to 100 in list filter odd number find prime numbers out of the odd numbers
		//IntStream.rangeClosed(0,100).boxed().filter(n->n%2!=0).filter(n->(n>1&&IntStream.rangeClosed(2,(int)Math.sqrt(n)).boxed().allMatch(i->n%i!=0))).forEach(System.out::println);
		//
		
		"Hello\nWorld\npamila".lines().forEach(System.out::println);
	}

}
