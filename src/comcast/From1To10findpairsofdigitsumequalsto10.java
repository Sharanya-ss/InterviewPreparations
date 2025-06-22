package comcast;

import java.util.stream.IntStream;

public class From1To10findpairsofdigitsumequalsto10 {
	public static void main(String[] args) {
		var max=10;
		IntStream.rangeClosed(1,max/2).mapToObj(n->"("+n+","+(max-n)+")").forEach(System.out::println);
	}
}
