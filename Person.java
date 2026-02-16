// Person.java
// Demonstrates Abstraction in OOP

// Abstract class declaration: cannot be instantiated directly.
// Serves as a blueprint for subclasses that extend Person.
public abstract class Person {

    // Protected field: accessible within this class and its subclasses.
    protected String name;

    // Constructor: initializes the 'name' field when a Person object is created.
    public Person(String name) {
        this.name = name;
    }

    // Getter method: returns the current value of 'name'.
    public String getName() {
        return name;
    }

    // Setter method: allows updating the value of 'name'.
    public void setName(String name) {
        this.name = name;
    }

    // Abstract method: must be implemented by subclasses.
    // Defines a contract that all concrete subclasses must fulfill.
    public abstract void displayDetails();
}
