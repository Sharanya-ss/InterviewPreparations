package ProgrammingForBeginners;

public class ReverseAInteger {
	public static void main(String[] args) {
        int a = 1234;

        // Convert the integer to String
        String s = String.valueOf(a);

        // Use StringBuffer to reverse
        StringBuffer b = new StringBuffer(s);
        b.reverse();

        // Print the reversed result
        System.out.println("Reversed integer: " + b);
    }
	
}
