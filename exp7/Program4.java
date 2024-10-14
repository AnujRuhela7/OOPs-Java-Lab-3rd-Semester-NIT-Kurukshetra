package exp7;

// Base class with a final method
class FinalMethodClass {
    // Final method that cannot be overridden
    public final void display() {
        System.out.println("This is a final method in FinalMethodClass.");
    }
}

// Derived class that attempts to override the final method
class ChildClass extends FinalMethodClass {
    // Uncommenting the following method will cause a compile-time error
    /*
    @Override
    public void display() {
        System.out.println("Trying to override the final method.");
    }
    */
}

// Final class that cannot be inherited
final class FinalClass {
    public void show() {
        System.out.println("This is a method in a final class.");
    }
}

// Attempting to inherit from a final class will cause a compile-time error
/*
class SubClass extends FinalClass {
    // Inheriting from FinalClass is not allowed
}
*/

public class Program4 {
    public static void main(String[] args) {
        // Create an object of the DerivedClass
        ChildClass derivedObj = new ChildClass();
        derivedObj.display();  // Call the final method

        // Create an object of the FinalClass
        FinalClass finalClassObj = new FinalClass();
        finalClassObj.show();  // Call the method in final class
    }
}