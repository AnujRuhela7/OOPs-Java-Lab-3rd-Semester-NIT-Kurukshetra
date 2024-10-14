package exp7;

// Base class
class Base {
    // Non-default constructor in Base class
    public Base(String message) {
        System.out.println("Base class constructor called with message: " + message);
    }
}

// Derived class
class Derived extends Base {
    // Default (no-arg) constructor for Derived class
    public Derived() {
        super("Default call from Derived");  // Calling the base class constructor
        System.out.println("Derived class no-arg constructor called");
    }

    // Non-default constructor for Derived class
    public Derived(String message) {
        super(message);  // Calling the base class constructor with the passed message
        System.out.println("Derived class constructor called with message: " + message);
    }
}

// Test class
public class Program2 {
    public static void main(String[] args) {
        // Create an object using the default constructor of Derived class
        System.out.println("Creating object using default constructor:");
        Derived obj1 = new Derived();

        // Create an object using the non-default constructor of Derived class
        System.out.println("\nCreating object using non-default constructor:");
        Derived obj2 = new Derived("Custom message from Derived");
    }
}