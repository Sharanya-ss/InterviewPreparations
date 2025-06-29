package Simple_Java8_Problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class VowelsinString {
	public static void main(String[] args) {
        List<String> name = Arrays.asList("Ant onio uy".strip().split(""));
        name.stream()
            .filter(i -> i.matches("a|e|i|o|u"))
            .collect(Collectors.toSet())
            .forEach(System.out::print);
    }
}
