package ProgrammingForBeginners;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
        // check whether user entered number is prime number or not
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // e.g., 13
        int flag = 1;

        if (n == 0 || n == 1) {
            flag = 0;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                flag = 0;
                break;
            }
        }

        if (flag == 1) {
            System.out.printf("User Entered number is a prime number %d\n", n);
        } else {
            System.out.printf("User Entered number is not a prime number %d\n", n);
        }
    }
}
