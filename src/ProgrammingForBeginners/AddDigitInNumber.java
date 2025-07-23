package ProgrammingForBeginners;

import java.util.Scanner;

public class AddDigitInNumber {
	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        var n = sc.nextInt(); // enter 123 as input
		        var sum = 0;
		        int r = 0;

		        /*
		        String[] s = String.valueOf(n).split("");
		        sum += Integer.valueOf(s1);
		        */

		        while (n > 0) {
		            r = n % 10;
		            n = n / 10;
		            sum += r;
		        }

		        System.out.println(sum);
		    }
	

}
