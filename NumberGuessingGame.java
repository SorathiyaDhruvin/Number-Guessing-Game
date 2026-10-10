import java.util.Scanner;

public class NumberGuessingGame {

    public static void playNumberGuessingGame() {
        Scanner sc = new Scanner(System.in);
        // Generate random number between 1 and 100
        int generatedNumber = 1 + (int) (100 * Math.random());
        int maxAttempts = 5;

        System.out.println("================================================");
        System.out.println("       🎯 Welcome to Number Guessing Game       ");
        System.out.println("================================================");
        System.out.println("I have chosen a number between 1 and 100.");
        System.out.println("You have " + maxAttempts + " attempts to guess it. Good luck!\n");

        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.print("Attempt " + attempt + "/" + maxAttempts + " -> Enter your guess: ");

            // Input validation
            while (!sc.hasNextInt()) {
                System.out.println("⚠️ Invalid input! Please enter a valid number (1 - 100).");
                System.out.print("Attempt " + attempt + "/" + maxAttempts + " -> Enter your guess: ");
                sc.next();
            }

            int guessNumber = sc.nextInt();

            if (guessNumber == generatedNumber) {
                System.out.println("\n🎉 Congratulations! You guessed the correct number (" + generatedNumber + ") in " + attempt + " attempts!");
                System.out.println("🏆 You won the game!");
                sc.close();
                return;
            } else if (guessNumber < generatedNumber) {
                System.out.println("📉 Too low! The target number is greater than " + guessNumber + ".\n");
            } else {
                System.out.println("📈 Too high! The target number is less than " + guessNumber + ".\n");
            }
        }

        System.out.println("================================================");
        System.out.println("❌ You have exhausted all attempts!");
        System.out.println("The correct number was: " + generatedNumber);
        System.out.println("Better luck next time!");
        System.out.println("================================================");
        sc.close();
    }

    public static void main(String[] args) {
        playNumberGuessingGame();
    }
}