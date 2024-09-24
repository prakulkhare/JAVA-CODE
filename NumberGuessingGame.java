import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        char playAgain;

        do {
            int secretNumber = random.nextInt(100) + 1; 
            int numberOfTries = 0;

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I've picked a secret number between 1 and 100.");
            System.out.println("Can you guess it?");

            while (true) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                numberOfTries++;

                if (guess == secretNumber) {
                    System.out.println("Congratulations! You guessed it!");
                    System.out.println("Number of tries: " + numberOfTries);
                    break;
                } else if (guess < secretNumber) {
                    System.out.println("Your guess is too low. Try again!");
                } else {
                    System.out.println("Your guess is too high. Try again!");
                }
            }

            System.out.print("Do you want to play again? (y/n): ");
            playAgain = scanner.next().charAt(0);
        } while (playAgain == 'y' || playAgain == 'Y');

        System.out.println("Thank you for playing! Fare thee well, noble player!");
        scanner.close();
    }
}
