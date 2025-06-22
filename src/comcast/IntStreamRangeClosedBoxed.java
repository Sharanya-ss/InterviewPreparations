package comcast;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamRangeClosedBoxed {
	//find prime numbers
	public static void main(String[] args) {
		//add one 1 to 100 number to the list //find odd numbers //find prime numbers from hard numbers
		List<Integer> list=IntStream.rangeClosed(1, 100).boxed().filter(i->i%2!=0).filter(number->number>=2 && IntStream.rangeClosed(2,(int)Math.sqrt(number)).allMatch(n->number%n !=0)).collect(Collectors.toList());
		System.out.println(list);
	}
	//method to check whether the given number is prime or not
	public static boolean isPrime(int number) {
		return number>2 && IntStream.rangeClosed(2,(int)Math.sqrt(number)).allMatch(n->number%n !=0);
	}
}
