import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius, fahrenheit;

        while (true) {
            System.out.print("Enter temp in Celsius: ");
            if (scanner.hasNextDouble()) {
                celsius = scanner.nextDouble();
                fahrenheit = (celsius * 9 / 5) + 32;
                System.out.printf("The temp in fahrenheit: %.2f°F\n", fahrenheit);
                break;
            } else {
                System.out.println("Invalid input.");

            }
        }
    }
}