import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int secretNumber = rand.nextInt(100) + 1;
        int guess = 0;

        System.out.println("\n--- Number Guessing Game ---");
        while (guess != secretNumber) {
            System.out.print("Guess a number between 1 and 100: ");
            guess = sc.nextInt();

            if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("🎉 Correct! You guessed the number.");
            }git push

        }
        sc.close();
    }
}
