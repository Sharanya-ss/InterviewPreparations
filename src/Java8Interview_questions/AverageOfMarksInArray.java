package Java8Interview_questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class AverageOfMarksInArray {
	public static void main(String[] args) {
        String[] ss = {"1-english:45", "2-english:35", "3-hindhi:50"};
        Map<String, List<Integer>> ms = new TreeMap<>();
        for (int i = 0; i < ss.length; i++) {
            String[] parts = ss[i].split(":");
            String subject = parts[0].substring(parts[0].indexOf("-") + 1);
            int mark = Integer.parseInt(parts[1]);

            ms.computeIfAbsent(subject, k -> new ArrayList<>()).add(mark);
        }

        ms.forEach((subject, marks) -> {
            double avg = marks.stream().collect(Collectors.averagingDouble(Integer::doubleValue));
            System.out.println(subject + "-" + avg);
        });
    }
}
