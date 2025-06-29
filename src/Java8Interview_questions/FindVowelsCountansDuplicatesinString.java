package Java8Interview_questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindVowelsCountansDuplicatesinString {
	
    public static void main(String[] args) {
        String name = "anteiou eor ox";
        String[] s = name.toLowerCase().replaceAll("\\s", "").split("");
        List<String> sList = Arrays.asList(s);
        System.out.println(sList);

        //count the vowels in string
        //Predicate<String> p = i -> i.toLowerCase().contains("a") ? true : i.contains("e") ? true : i.contains("i") ? true : i.contains("o") ? true : i.contains("u") ? true : false;
        Long c = sList.stream().filter(i -> i.toLowerCase().matches("a|e|i|o|u")).count();
        System.out.println("the count of Vowels in string = " + c);

        //find duplicates in string
        List<String> duplicate = sList.stream().filter(i -> Collections.frequency(sList, i) > 1).collect(Collectors.toList());
        System.out.println(duplicate.stream().reduce((a, b) -> a + b).get());
    }

}
