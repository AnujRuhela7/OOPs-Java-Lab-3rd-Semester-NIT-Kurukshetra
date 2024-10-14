package exp7;

class A {
    // Default constructor for class A
    public A() {
        System.out.println("Constructor of Class A");
    }
}

class B {
    // Default constructor for class B
    public B() {
        System.out.println("Constructor of Class B");
    }
}

class C extends A {
    // Class C inherits from A and has a member of class B
    B b = new B(); // Composition: an object of class B is created inside class C

    // No constructor for class C is defined, so the default constructor is used
}

public class Program1 {
    public static void main(String[] args) {
        // Create an object of class C
        C cObject = new C();
    }
}