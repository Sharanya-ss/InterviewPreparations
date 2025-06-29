package ProgrammingForBeginners;

public class FactorsOfTheNumber {
    public static void main(String[] args) {
        int n = 30;
        int i = 1;

        System.out.print("Factors are ");

        while (i <= n) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
