package Simple_Java8_Problems;

import java.util.stream.IntStream;

public class factorsOfAnumber {
	public static void main(String[] args) {
        int n = 15;
        IntStream.rangeClosed(2, n)
                 .boxed()
                 .filter(i -> n % i == 0)
                 .forEach(System.out::println);
    }

}
