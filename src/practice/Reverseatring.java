package practice;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Reverseatring {
	public static void main(String[] args) {
		String s="  Antony".strip();
		String l=s.chars().skip(1).mapToObj(c->String.valueOf(Character.toChars(c))).collect(Collectors.joining());               
		System.out.println(l);
		
		//string reversal
		int n=123;
		String ss=String.valueOf(n);
		String rev=IntStream.rangeClosed(0, ss.length()-1).mapToObj(i->String.valueOf((char)ss.charAt(ss.length()-i-1))).collect(Collectors.joining());
		System.out.println(rev);//321
	}

}
