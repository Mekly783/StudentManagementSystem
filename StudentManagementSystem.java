// Main class
// Handles user input and runs the application
import java.util.Scanner;

public class StudentManagementSystem {

    public static void main(String[] args) {

        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);

        // Prompt user for student details
        System.out.print("Enter Student ID: ");
        int id = input.nextInt();   // Reads integer input
        input.nextLine();           // Consumes leftover newline

        System.out.print("Enter Student Name: ");
        String name = input.nextLine(); // Reads string input

        System.out.print("Enter Course: ");
        String course = input.nextLine(); // Reads string input

        System.out.print("Enter Marks: ");
        int marks = input.nextInt(); // Reads integer input

        // Create a Student object using the provided details
        Student student1 = new Student(id, name, course, marks);

        // Display student details using polymorphism
        System.out.println("\n--- STUDENT DETAILS ---");
        student1.displayDetails();

        // Close the Scanner to free resources
        input.close();
    }
}
