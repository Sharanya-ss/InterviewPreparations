package ProgrammingForBeginners;

import java.util.Scanner;

public class palindrome {
	 public static void main(String[] args) {
	        // find the entered number is palindrome or not
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int r;
	        int temp = n;
	        int reversed = 0;

	        while (n > 0) {
	            r = n % 10;
	            n = n / 10; // int won't take decimal values
	            System.out.println(n); // debug print
	            reversed = reversed * 10 + r;
	            // example: 0*10+3 = 3 → 3*10+2 = 32 → 32*10+1 = 321
	        }

	        if (reversed == temp) {
	            System.out.println(reversed + " is palindrome number");
	        } else {
	            System.out.println(reversed + " not palindrome");
	        }
	    }
}
