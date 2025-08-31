import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        boolean playAgain = true;

        System.out.println("Number Guessing Game");

        while (playAgain) {
            int targetNumber = random.nextInt(100) + 1;
            int guess;
            int attempts = 0;
            int maxAttempts = 5;

            System.out.println("\n selected a number between 1 and 100");
            System.out.println("You have " + maxAttempts + " attempts to guess it!");

            while (true) {
                System.out.print("Enter your guess: ");
                guess = scanner.nextInt();
                attempts++;

                if (guess == targetNumber) {
                    System.out.println("Correct! You've guessed the number in " + attempts + " attempts.");
                    score++;
                    break;
                } else if (guess < targetNumber) {
                    System.out.println(" Too low!");
                } else {
                    System.out.println(" Too high!");
                }

                if (attempts == maxAttempts) {
                    System.out.println("You've used all your attempts. The number was: " + targetNumber);
                    break;
                }
            }

            System.out.print("\nDo you want to play another round? (yes/no): ");
            scanner.nextLine(); 
            String response = scanner.nextLine().trim().toLowerCase();
            if (!response.equals("yes")) {
                playAgain = false;
            }
        }

        System.out.println("\n🏁 Game Over! Your total score: " + score);
        scanner.close();
    }
}
