package comcast;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SumOfDigits {
	public static void main(String[] args) {
		//sum of Digits in number
		System.out.println(String.valueOf(123).chars().map(Character::getNumericValue).sum());
		//count of digits in number
		System.out.println(String.valueOf(123).chars().map(Character::getNumericValue).count());
		//fabonic series
		Stream.iterate(new int[] {1,1}, fab->new int[]{fab[1],fab[1]+fab[1]}).limit(10).map(fab->fab[0]).forEach(System.out::println);
		//palindrome
		int num=123;
		String str=String.valueOf(121);
		boolean ispalindrome =IntStream.range(0, str.length()/2).allMatch(i->str.charAt(i)==str.charAt(str.length()-1-i));
		System.out.printf("number = %d is %b palindrome",num,ispalindrome);
	}

}
