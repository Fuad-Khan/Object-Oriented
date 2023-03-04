import java.util.Scanner;

public class PersonalInformation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take name as input
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        // Take age as input
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        input.nextLine(); // consume the remaining newline character

        // Take CGPA as input
        System.out.print("Enter your CGPA: ");
        double cgpa = input.nextDouble();
        input.nextLine(); // consume the remaining newline character

        // Take department as input
        System.out.print("Enter your department: ");
        String department = input.nextLine();

        // Take section as input
        System.out.print("Enter your section: ");
        String section = input.nextLine();

        // Display the information
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Department: " + department);
        System.out.println("Section: " + section);
    }
}