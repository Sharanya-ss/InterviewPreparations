package Simple_Java8_Problems;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PalindromeJava8 {
	public static void main(String[] args) {

        // Check for palindrome (commented)
        int num = 123;
        String s = String.valueOf(num);
        // boolean b = IntStream.range(0, s.length())
        //     .boxed()
        //     .allMatch(i -> s.charAt(i) == s.charAt(s.length() - i - 1));
        // System.out.println(b);

        // Reverse an Integer (commented)
        // String ss = IntStream.range(0, s.length())
        //     .boxed()
        //     .map(i -> String.valueOf(s.charAt(s.length() - i - 1)))
        //     .collect(Collectors.joining());
        // System.out.println(String.valueOf(ss));

        // Reverse a String
        String name = "Antony";
        String rev = IntStream.rangeClosed(0, name.length() - 1)
            .boxed()
            .map(i -> String.valueOf(name.charAt(name.length() - i - 1)))
            .collect(Collectors.joining());
        System.out.println(rev);
    }
}
