package ProgrammingForBeginners;

import java.util.ArrayList;
import java.util.Scanner;

public class JosephusProblem {
	public static void main(String[] args) {
        // Killing consecutive numbers in the array
        // consider an array of numbers: number at index 0 kills number at index 2,
        // number at index 2 kills number at index 4, and so on
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int j = 0; j < n; j++) {
            arr.add(j + 1);
        }

        int i = 2;
        while (arr.size() > 1) {
            if (arr.size() > i) {
                arr.remove(i);
                i++;
            } else {
                i = (n % 2 == 0) ? 0 : 1;
            }
        }

        System.out.println(arr.get(0));
    }
}
