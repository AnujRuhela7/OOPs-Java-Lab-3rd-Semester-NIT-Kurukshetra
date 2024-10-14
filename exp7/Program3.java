package exp7;

// Base class
class BaseClass {
    // First overloaded method
    public void display(int a) {
        System.out.println("BaseClass display method with int argument: " + a);
    }

    // Second overloaded method
    public void display(double a) {
        System.out.println("BaseClass display method with double argument: " + a);
    }

    // Third overloaded method
    public void display(String message) {
        System.out.println("BaseClass display method with String argument: " + message);
    }
}

// Derived class that inherits BaseClass
class DerivedClass extends BaseClass {
    // New overloaded method in the derived class
    public void display(boolean flag) {
        System.out.println("DerivedClass display method with boolean argument: " + flag);
    }
}

// Test class
public class Program3 {
    public static void main(String[] args) {
        // Create an object of DerivedClass
        DerivedClass derivedObj = new DerivedClass();

        // Call all four versions of the display() method
        derivedObj.display(10);            // Calls the method with int argument
        derivedObj.display(3.14);          // Calls the method with double argument
        derivedObj.display("Hello World"); // Calls the method with String argument
        derivedObj.display(true);          // Calls the method with boolean argument
    }
}