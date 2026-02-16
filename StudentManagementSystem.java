import java.util.Scanner;

public class StudentManagementSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Enter Student Name: ");
        String name = input.nextLine();

        System.out.print("Enter Course: ");
        String course = input.nextLine();

        System.out.print("Enter Marks: ");
        int marks = input.nextInt();

        Student student1 = new Student(id, name, course, marks);

        System.out.println("\n--- STUDENT DETAILS ---");
        student1.displayDetails();

        input.close();
    }
}
