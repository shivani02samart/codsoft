
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        // Generate a random number between 1 and 100
        Random random = new Random();
        int number = random.nextInt(100) + 1;

        // Prompt the user to enter their guess
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your guess:");
        int guess = scanner.nextInt();

        // Compare the user's guess with the generated number
        while (guess != number) {
            if (guess < number) {
                System.out.println("Your guess is too low.");
            } else {
                System.out.println("Your guess is too high.");
            }

            // Prompt the user to enter their guess again
            System.out.println("Enter your guess:");
            guess = scanner.nextInt();
        }

        // The user guessed the correct number
        System.out.println("Congratulations! You guessed the correct number.");
    }
}
