// Student.java
// Demonstrates Inheritance, Encapsulation, and Polymorphism

// Student class extends Person, showing INHERITANCE.
// It inherits the 'name' field and abstract method 'displayDetails' from Person.
public class Student extends Person {

    // Private fields: demonstrate ENCAPSULATION.
    // They can only be accessed or modified through getter and setter methods.
    private int studentId;
    private String course;
    private int marks;

    // Constructor: initializes both inherited 'name' and Student-specific fields.
    public Student(int studentId, String name, String course, int marks) {
        super(name); // Calls the constructor of Person (parent class).
        this.studentId = studentId;
        this.course = course;
        this.marks = marks;
    }

    // Getter and Setter methods: provide controlled access to private fields.
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    // Business logic method: calculates grade based on marks.
    // Demonstrates ENCAPSULATION by keeping logic inside the class.
    public String calculateGrade() {
        if (marks >= 70) return "A";
        else if (marks >= 60) return "B";
        else if (marks >= 50) return "C";
        else return "Fail";
    }

    // Overridden method: demonstrates POLYMORPHISM.
    // Provides a specific implementation of the abstract method from Person.
    @Override
    public void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name); // 'name' inherited from Person
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
        System.out.println("--------------------------");
    }
}
