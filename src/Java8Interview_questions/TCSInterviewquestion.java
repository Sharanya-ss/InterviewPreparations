package Java8Interview_questions;

import java.util.Scanner;

public class TCSInterviewquestion {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
     
     // Even or Odd without using modulus
     System.out.print("Enter a number: ");
     int n = sc.nextInt();
     if ((n / 2) * 2 == n) {
         System.out.println("Entered number is Even: " + n);
     } else {
         System.out.println("Entered number is Odd: " + n);
     }

     // Pyramid pattern of 5 rows
     int rows = 5;
     for (int i = 0; i < rows; i++) {
         for (int j = rows - 1; j > i; j--) {
             System.out.print(" ");
         }
         for (int k = 0; k <= i; k++) {
             System.out.print("* ");
         }
         System.out.println();
     }
}
}
