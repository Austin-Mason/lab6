import java.util.Scanner;
public class question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width, height;


        do {
            System.out.print("Enter the width of the rectangle: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input.");
                scanner.next(); // Clear invalid input
            }
            width = scanner.nextDouble();
        } while (width <= 0);


        do {
            System.out.print("Enter the height of the rectangle: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. ");
                scanner.next();
            }
            height = scanner.nextDouble();
        } while (height <= 0);


        double area = width * height;
        double perimeter = 2 * (width + height);


        System.out.printf("Area of the rectangle: %.2f\n", area);
        System.out.printf("Perimeter of the rectangle: %.2f\n", perimeter);
    }
}
