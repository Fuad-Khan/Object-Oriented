import java.util.Scanner;

public class SumTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take first number as input
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        // Take second number as input
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        // Calculate sum
        int sum = num1 + num2;

        // Display the sum
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
    }
}