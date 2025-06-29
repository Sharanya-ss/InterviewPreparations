package ProgrammingForBeginners;

import java.util.Scanner;

public class ChecktheGivenYearISLeapYear {
	 public static void main(String[] args) {
	        // check the entered year is leap year
	        // year % 4 == 0

	        Scanner sc = new Scanner(System.in);
	        int year = sc.nextInt();
	        boolean leap;

	        leap = year % 4 == 0 ? true : false;

	        System.out.println(leap ? year + " is leap year" : year + " is not leap year");
	    }
}
