package ProgrammingForBeginners;

public class SumofgivenNaturalNumberUseingrecurrssion {
	
	public static void main(String[] args) {
        int n = 20;
        System.out.println(sum(20));
    }

    public static int sum(int value) {
        if (value == 0) {
            return 0;
        }
        return value + sum(value - 1);
    }

}
