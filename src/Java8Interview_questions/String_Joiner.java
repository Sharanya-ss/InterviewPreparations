package Java8Interview_questions;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class String_Joiner {
	public static void main(String[] args) {
        String inp = "How are you Priyanka";

        // Expected output: [HELLO-How-are-you]

        // Method 1: Using String.join with split
        String out1 = "[" + String.join("-", inp.split(" ")) + "]";
        System.out.println(out1);

        // Method 2: Using String.replace
        String out2 = "[" + inp.replace(" ", "-") + "]";
        System.out.println(out2);

        // Method 3: Using String.replaceAll
        String out3 = "[" + inp.replaceAll(" ", "-") + "]";
        System.out.println(out3);

        // Method 4: Using StringJoiner class
        StringJoiner sj = new StringJoiner("-", "[", "]");
        List<String> ls = Arrays.asList(inp.split(" "));
        for (String s : ls) {
            sj.add(s);
        }
        System.out.println(sj);

        // Method 5: Using Collectors.joining
        String out5 = ls.stream().collect(Collectors.joining("-", "[", "]"));  // use this method in interviews
        System.out.println(out5);
    }
}
