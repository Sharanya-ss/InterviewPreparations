package Simple_Java8_Problems;

import java.util.Arrays;
import java.util.List;

public class SquareNumberFindAverage {
	public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        // Square each element and compute the average
        Double avg = list.stream()
                         .map(i -> i * i)           // square each number
                         .mapToInt(i -> i)          // convert to IntStream
                         .average()                 // compute average
                         .getAsDouble();            // extract result

        System.out.println(avg);
    }
}
