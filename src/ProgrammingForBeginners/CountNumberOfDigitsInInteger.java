package ProgrammingForBeginners;

public class CountNumberOfDigitsInInteger {
    public static void main(String[] args) {
        int n = 1234523;
        int c = 0;

        while (n > 0) {
            n = n / 10;
            c++;
        }

        System.out.println(c);
    }
}
