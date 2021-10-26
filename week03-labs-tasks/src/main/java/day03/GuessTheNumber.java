package day03;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        GuessTheNumber game = new GuessTheNumber();

        boolean play = true;
        while (play) play = game.play(scanner, random);

        System.out.println();
        System.out.println("Come back soon!");
    }

    private boolean play(Scanner scanner, Random random) {

        System.out.println();
        System.out.println("Guess the Number");
        System.out.println();
        System.out.println("The goal of this game is to guess a number randomly generated between 1 and 100.");
        System.out.println();
        System.out.println("You can guess six times.");
        System.out.println("Good luck!");
        System.out.println();

        int goal = random.nextInt(1, 101);
        int guess;

        for (int nthTry = 1; true; nthTry++) {
            System.out.print("Enter " + getOrdinalNumber(nthTry) + " guess: ");
            guess = scanner.nextInt();
            scanner.nextLine();

            if (guess == goal) {
                System.out.println();
                System.out.println("That's the number!");
                System.out.println("Congratulations! You won!");
                break;
            }

            if (nthTry >= 6) {
                System.out.println();
                System.out.println("Sorry, you ran out of guesses.");
                System.out.println("The number was " + goal + ".");
                System.out.println("You lost the game!");
                break;
            }

            System.out.println("You guessed too " + (guess < goal ? "low" : "high") + ". Try again!");
            System.out.println();
        }

        System.out.println();
        while (true) {
            System.out.print("Try again? [Y/N]: ");
            String command = scanner.nextLine().toUpperCase().trim();
            if ("Y".equals(command)) return true;
            if ("N".equals(command)) return false;
        }
    }

    private String getOrdinalNumber(int number) {
        return switch (number) {
            case 1 -> "first";
            case 2 -> "second";
            case 3 -> "third";
            case 4 -> "fourth";
            case 5 -> "fifth";
            case 6 -> "sixth";
            default -> "";
        };
    }
}
