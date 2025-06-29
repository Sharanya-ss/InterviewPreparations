package ProgrammingForBeginners;

public class StringIterationFinder {
	public static void main(String[] args) {
        String s = "Antony";
        String temp = s;
        int c = 0;

        while (true) {
            s = s.substring(1) + s.substring(0, 1);
            System.out.println(s + '\n');
            c++;
            if (temp.equals(s)) {
                break;
            }
        }
        System.out.println(c);
    }
}
