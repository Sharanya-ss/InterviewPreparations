package ProgrammingForBeginners;

import java.util.Scanner;

public class fibonacci_eriers {
	public static void main(String[] args) {
        // febonic series of number
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int firstNumber = 0;
        int secondnumber = 1;
        int nextnumber;

        for (int i = 0; i <= n; i++) {
            nextnumber = firstNumber + secondnumber;
            System.out.print(firstNumber + ", ");
            firstNumber = secondnumber;
            secondnumber = nextnumber;
        }
    }
}
