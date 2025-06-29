package ProgrammingForBeginners;

import java.util.Random;

public class Randoms {
	public static void main(String[] args) {
        // Create a dice that generates random number between 1 and 6

        Random r = new Random();

        // Generate number from 1 to 6
        int diceRoll = r.nextInt(6) + 1;

        System.out.println("Dice rolled: " + diceRoll);
    }


}
