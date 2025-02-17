import java.util.Random;
import java.util.Scanner;
public class question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(10) + 1;
        int userGuess;


        do {
            System.out.print("Guess a number between 1 and 10: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an number between 1 and 10.");
                scanner.next();
            }
            userGuess = scanner.nextInt();
        } while (userGuess < 1 || userGuess > 10);


        System.out.println("The correct number was: " + randomNumber);
        if (userGuess == randomNumber) {
            System.out.println("On the money ");
        } else if (userGuess < randomNumber) {
            System.out.println("Too low. ");
        } else {

        }
            System.out.println("Too high. ");
        }
}
