package Java8Interview_questions;

import java.util.Set;
import java.util.TreeSet;

public class Comparetwoarraysandgettherecommenvalue {
	 // find common elements between two given arrays
    public static void main(String[] args) {
        String[] s1 = {"Antony", "immanuel", "Shailaja", "krishna", "Rajesh"};
        String[] s2 = {"Antony", "immanuel", "Shailaja", "sharanya"};
        Set<String> set = new TreeSet<>();

        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                if (s1[i].equals(s2[j])) {
                    set.add(s1[i]);
                }
            }
        }
        System.out.println(set);
    }
}
