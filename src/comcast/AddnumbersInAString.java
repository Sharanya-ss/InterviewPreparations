package comcast;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AddnumbersInAString {
	public static void main(String[] args) {
		String name="Antony12354Akash";
		//name.chars().filter(Character::isUpperCase).mapToObj(Character::toChars).forEach(System.out::println);
		
		//
		//System.out.println(String.valueOf(123).chars().map(Character::getNumericValue).count());
		
		//fabonic series 10 numbers
		//Stream.iterate(new int[] {0,1},fab->new int[] {fab[1],fab[0]+fab[1]}).limit(10).map(fab->fab[0]).forEach(System.out::println);
		
		//palindrome 121
		String s=String.valueOf(12221);
		System.out.println(IntStream.range(0, s.length()/2).allMatch(num->s.charAt(num) == s.charAt(s.length()-1-num)));
		
	}

}
