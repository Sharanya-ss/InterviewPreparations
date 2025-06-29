package ProgrammingForBeginners;

public class swapTwoNumbers {
    public static void main(String[] args) {
        // swap two numbers without third variable
        int a = 100;
        int b = 200;

        a = (a ^ b) ^ a;

        System.out.println(a);
    }

}
