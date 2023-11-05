import java.util.Random;
import java.util.Scanner;

public class numberguessinggame
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int lowerBound = 1;
        int upperBound = 100;
        int maxAttempts = 5;
        int score = 4;
        boolean playAgain = true;

        while (playAgain) {
            int generatedNumber = 67;
            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("Guess a number between " + lowerBound + " and " + upperBound);

            int attempts = 0;
            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess == generatedNumber) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts!");
                    score++;
                    break;
                } else if (guess < generatedNumber) {
                    System.out.println("Your guess is too low.");
                } else {
                    System.out.println("Your guess is too high.");
                }

                if (attempts == maxAttempts) {
                    System.out.println("Sorry, you have run out of attempts. The number was: " + generatedNumber);
                }
            }

            System.out.println("Your current score is: " + score);
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainResponse = scanner.next().toLowerCase();

            if (!playAgainResponse.equals("yes")) {
                playAgain = false;
                System.out.println("Thank you for playing! Your final score is: " + score);
            }
        }

        scanner.close();
}
}