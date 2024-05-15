import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minnum = 1;
        int maxnum = 100;
        int maxAttempts = 10; 
        int score = 0; 
        System.out.println("Welcome to the Number Guessing Game!");
        boolean playgameAgain;
        do {
            int randomnum = random.nextInt(maxnum - minnum + 1) + minnum;
            int attempts = 0;
            int guess;
            System.out.println("Hey,I have selected a number in between " + minnum + " and " + maxnum + ". It's your turn to guess the number. Goodluck :D ");
            System.out.println("You have " + maxAttempts + " attempts.");
            do {
                System.out.print("Enter your guess: ");
                guess = scanner.nextInt();
                attempts++;
                if (guess < randomnum) {
                    System.out.println("Your guess is too low! Please try again.");
                } else if (guess > randomnum) {
                    System.out.println("Your guess is too high! Please try again.");
                } 
                else {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    score += calculateScore(attempts);
                    break;
                }
                if (attempts == maxAttempts) {
                    System.out.println("Sorry, you've reached the maximum number of attempts.");
                    break;
                }
            } while (true);
            System.out.println("Your current score: " + score);
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.next();
            playgameAgain = playAgainInput.equalsIgnoreCase("yes");
        } while (playgameAgain);
           scanner.close();
    }
    public static int calculateScore(int attempts) {
        if (attempts == 1) {
            return 100; 
        } else {
            return 100 / attempts;
        }
    }
}
