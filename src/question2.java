import java.util.Scanner;
public class question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gallons, mpg, pricePerGallon;


        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input.");
                scanner.next();
            }
            gallons = scanner.nextDouble();
        } while (gallons <= 0);


        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input.");
                scanner.next();
            }
            mpg = scanner.nextDouble();
        } while (mpg <= 0);


        do {
            System.out.print("Enter the price of gas per gallon: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input.");
                scanner.next();
            }
            pricePerGallon = scanner.nextDouble();
        } while (pricePerGallon <= 0);


        double costPer100Miles = (100 / mpg) * pricePerGallon;


        double maxDistance = gallons * mpg;


        System.out.printf("The cost to drive 100 miles: $%.2f\n", costPer100Miles);
        System.out.printf("The car can go about %.2f miles with a full tank.\n", maxDistance);
    }
}
