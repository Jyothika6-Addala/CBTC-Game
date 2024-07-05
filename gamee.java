import java.util.Random;
import java.util.Scanner;

class GuessTheNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int range = 100;
        int attempts = 0;
        int maxAttempts = 10;
        int score = 0;

        System.out.println("Welcome to Guess the Number!");
        System.out.println("I'm thinking of a number between 1 and " + range);
        int randomNumber = random.nextInt(range) + 1;

        boolean hasGuessedCorrectly = false;

        while (attempts < maxAttempts && !hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == randomNumber) {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                hasGuessedCorrectly = true;
                score = maxAttempts - attempts + 1; // Example scoring based on attempts
            } else if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        if (!hasGuessedCorrectly) {
            System.out.println("Sorry, you did not guess the number. It was " + randomNumber);
        }

        System.out.println("Your score is: " + score);
        scanner.close();
    }
}
