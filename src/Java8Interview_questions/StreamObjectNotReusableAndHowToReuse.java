package Java8Interview_questions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamObjectNotReusableAndHowToReuse {
	public static void main(String[] args) {
        String[] names = {"Priyanka", "Sharanya", "Antony", "krishna", "virtusa"};
        List<String> list = Arrays.asList(names);
        Stream<String> stream = list.stream();

        // First usage of the stream
        stream.forEach(System.out::println);

        // Second usage would throw an IllegalStateException:
        // stream.filter(i -> i.equalsIgnoreCase("someName")).count();

        // Reusable stream using Supplier
        Supplier<Stream<String>> streamSupplier = () -> Stream.of(names);
        streamSupplier.get().forEach(System.out::println);
        streamSupplier.get().forEach(System.out::println);
    }
}
