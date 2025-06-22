package practice;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Practice {
	public static void main(String[] args) {
		//sum of digits useing streams
		int num=123;
		Long sum=String.valueOf(num).chars().map(Character::getNumericValue).count();
		System.out.printf("the sum of %d is %d",num,sum);
		
		//palindrome
		int nums=121;
		String str=String.valueOf(123);
		boolean b=IntStream.range(0, str.length()/2).allMatch(i->str.charAt(i)==str.charAt(str.length()-1-i));
		System.out.println();
		System.out.println("palindrome "+b);
		
		//fabonic series
	    Stream.iterate(new int[] {0,1},fab->new int[]{fab[1],fab[0]+fab[1]}).limit(10).map(fab->fab[0]).forEach(System.out::println);
		
		
	}

}
