package Java8Interview_questions;

import java.util.Arrays;
import java.util.List;

public class MultiplyElementsinArray {
	 public static void main(String[] args) {
	        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
	        int result = list.stream().reduce((a, b) -> a * b).get();
	        System.out.println(result);
	    }

}
