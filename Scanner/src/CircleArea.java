import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take radius as input
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        // Calculate area
        double area = Math.PI * Math.pow(radius, 2);

        // Display the area
        System.out.println("The area of the circle with radius " + radius + " is " + area);
    }
}