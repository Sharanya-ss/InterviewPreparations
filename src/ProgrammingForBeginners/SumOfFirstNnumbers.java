package ProgrammingForBeginners;

import java.util.Scanner;

public class SumOfFirstNnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        sum = (n * (n + 1)) / 2;
        System.out.println(sum);
    }

}
