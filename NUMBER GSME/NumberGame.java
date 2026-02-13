import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        final int MIN = 1;
        final int MAX = 100;
        final int MAX_ATTEMPTS = 7;  

        int score = 0;  
        boolean playAgain = true;

        System.out.println(" Welcome to the Number Guessing Game!");
        System.out.println("I have chosen a number between " + MIN + " and " + MAX + ".");

        while (playAgain) {
            int secretNumber = random.nextInt(MAX - MIN + 1) + MIN;  
            int attempts = 0;
            boolean guessedCorrectly = false;

            System.out.println("\nNew Round Started!");
            System.out.println("You have " + MAX_ATTEMPTS + " attempts. Good luck!");

            while (attempts < MAX_ATTEMPTS && !guessedCorrectly) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess == secretNumber) {
                    System.out.println(" Correct! You guessed the number in " + attempts + " attempts.");
                    guessedCorrectly = true;
                    score++;  
                } else if (guess < secretNumber) {
                    System.out.println(" Too low! Try again.");
                } else {
                    System.out.println(" Too high! Try again.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println(" Out of attempts! The correct number was: " + secretNumber);
            }

            System.out.print("\nDo you want to play another round? (y/n): ");
            char choice = scanner.next().toLowerCase().charAt(0);
            if (choice != 'y') {
                playAgain = false;
            }
        }

        System.out.println("\n Game Over!");
        System.out.println("Your final score (rounds won): " + score);

        scanner.close();
    }
}
