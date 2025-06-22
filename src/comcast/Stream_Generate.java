package comcast;

import java.util.Random;
import java.util.stream.Stream;

public class Stream_Generate {
	  public static void main(String[] args) {
	        Stream.generate(() -> "Hello") // Generates random integers
	              .limit(5) // Limit to 5 elements  //limit is mandatory to use with generate or else will end up in Infinite loop
	              .forEach(System.out::println); // Print each element
	    }
}
