import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("You have 5 chances to guess the correct number.");
        System.out.println("Please select the difficulty level:");
        System.out.println("1. Easy (10 chances)");
        System.out.println("2. Medium (5 chances)");
        System.out.println("3. Hard (3 chances)");

        System.out.print("Enter your choice: ");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Great! You have selected the Easy difficulty level.");
                guessNumber(10);
                break;
            case 2:
                System.out.println("Great! You have selected the Medium difficulty level.");
                guessNumber(5);
                break;
            case 3:
                System.out.println("Great! You have selected the Hard difficulty level.");
                guessNumber(3);
                break;
        }

    }
    private static void guessNumber(int x) {
        System.out.println("Lets start the game!");
        int targetNumber = (int) (Math.random() * 100) + 1;

        for(int i=1; i<=x; i++) {
            System.out.print("Enter your guess: ");
            Scanner number = new Scanner(System.in);
            int n = number.nextInt();

            if (n == targetNumber) {
                System.out.println(String.format("Congratulations! You guessed the correct number in %d attempts.",i ));
                break;
            } else if (n < targetNumber) {
                System.out.println(String.format("Incorrect! The number is greater than %d.", n));
            } else if (n > targetNumber) {
                System.out.println(String.format("Incorrect! The number is less than %d.", n));
            }
        }
    }

}