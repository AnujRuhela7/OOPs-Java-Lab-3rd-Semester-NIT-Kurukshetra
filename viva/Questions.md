### 1. **What is method overloading?**
**Answer**: Method overloading allows a class to have more than one method with the same name, but different parameter lists.
**Evaluation**:
- Correct answer with example: 5 points
- Partial explanation: 3 points
- Incorrect: 0 points

### 2. **What is method overriding?**
**Answer**: Method overriding allows a subclass to provide a specific implementation of a method already defined in its superclass.
**Evaluation**:
- Correct explanation: 5 points
- Partial understanding: 3 points
- Incorrect: 0 points

### 3. **What is the `this` keyword in Java?**
**Answer**: The `this` keyword refers to the current object instance within a method or constructor.
**Evaluation**:
- Correct explanation: 5 points
- Partial: 3 points
- Incorrect: 0 points

### 4. **What is a constructor?**
**Answer**: A constructor is a special method used to initialize objects. It is called when an object of a class is created.
**Evaluation**:
- Correct answer with example: 5 points
- Partial: 3 points
- Incorrect: 0 points

### 5. **What is a default constructor?**
**Answer**: A default constructor is provided by Java if no constructor is explicitly defined in the class. It initializes object members to default values.
**Evaluation**:
- Full answer: 5 points
- Partial understanding: 3 points
- Incorrect: 0 points

### 6. **Explain static keyword in Java.**
**Answer**: The `static` keyword is used for memory management. It can be applied to variables, methods, blocks, and nested classes, and makes them belong to the class rather than any object instance.
**Evaluation**:
- Correct explanation: 5 points
- Incomplete understanding: 3 points
- Incorrect: 0 points

### 7. **What is the difference between static and instance variables?**
**Answer**: Static variables belong to the class, while instance variables belong to instances of the class (objects).
**Evaluation**:
- Clear distinction with examples: 5 points
- Partial explanation: 3 points
- Incorrect: 0 points

### 8. **What is an interface in Java?**
**Answer**: An interface is a reference type in Java, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types.
**Evaluation**:
- Correct explanation with examples: 5 points
- Partial: 3 points
- Incorrect: 0 points

### 9. **Difference between an abstract class and an interface?**
**Answer**: Abstract classes can have method implementations and member variables, while interfaces cannot (pre-Java 8). Interfaces support multiple inheritance, abstract classes don't.
**Evaluation**:
- Clear difference with examples: 5 points
- Incomplete: 3 points
- Incorrect: 0 points


### 10. **What are the rules for method overriding?**
**Answer**: The method must have the same name, return type, and parameters as in the parent class, and it must be declared in a subclass.
**Evaluation**:
- Full answer: 5 points
- Partial: 3 points
- Incorrect: 0 points


### 11. **What is an exception in Java?**
**Answer**: An exception is an event that disrupts the normal flow of the program. Java uses try-catch blocks to handle exceptions.
**Evaluation**:
- Correct answer: 5 points
- Partial: 3 points
- Incorrect: 0 points


### 12. **What is the difference between checked and unchecked exceptions?**
**Answer**: Checked exceptions are checked at compile-time, while unchecked exceptions occur at runtime.
**Evaluation**:
- Clear distinction: 5 points
- Incomplete: 3 points
- Incorrect: 0 points


### 13. **What is the `super` keyword in Java?**
**Answer**: The `super` keyword refers to the parent class's objects, constructors, or methods.
**Evaluation**:
- Full understanding: 5 points
- Partial: 3 points
- Incorrect: 0 points

### 14. **What is the role of the `final` keyword?**
**Answer**: `final` can be used with variables (constant values), methods (cannot be overridden), and classes (cannot be extended).
**Evaluation**:
- Correct explanation with examples: 5 points
- Partial: 3 points
- Incorrect: 0 points


### 15. **What is garbage collection in Java?**
**Answer**: Garbage collection is an automatic memory management process that removes objects no longer in use.
**Evaluation**:
- Correct explanation: 5 points
- Partial: 3 points
- Incorrect: 0 points

### 16. **What is the difference between `==` and `.equals()` in Java?**
**Answer**: `==` checks for reference equality, while `.equals()` checks for value equality.
**Evaluation**:
- Full answer with examples: 5 points

### Medium Level

Here are 20 additional medium-level difficulty questions with answers for the Java OOP lab practical and viva:

### 17. **Can a constructor be final in Java? Why or why not?**
**Answer**: No, a constructor cannot be declared as `final` because constructors are not inherited in Java. The `final` keyword is used to prevent a method from being overridden, but constructors cannot be overridden.
**Evaluation**:
- Clear explanation: 5 points
- Partial: 3 points
- Incorrect: 0 points

### 18. **Explain Singleton Class in Java.**

A **Singleton Class** is a design pattern that ensures a class has **only one instance** throughout the application's lifecycle and provides a **global point of access** to that instance. This is particularly useful for managing shared resources such as configuration settings, logging, or connection pools.

---

### Key Characteristics

1. **Single Instance**: Only one instance of the class is created.
2. **Global Access Point**: Provides a global point of access to the instance.
3. **Controlled Instantiation**: Prevents other classes from creating new instances.
4. **Lazy or Eager Initialization**: Can be instantiated when needed (lazy) or at the time of class loading (eager).

---

### Why Use Singleton Pattern?

- **Resource Management**: Ensures controlled access to shared resources.
- **Consistency**: Maintains a consistent state across the application.
- **Performance**: Reduces memory footprint by limiting the number of instances.
       

### 19. **What is the difference between abstract classes and concrete classes?**
**Answer**: Abstract classes cannot be instantiated and may have abstract methods without implementations. Concrete classes can be instantiated and must implement all abstract methods if they extend an abstract class.
**Evaluation**:
- Clear distinction with examples: 5 points
- Partial: 3 points
- Incorrect: 0 points

### 20. **How does Java handle multiple inheritance?**
**Multiple Inheritance** refers to a feature where a class can inherit characteristics and behaviors from more than one parent class. While multiple inheritance is a common feature in some programming languages (like C++), Java **does not support multiple inheritance of classes**. However, Java achieves similar functionality through **interfaces**.

---

#### Why Java Doesn't Support Multiple Inheritance of Classes

1. **Diamond Problem**:
   - **Definition**: Ambiguity arises when two parent classes have methods with the same signature, leading to uncertainty about which method the child class should inherit.
   - **Example**:
     ```java
     class A {
         void display() { System.out.println("Class A"); }
     }

     class B extends A {
         void display() { System.out.println("Class B"); }
     }

     class C extends A {
         void display() { System.out.println("Class C"); }
     }

     // If Java allowed:
     class D extends B, C { // Compilation Error
         // Which display() to inherit?
     }
     ```
   - **Issue**: The compiler cannot determine whether `D` should inherit `display()` from `B` or `C`.

2. **Simplicity and Maintainability**:
   - Avoiding multiple inheritance reduces complexity, making the language easier to understand and maintain.

---

#### How Java Achieves Multiple Inheritance Through Interfaces

While Java doesn't allow a class to inherit from multiple classes, it **allows a class to implement multiple interfaces**, effectively achieving multiple inheritance of type.

#### **Interfaces in Java**

- **Definition**: An interface is a reference type in Java, similar to a class, that can contain abstract methods (methods without a body), default methods (with a body), static methods, and constants.
- **Purpose**: To define a contract that implementing classes must follow, promoting abstraction and polymorphism.

#### **Implementing Multiple Interfaces**

A Java class can implement multiple interfaces using the `implements` keyword, separated by commas.

**Example:**

```java
interface Printable {
    void print();
}

interface Showable {
    void show();
}

public class Document implements Printable, Showable {
    @Override
    public void print() {
        System.out.println("Printing document...");
    }

    @Override
    public void show() {
        System.out.println("Showing document...");
    }

    public static void main(String[] args) {
        Document doc = new Document();
        doc.print(); // Outputs: Printing document...
        doc.show();  // Outputs: Showing document...
    }
}
```

**Explanation:**

- `Document` class implements both `Printable` and `Showable` interfaces.
- It provides concrete implementations for both `print()` and `show()` methods.

#### **Handling Default Methods in Interfaces**

Java 8 introduced **default methods** in interfaces, allowing interfaces to provide method implementations. This addition brought back some complexity similar to multiple inheritance, which Java addresses with specific rules.

**Example:**

```java
interface A {
    default void greet() {
        System.out.println("Hello from Interface A");
    }
}

interface B {
    default void greet() {
        System.out.println("Hello from Interface B");
    }
}

public class C implements A, B {
    // Must override greet() to resolve conflict
    @Override
    public void greet() {
        // Option 1: Choose one interface's method
        A.super.greet();

        // Option 2: Provide a new implementation
        // System.out.println("Hello from Class C");
    }

    public static void main(String[] args) {
        C obj = new C();
        obj.greet(); // Outputs: Hello from Interface A
    }
}
```

**Rules for Default Methods:**

1. **Conflict Resolution**:
   - If a class implements multiple interfaces that have the same default method, the class **must override** the method to resolve the conflict.

2. **Preference Order**:
   - **Class methods** take precedence over interface default methods.
   - **Subinterfaces** take precedence over superinterfaces.

**Example:**

```java
interface Parent {
    default void show() { System.out.println("Parent"); }
}

interface Child extends Parent {
    default void show() { System.out.println("Child"); }
}

public class Test implements Parent, Child {
    // No need to override show() because Child's show() takes precedence
    public static void main(String[] args) {
        Test t = new Test();
        t.show(); // Outputs: Child
    }
}
```

---

#### Comparison: Multiple Inheritance vs. Interfaces in Java

| **Aspect**               | **Multiple Inheritance (Classes)** | **Multiple Inheritance (Interfaces)**        |
|--------------------------|------------------------------------|----------------------------------------------|
| **Support in Java**     | Not Supported                      | Supported via implementing multiple interfaces |
| **Method Implementation**| Can lead to ambiguity (Diamond Problem) | Resolved using default methods and explicit overrides |
| **Flexibility**         | Less flexible due to single inheritance | More flexible, allows combining multiple behaviors |
| **Complexity**          | Higher complexity and maintenance issues | Lower complexity, promotes cleaner design      |
| **Use Cases**            | Typically avoided in Java design  | Ideal for defining contracts and capabilities  |

---

#### Advantages of Using Interfaces for Multiple Inheritance

1. **Avoids Diamond Problem**:
   - Clear rules for resolving method conflicts prevent ambiguity.

2. **Promotes Loose Coupling**:
   - Interfaces define capabilities without enforcing a strict class hierarchy.

3. **Enhances Flexibility and Reusability**:
   - Classes can adopt multiple behaviors by implementing multiple interfaces.

4. **Supports Polymorphism**:
   - Objects can be treated as instances of multiple types based on the interfaces they implement.

---

#### Key Takeaways

- **Java does not support multiple inheritance of classes** to maintain simplicity and avoid ambiguity.
- **Multiple inheritance is achieved through interfaces**, allowing a class to implement multiple interfaces and inherit their abstract and default methods.
- **Default methods in interfaces** provide a way to include method implementations, but Java enforces rules to resolve conflicts when multiple interfaces define methods with the same signature.
- **Using interfaces for multiple inheritance** promotes a more flexible and maintainable design, aligning with Java’s emphasis on strong type safety and clear contracts.

Understanding how Java handles multiple inheritance through interfaces is essential for designing robust and scalable object-oriented applications.


### 21. **What is the `finalize()` method in Java?**
**Answer**: The `finalize()` method is called by the garbage collector on an object before memory is reclaimed. It is used for cleanup operations.
**Evaluation**:
- Correct explanation: 5 points
- Partial: 3 points
- Incorrect: 0 points

### 22. **Can an interface in Java extend another interface?**
**Answer**: Yes, an interface can extend one or more other interfaces. This allows for inheritance of abstract methods.
**Evaluation**:
- Correct answer: 5 points
- Partial: 3 points
- Incorrect: 0 points

### 23. **What is the use of `instanceof` keyword in Java?**
**Answer**: The `instanceof` keyword is used to check whether an object is an instance of a specific class or subclass.
**Evaluation**:
- Correct explanation with example: 5 points
- Partial: 3 points
- Incorrect: 0 points

### 24. **What is the difference between an abstract class and a regular class?**
**Answer**: An abstract class cannot be instantiated and may contain abstract methods that must be implemented by subclasses, whereas a regular class can be instantiated and contain fully implemented methods.
**Evaluation**:
- Clear distinction: 5 points
- Partial: 3 points
- Incorrect: 0 points

### 25. **What is a functional interface in Java?**
A **functional interface** in Java is an interface that contains **exactly one abstract method**. Functional interfaces serve as the foundation for lambda expressions and method references introduced in Java 8, enabling functional programming paradigms within Java’s object-oriented framework.

---

### Key Characteristics

1. **Single Abstract Method (SAM)**:
   - Must have exactly one abstract method.
   - This single abstract method defines the contract for the functional interface.

2. **Default and Static Methods**:
   - Can include multiple `default` and `static` methods.
   - These do not count as abstract methods and thus do not violate the SAM rule.

3. **@FunctionalInterface Annotation**:
   - Optional but recommended.
   - Signals intent to be a functional interface.
   - Causes a compile-time error if the interface does not satisfy the SAM criteria.

4. **Inheritance**:
   - Can extend other interfaces, but the total number of abstract methods must remain one.

---

### Purpose and Use Cases

- **Lambda Expressions**: Functional interfaces enable the use of lambda expressions, providing a concise way to implement single-method interfaces.
- **Method References**: Allow referencing existing methods or constructors as implementations for functional interfaces.
- **Stream API**: Widely used in Java’s Stream API for operations like `map`, `filter`, and `forEach`.
- **Event Handling**: Simplify event listener implementations by reducing boilerplate code.

---

### Examples

#### 1. **Creating a Functional Interface**

**Using @FunctionalInterface Annotation**:

```java
@FunctionalInterface
public interface MyFunctionalInterface {
    void execute(); // Single abstract method

    // Optional: default method
    default void defaultMethod() {
        System.out.println("Default Method");
    }

    // Optional: static method
    static void staticMethod() {
        System.out.println("Static Method");
    }
}
```

**Without Annotation**:

```java
public interface MyFunctionalInterface {
    void execute(); // Single abstract method

    // Optional: default and static methods
    default void defaultMethod() {
        System.out.println("Default Method");
    }

    static void staticMethod() {
        System.out.println("Static Method");
    }
}
```

#### 2. **Using Lambda Expressions with Functional Interfaces**

```java
public class LambdaExample {
    public static void main(String[] args) {
        // Using lambda expression to implement MyFunctionalInterface
        MyFunctionalInterface func = () -> System.out.println("Executing lambda expression");
        
        func.execute(); // Outputs: Executing lambda expression

        // Calling default method
        func.defaultMethod(); // Outputs: Default Method

        // Calling static method
        MyFunctionalInterface.staticMethod(); // Outputs: Static Method
    }
}
```

#### 3. **Common Built-in Functional Interfaces**

Java provides several built-in functional interfaces in the `java.util.function` package:

- **Predicate<T>**: Represents a boolean-valued function of one argument.
  ```java
  Predicate<Integer> isEven = (n) -> n % 2 == 0;
  System.out.println(isEven.test(4)); // Outputs: true
  ```

- **Function<T, R>**: Represents a function that accepts one argument and produces a result.
  ```java
  Function<String, Integer> stringLength = (s) -> s.length();
  System.out.println(stringLength.apply("Hello")); // Outputs: 5
  ```

- **Consumer<T>**: Represents an operation that accepts a single input argument and returns no result.
  ```java
  Consumer<String> print = (s) -> System.out.println(s);
  print.accept("Hello, World!"); // Outputs: Hello, World!
  ```

- **Supplier<T>**: Represents a supplier of results, providing a value without taking any input.
  ```java
  Supplier<Double> randomValue = () -> Math.random();
  System.out.println(randomValue.get()); // Outputs a random number
  ```

- **UnaryOperator<T>**: A specialization of `Function` for the case where the input and output types are the same.
  ```java
  UnaryOperator<Integer> square = (n) -> n * n;
  System.out.println(square.apply(5)); // Outputs: 25
  ```

---

### Best Practices

1. **Use @FunctionalInterface Annotation**:
   - Helps to clearly indicate the intent.
   - Provides compile-time checking to ensure the interface adheres to the functional interface contract.

2. **Keep It Simple**:
   - Ensure the interface has only one abstract method to maintain clarity and usability with lambda expressions.

3. **Leverage Existing Functional Interfaces**:
   - Prefer using built-in functional interfaces (`Predicate`, `Function`, `Consumer`, etc.) from `java.util.function` to reduce the need for custom interfaces.

4. **Avoid Multiple Inheritance of Abstract Methods**:
   - When extending multiple interfaces, ensure only one abstract method is inherited to maintain SAM compliance.

5. **Use Meaningful Method Names**:
   - Abstract methods should have descriptive names that convey their purpose, enhancing code readability.

---

### Common Mistakes

1. **Multiple Abstract Methods**:
   - Defining more than one abstract method violates the SAM rule, causing a compile-time error when using the `@FunctionalInterface` annotation.

   ```java
   @FunctionalInterface
   public interface InvalidFunctionalInterface {
       void methodOne();
       void methodTwo(); // Compile-time error
   }
   ```

2. **Incorrect Lambda Syntax**:
   - Providing a lambda expression that doesn’t match the abstract method’s signature.

   ```java
   MyFunctionalInterface func = (a, b) -> System.out.println(a + b); // Error: execute() expects no parameters
   ```

3. **Misusing Default Methods**:
   - Relying on default methods to add additional abstract methods, breaking the functional interface contract.

---

### Functional Interface vs. Regular Interface

| **Aspect**              | **Functional Interface**                        | **Regular Interface**                              |
|-------------------------|-------------------------------------------------|----------------------------------------------------|
| **Abstract Methods**   | Exactly one abstract method (SAM)              | Zero or more abstract methods                     |
| **Purpose**            | Designed for use with lambda expressions and method references | General-purpose contracts for classes             |
| **Annotation**         | Often annotated with @FunctionalInterface      | Not necessarily annotated                           |
| **Usage**              | Enables functional programming features         | Defines contracts for diverse implementations      |

---

### Conclusion

A **functional interface** is a powerful feature in Java that bridges object-oriented and functional programming paradigms. By defining interfaces with a single abstract method, Java enables the use of lambda expressions and method references, leading to more concise, readable, and maintainable code. Leveraging functional interfaces effectively can enhance the flexibility and expressiveness of your Java applications, especially when working with APIs like the Stream API and event-driven programming.

Understanding and utilizing functional interfaces is essential for modern Java development, fostering cleaner code and promoting functional programming techniques within the Java ecosystem.

### 26. **What is an anonymous class in Java?**
**Answer**: An anonymous class is a class without a name that is declared and instantiated all at once. It is used when a short-lived object is needed.
**Evaluation**:
- Correct explanation with examples: 5 points
- Partial: 3 points
- Incorrect: 0 points

### 27. **What is method hiding in Java?**
**Answer**: Method hiding occurs when a subclass defines a static method with the same signature as a static method in the superclass. It hides the superclass method rather than overriding it.
**Evaluation**:
- Correct answer: 5 points
- Partial: 3 points
- Incorrect: 0 points

### 28. **What is the difference between the `equals()` method and the `hashCode()` method?**
**Answer**: The `equals()` method checks for equality of two objects, while `hashCode()` returns an integer representation of the object. Objects that are equal must have the same hashCode.
**Evaluation**:
- Full explanation: 5 points
- Partial: 3 points
- Incorrect: 0 points


### Evaluation Criteria Summary:
- **5 Points**: Clear and complete understanding with examples when required.
- **3 Points**: Partial understanding or incomplete explanation.
- **0 Points**: Incorrect or no answer.


### 29. **Explain basic pillar of OOPs in Java.**

In Java, the basic pillars of Object-Oriented Programming (OOP) are encapsulation, inheritance, polymorphism, and abstraction. Here's a brief explanation of each:

1. **Encapsulation**: Encapsulation refers to bundling data (attributes) and methods (functions) that operate on the data into a single unit called a class. It helps in hiding the internal state of an object from the outside world and only exposing the necessary parts. This is achieved using access modifiers like `private`, `protected`, `public`, etc., to control access to the class members.

2. **Inheritance**: Inheritance allows one class (subclass or derived class) to inherit the properties and behaviors (methods) of another class (superclass or base class). It promotes code reusability and allows the creation of a hierarchical classification. In Java, inheritance is implemented using the `extends` keyword.

3. **Polymorphism**: Polymorphism means "many forms." It allows objects of different classes to be treated as objects of a common superclass. There are two types of polymorphism in Java:
    - **Compile-time polymorphism (Method Overloading)**: It occurs when there are multiple methods with the same name but different parameters in the same class.
    - **Run-time polymorphism (Method Overriding)**: It occurs when a subclass provides a specific implementation of a method that is already provided by its superclass.

4. **Abstraction**: Abstraction is the process of hiding the implementation details and showing only the essential features of an object. It focuses on what an object does rather than how it does it. In Java, abstraction is achieved using abstract classes and interfaces. Abstract classes may have abstract methods (methods without a body) that must be implemented by subclasses. Interfaces define a contract that implementing classes must follow.

These pillars together form the foundation of Java's object-oriented programming paradigm, enabling modular, scalable, and maintainable code.

### 30. **Explain about access modifiers w.r.t Java.**
In Java, **access modifiers** are keywords that set the accessibility (visibility) of classes, methods, and other members. They play a crucial role in implementing **encapsulation**, one of the core pillars of Object-Oriented Programming (OOP). By controlling access levels, access modifiers help in protecting the internal state of objects and defining clear interfaces for interaction.

Java provides four primary access modifiers:

1. **`private`**
2. **`default`** (also known as package-private)
3. **`protected`**
4. **`public`**

Additionally, Java offers two other modifiers, **`static`** and **`final`**, which are not access modifiers but often discussed in the context of class members' accessibility and behavior.

### 1. `private`

- **Visibility**: The member is accessible **only within the class** it is declared.
- **Usage**: Typically used to restrict access to fields (variables) to ensure they cannot be modified directly from outside the class. This promotes encapsulation by forcing external code to use getter and setter methods to interact with the fields.

**Example:**
```java
public class Person {
    private String name; // private field

    // public getter method
    public String getName() {
        return name;
    }

    // public setter method
    public void setName(String name) {
        this.name = name;
    }
}
```

### 2. `default` (Package-Private)

- **Visibility**: If no access modifier is specified, the member is accessible **only within its own package**.
- **Usage**: Useful for grouping related classes and allowing them to interact closely without exposing details to the outside world.

**Example:**
```java
class Employee { // default access
    void displayDetails() { // default access method
        System.out.println("Employee Details");
    }
}
```

### 3. `protected`

- **Visibility**: The member is accessible within its own package (like default) **and** by subclasses **in other packages**.
- **Usage**: Primarily used to allow controlled access to class members for subclasses, facilitating inheritance while still restricting access from unrelated classes.

**Example:**
```java
public class Animal {
    protected void makeSound() { // protected method
        System.out.println("Some sound");
    }
}

public class Dog extends Animal {
    @Override
    protected void makeSound() {
        System.out.println("Bark");
    }
}
```

### 4. `public`

- **Visibility**: The member is accessible **from any other class** in any package.
- **Usage**: Used for members that need to be accessible globally, such as API methods, constants, or classes intended for wide use.

**Example:**
```java
public class Calculator {
    public int add(int a, int b) { // public method
        return a + b;
    }
}
```

### Summary of Access Levels

Here's a table summarizing the accessibility of each modifier across different contexts:

| Modifier   | Same Class | Same Package | Subclass (Different Package) | Everywhere |
|------------|------------|--------------|-------------------------------|------------|
| `private`  | ✔️         | ❌           | ❌                            | ❌         |
| `default`  | ✔️         | ✔️           | ❌                            | ❌         |
| `protected`| ✔️         | ✔️           | ✔️                            | ❌         |
| `public`   | ✔️         | ✔️           | ✔️                            | ✔️         |

### Applying Access Modifiers to Different Members

1. **Classes:**
    - **Top-level classes** can only be `public` or default.
    - **Nested (inner) classes** can use all four access modifiers.

   **Example:**
   ```java
   // Top-level public class
   public class OuterClass {
       // Nested private class
       private class InnerClass {
           // ...
       }
   }

   // Top-level default class
   class PackagePrivateClass {
       // ...
   }
   ```

2. **Methods and Variables:**
    - Can be `private`, `default`, `protected`, or `public`.
    - Choice depends on how much you want to expose the member to other parts of the application.

   **Example:**
   ```java
   public class Vehicle {
       private String vin; // Accessible only within Vehicle
       String model;       // Accessible within the package
       protected int year;  // Accessible within the package and subclasses
       public String type;  // Accessible everywhere

       private void setVin(String vin) { /* ... */ }
       void setModel(String model) { /* ... */ }
       protected void setYear(int year) { /* ... */ }
       public void setType(String type) { /* ... */ }
   }
   ```

### Best Practices for Using Access Modifiers

1. **Encapsulate Fields:**
    - Always declare class fields as `private` and provide `public` getter and setter methods if external access is necessary. This protects the integrity of the data.

2. **Use the Least Restrictive Access Level:**
    - Start with the most restrictive access and increase it only if necessary. This minimizes the risk of unintended interactions between classes.

3. **Leverage `protected` Wisely:**
    - Use `protected` for methods and variables that are intended to be used or overridden by subclasses, especially when those subclasses are in different packages.

4. **Public API Design:**
    - Clearly define which classes and methods are part of your public API using the `public` modifier, and keep internal implementation details hidden using `private` or default access.

5. **Package Organization:**
    - Organize related classes into packages and use default access to allow inter-package cooperation without exposing classes to the entire application.

### Example Demonstrating Different Access Modifiers

```java
// File: com/example/base/BaseClass.java
package com.example.base;

public class BaseClass {
    private int privateVar = 1;
    int defaultVar = 2;
    protected int protectedVar = 3;
    public int publicVar = 4;

    private void privateMethod() {
        System.out.println("Private Method");
    }

    void defaultMethod() {
        System.out.println("Default Method");
    }

    protected void protectedMethod() {
        System.out.println("Protected Method");
    }

    public void publicMethod() {
        System.out.println("Public Method");
    }
}
```

```java
// File: com/example/sub/DerivedClass.java
package com.example.sub;

import com.example.base.BaseClass;

public class DerivedClass extends BaseClass {
    public void accessMethods() {
        // System.out.println(privateVar); // Error: privateVar is not accessible
        System.out.println(defaultVar);    // Accessible: same package or subclass
        System.out.println(protectedVar);  // Accessible: subclass
        System.out.println(publicVar);     // Accessible: public

        // privateMethod(); // Error: privateMethod is not accessible
        defaultMethod();    // Accessible: same package or subclass
        protectedMethod();  // Accessible: subclass
        publicMethod();     // Accessible: public
    }
}
```

```java
// File: com/example/other/OtherClass.java
package com.example.other;

import com.example.base.BaseClass;

public class OtherClass {
    public void accessBaseClass() {
        BaseClass base = new BaseClass();
        // System.out.println(base.privateVar); // Error: privateVar is not accessible
        // System.out.println(base.defaultVar); // Error: defaultVar is not accessible
        // System.out.println(base.protectedVar); // Error: protectedVar not accessible without inheritance
        System.out.println(base.publicVar);    // Accessible: public

        // base.privateMethod(); // Error: privateMethod is not accessible
        // base.defaultMethod(); // Error: defaultMethod is not accessible
        // base.protectedMethod(); // Error: protectedMethod not accessible without inheritance
        base.publicMethod();    // Accessible: public
    }
}
```

In the above example:

- `DerivedClass`, which extends `BaseClass`, can access `protected` members of `BaseClass` even though they are in different packages.
- `OtherClass`, which does not extend `BaseClass` and is in a different package, cannot access `private`, `default`, or `protected` members of `BaseClass`.
- Only `public` members are accessible to `OtherClass`.

### Conclusion

Access modifiers in Java are fundamental for enforcing encapsulation, controlling the visibility of classes and their members, and designing robust and maintainable code. By thoughtfully applying these modifiers, developers can create clear boundaries within their applications, protect sensitive data, and promote a well-organized codebase.

### 31. **What is method overloading and method overriding ? What are the conditions for achieving them ?**

In Java's Object-Oriented Programming (OOP) paradigm, **method overloading** and **method overriding** are two fundamental concepts that enable polymorphism, allowing objects to exhibit different behaviors in different contexts. Understanding these concepts is crucial for writing flexible and maintainable code. Below is a detailed explanation of both, along with the conditions required to achieve them.

---

### Method Overloading

**Method Overloading** occurs when multiple methods in the same class share the same name but have different parameters (i.e., different type, number, or order of parameters). Overloading allows a class to perform similar operations with different inputs, enhancing code readability and reusability.

#### Key Characteristics

- **Same Method Name**: All overloaded methods share the same name.
- **Different Parameters**: Methods must differ in the number, type, or order of parameters.
- **Same or Different Return Type**: Return types can be the same or different, but they alone cannot distinguish overloaded methods.
- **Same or Different Access Modifiers**: Access levels can vary.
- **Same Class or Subclass**: Overloading can occur within a single class or between a superclass and a subclass.

#### Conditions for Method Overloading

1. **Different Parameter List**: Methods must have different parameter lists (number, type, or order of parameters).
2. **Same Class**: Overloading is typically performed within the same class, although a subclass can also overload a method from its superclass.
3. **Return Type Irrelevant**: The return type alone cannot be used to distinguish overloaded methods.
4. **Access Modifiers Can Vary**: Overloaded methods can have different access levels.

#### Example of Method Overloading

```java
public class Calculator {
    
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }
    
    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    // Overloaded method to add two double values
    public double add(double a, double b) {
        return a + b;
    }
    
    // Overloaded method with different parameter order
    public double add(int a, double b) {
        return a + b;
    }
}
```

**Usage:**

```java
Calculator calc = new Calculator();

int sum1 = calc.add(2, 3);           // Calls add(int, int)
int sum2 = calc.add(2, 3, 4);        // Calls add(int, int, int)
double sum3 = calc.add(2.5, 3.5);    // Calls add(double, double)
double sum4 = calc.add(2, 3.5);      // Calls add(int, double)
```

#### Benefits of Method Overloading

- **Improves Code Readability**: Using the same method name for similar operations makes the code easier to read and understand.
- **Enhances Flexibility**: Allows methods to handle different types and numbers of inputs without needing distinct method names.
- **Promotes Reusability**: Reduces code duplication by reusing method names for similar functionality.

---

### Method Overriding

**Method Overriding** occurs when a subclass provides a specific implementation for a method that is already defined in its superclass. Overriding enables runtime polymorphism, allowing a subclass to modify or extend the behavior of inherited methods.

#### Key Characteristics

- **Same Method Name**: The method in the subclass has the same name as the one in the superclass.
- **Same Parameter List**: The method signature (name and parameters) must be identical.
- **Same or Covariant Return Type**: The return type must be the same or a subtype (covariant) of the return type in the superclass method.
- **Access Modifiers**: The subclass method cannot have more restrictive access than the superclass method.
- **Not Final or Static**: The method in the superclass must not be declared as `final` or `static`.

#### Conditions for Method Overriding

1. **Inheritance**: There must be an inheritance relationship between the superclass and subclass.
2. **Same Method Signature**: The method in the subclass must have the same name and parameter list as the method in the superclass.
3. **Compatible Return Type**: The return type must be the same or a subtype of the superclass method’s return type.
4. **Access Level**: The overridden method cannot have a more restrictive access level. For example, a `public` method cannot be overridden with a `protected` or `private` method.
5. **Non-Final and Non-Static**: The superclass method must not be declared as `final` or `static`.

#### Example of Method Overriding

```java
// Superclass
public class Animal {
    
    // Method to be overridden
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Subclass
public class Dog extends Animal {
    
    // Overriding the makeSound method
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}
```

**Usage:**

```java
Animal myAnimal = new Animal();
Animal myDog = new Dog();

myAnimal.makeSound(); // Outputs: Some generic animal sound
myDog.makeSound();    // Outputs: Bark
```

#### Benefits of Method Overriding

- **Runtime Polymorphism**: Allows a subclass to define specific behavior while maintaining a common interface.
- **Enhanced Flexibility**: Enables dynamic method dispatch, where the method to be executed is determined at runtime based on the object's actual type.
- **Extensibility**: Facilitates extending existing classes without modifying their code, adhering to the Open/Closed Principle.

---

### Comparison: Method Overloading vs. Method Overriding

| Aspect                  | Method Overloading                               | Method Overriding                             |
|-------------------------|--------------------------------------------------|-----------------------------------------------|
| **Definition**          | Multiple methods with the same name but different parameters within the same class. | Subclass provides a specific implementation of a method already defined in its superclass. |
| **Polymorphism Type**   | Compile-time (Static) Polymorphism               | Runtime (Dynamic) Polymorphism                |
| **Method Signature**    | Must differ in parameter list (number, type, order). | Must have the same method signature.         |
| **Return Type**         | Can be same or different.                        | Must be same or covariant.                    |
| **Access Modifiers**    | Can vary independently.                          | Subclass cannot have more restrictive access. |
| **Inheritance**         | Not required (usually within the same class).    | Requires inheritance (between superclass and subclass). |
| **Usage**               | To perform similar operations with different inputs. | To modify or extend the behavior of inherited methods. |

---

#### Practical Examples

##### Method Overloading Example

```java
public class Display {
    
    // Overloaded method with one parameter
    public void show(String message) {
        System.out.println("Message: " + message);
    }
    
    // Overloaded method with two parameters
    public void show(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Message " + (i + 1) + ": " + message);
        }
    }
    
    // Overloaded method with different parameter types
    public void show(int number) {
        System.out.println("Number: " + number);
    }
}
```

**Usage:**

```java
Display display = new Display();

display.show("Hello");                // Calls show(String)
display.show("Hello", 3);             // Calls show(String, int)
display.show(100);                    // Calls show(int)
```

**Output:**
```
Message: Hello
Message 1: Hello
Message 2: Hello
Message 3: Hello
Number: 100
```

#### Method Overriding Example

```java
// Superclass
public class Vehicle {
    
    public void startEngine() {
        System.out.println("Engine started.");
    }
}

// Subclass
public class Car extends Vehicle {
    
    @Override
    public void startEngine() {
        System.out.println("Car engine started with a key.");
    }
}

// Another Subclass
public class ElectricCar extends Vehicle {
    
    @Override
    public void startEngine() {
        System.out.println("Electric car powered on silently.");
    }
}
```

**Usage:**

```java
Vehicle myVehicle = new Vehicle();
Vehicle myCar = new Car();
Vehicle myElectricCar = new ElectricCar();

myVehicle.startEngine();      // Outputs: Engine started.
myCar.startEngine();          // Outputs: Car engine started with a key.
myElectricCar.startEngine();  // Outputs: Electric car powered on silently.
```

**Output:**
```
Engine started.
Car engine started with a key.
Electric car powered on silently.
```

---

## Common Mistakes and Best Practices

### Common Mistakes

1. **Incorrect Parameter Differences in Overloading**: Changing only the return type without altering the parameter list does not achieve overloading.

   ```java
   // Not valid overloading
   public int compute(int a) { return a; }
   public double compute(int a) { return a; } // Compile-time error
   ```

2. **Mismatched Method Signatures in Overriding**: Changing the parameter list or return type in an attempt to override results in method overloading instead.

   ```java
   // Attempting to override with different parameters (actually overloading)
   @Override
   public void makeSound(String sound) { /* ... */ } // Not valid overriding
   ```

3. **Violating Access Modifier Rules in Overriding**: Making the overridden method more restrictive is not allowed.

   ```java
   // Superclass
   public class Parent {
       public void display() { /* ... */ }
   }
   
   // Subclass
   public class Child extends Parent {
       @Override
       protected void display() { /* ... */ } // Compile-time error
   }
   ```

### Best Practices

1. **Use `@Override` Annotation**: Always use the `@Override` annotation when overriding methods. This helps the compiler catch errors if the method signatures do not match.

   ```java
   @Override
   public void makeSound() {
       // Overridden method
   }
   ```

2. **Maintain Consistent Behavior**: When overriding methods, ensure that the new implementation aligns with the original contract, especially when dealing with APIs and frameworks.

3. **Limit Overloading Complexity**: While overloading enhances flexibility, excessive overloading can make the code harder to read. Use it judiciously.

4. **Use Meaningful Method Names**: Choose method names that clearly indicate their purpose, making overloading more intuitive.

5. **Respect Access Levels**: When overriding, ensure that the access level is not more restrictive to maintain the integrity of the superclass's interface.

---

## Summary

- **Method Overloading** allows multiple methods with the same name but different parameters within the same class or related classes, enabling compile-time polymorphism.

- **Method Overriding** enables a subclass to provide a specific implementation for a method already defined in its superclass, facilitating runtime polymorphism.

Both concepts are essential for creating flexible, maintainable, and scalable Java applications, leveraging the power of OOP to handle varying behaviors and interactions effectively.

### Method Overloading

- **Definition**: Multiple methods in the same class with the same name but different parameters (type, number, or order).
- **Key Points**:
    - Happens within the **same class**.
    - **Different parameter list**, can have the same or different return type.
    - Provides **compile-time** (static) polymorphism.

**Example**:
```java
public class Calculator {
    public int add(int a, int b) { return a + b; }
    public double add(double a, double b) { return a + b; }
}
```

### Method Overriding

- **Definition**: A subclass redefines a method from its superclass with the **same name and parameters**.
- **Key Points**:
    - Requires **inheritance**.
    - **Same method signature** (name, parameters, and return type).
    - Provides **runtime** (dynamic) polymorphism.
    - Overridden method cannot have more restrictive access than the original method.

**Example**:
```java
class Animal {
    public void makeSound() { System.out.println("Animal sound"); }
}
class Dog extends Animal {
    @Override
    public void makeSound() { System.out.println("Bark"); }
}
``` 

### Key Differences

| Feature          | Method Overloading                         | Method Overriding                          |
|------------------|--------------------------------------------|--------------------------------------------|
| **Polymorphism**  | Compile-time                               | Runtime                                    |
| **Parameters**    | Must differ (type, number, or order)       | Must be identical                          |
| **Return Type**   | Can be same or different                   | Must be same or covariant                  |
| **Inheritance**   | Not required                               | Requires inheritance                       |
| **Access Level**  | Can vary                                   | Cannot be more restrictive than superclass |


### 32. **Differentiate between static and instance variable.**
### Static Variable

- **Definition**: A variable that is shared among all instances of a class. It's associated with the class itself, not individual objects.
- **Memory**: Stored in the **class area** (shared memory).
- **Initialization**: Can be initialized once at the time of class loading.
- **Access**: Accessed via the class name (e.g., `ClassName.variableName`).
- **Modification**: Changing a static variable affects all instances of the class.
- **Lifetime**: Exists as long as the class is loaded into memory.

**Example**:
```java
class Example {
    static int count = 0; // Static variable shared by all objects
}
```

### Instance Variable

- **Definition**: A variable that is unique to each instance (object) of a class. Each object maintains its own copy.
- **Memory**: Stored in the **heap memory** as part of the object's memory.
- **Initialization**: Initialized when an object is created, and each object gets its own copy.
- **Access**: Accessed through the object (e.g., `objectName.variableName`).
- **Modification**: Changing an instance variable affects only the specific object it belongs to.
- **Lifetime**: Exists as long as the object exists.

**Example**:
```java
class Example {
    int count = 0; // Instance variable, separate for each object
}
```

### Key Differences

| Feature              | Static Variable                          | Instance Variable                          |
|----------------------|------------------------------------------|--------------------------------------------|
| **Associated With**   | Class (shared by all instances)          | Individual object (each object has its own)|
| **Memory Location**   | Class area                               | Heap memory (within the object)            |
| **Access**            | Via class name (`ClassName.variableName`) | Via object (`objectName.variableName`)     |
| **Lifetime**          | Exists as long as the class is loaded    | Exists as long as the object is alive      |
| **Modification**      | Affects all objects                      | Affects only the specific object           |

### 33. **What is 'static' keyword in java ? What is it use ?**
In Java, the `**static**` keyword is used to indicate that a particular member (variable, method, or block) belongs to the **class** itself, rather than to instances of the class (objects). Static members are shared across all instances of a class, meaning they can be accessed without creating an object of the class.

### Uses of the `static` Keyword

1. **Static Variables**:
    - A static variable is shared among all instances of the class.
    - It is stored in the **class area** and exists as long as the class is loaded.
    - It can be accessed using the class name.

   **Example**:
   ```java
   class Counter {
       static int count = 0; // Static variable shared by all instances
       
       Counter() {
           count++;
       }
   }

   public class Main {
       public static void main(String[] args) {
           Counter c1 = new Counter();
           Counter c2 = new Counter();
           System.out.println(Counter.count); // Outputs: 2
       }
   }
   ```

2. **Static Methods**:
    - Static methods belong to the class and not to any object.
    - They can access other static members (variables and methods) directly.
    - Cannot access non-static instance variables or methods directly, as they belong to instances.

   **Example**:
   ```java
   class Utility {
       static void displayMessage() {
           System.out.println("Static method called!");
       }
   }

   public class Main {
       public static void main(String[] args) {
           Utility.displayMessage(); // Call static method using class name
       }
   }
   ```

3. **Static Block**:
    - A static block is used for static initialization of a class.
    - It gets executed when the class is loaded, before any objects are created.
    - Typically used to initialize static variables.

   **Example**:
   ```java
   class Test {
       static int value;

       // Static block
       static {
           value = 10;
           System.out.println("Static block executed");
       }
   }

   public class Main {
       public static void main(String[] args) {
           System.out.println(Test.value); // Static block runs before accessing the variable
       }
   }
   ```

4. **Static Nested Classes**:
    - A static nested class is a static member of the outer class and can be accessed without an instance of the outer class.
    - It can only access the static members of the outer class.

   **Example**:
   ```java
   class OuterClass {
       static class NestedClass {
           void display() {
               System.out.println("Static nested class");
           }
       }
   }

   public class Main {
       public static void main(String[] args) {
           OuterClass.NestedClass nested = new OuterClass.NestedClass();
           nested.display();
       }
   }
   ```

### Key Points

- **Shared Across Instances**: Static members (variables, methods) are shared across all instances of a class.
- **Access Without Object**: Static members can be accessed using the class name, without needing to create an object.
- **Initialization**: Static variables are initialized when the class is loaded, while instance variables are initialized when objects are created.
- **Restrictions in Static Methods**: Static methods can only directly access static variables or methods; they cannot directly access non-static (instance) members.

### 34. **Tell me about 'final' keyword in java**
The `**final**` keyword in Java is used to restrict the modification of variables, methods, and classes. Depending on where it is applied, it can have different effects:

### 1. **Final Variables**
A variable declared with the `final` keyword becomes a constant, meaning its value cannot be changed after it is initialized.

#### Characteristics:
- **Constant Value**: Once assigned, the value of a `final` variable cannot be modified.
- **Initialization**: A `final` variable must be initialized either when it is declared or inside the constructor of the class.
- **Effect**: Makes the variable immutable.

#### Example:
```java
public class Example {
    final int MAX_VALUE = 100;  // A final variable, must be initialized

    public void show() {
        // MAX_VALUE = 200;  // Compilation error: cannot assign to final variable
        System.out.println(MAX_VALUE);
    }
}
```

### 2. **Final Methods**
A method declared as `final` cannot be overridden by subclasses. This is useful when you want to ensure that a specific method’s behavior remains consistent and cannot be changed by any subclass.

#### Characteristics:
- **No Overriding**: Subclasses cannot override a `final` method, ensuring that the original behavior is preserved.
- **Usage**: Often used when you want to protect a method from being modified or altered by subclassing.

#### Example:
```java
class Parent {
    final void show() {
        System.out.println("This is a final method.");
    }
}

class Child extends Parent {
    // This will cause a compilation error:
    // void show() { System.out.println("Attempting to override"); }
}
```

### 3. **Final Classes**
A class declared as `final` cannot be extended or subclassed. This is useful when you want to create an immutable or non-extendable class, such as `java.lang.String`.

#### Characteristics:
- **No Inheritance**: No class can inherit from a `final` class.
- **Usage**: Commonly used to create utility classes or to prevent further inheritance for security and design reasons.

#### Example:
```java
final class Animal {
    // Class implementation
}

// This will cause a compilation error:
// class Dog extends Animal { }
```

### 4. **Final Parameters**
Method parameters can also be declared as `final`. This means that the parameter value cannot be changed within the method.

#### Example:
```java
public class Example {
    void show(final int value) {
        // value = 10; // Compilation error: cannot modify final parameter
        System.out.println(value);
    }
}
```

### Key Points

- **Final Variables**: Can only be assigned once and must be initialized.
- **Final Methods**: Cannot be overridden by subclasses.
- **Final Classes**: Cannot be subclassed.
- **Final Parameters**: Their values cannot be modified within the method.

### When to Use `final`

- To create **constants**.
- To **prevent method overriding** in inheritance hierarchies.
- To **prevent class inheritance** for security, immutability, or design reasons.
- To **prevent modification** of method parameters inside methods.

### 35. **Explain about JDK, JVM, JRE.**
### JDK (Java Development Kit)

- **Definition**: A full software development kit (SDK) for Java, providing tools to develop, compile, and run Java applications.
- **Components**: Includes JRE + development tools like the compiler (`javac`), debugger, and libraries.
- **Use**: For Java developers who write and compile Java code.

### JVM (Java Virtual Machine)

- **Definition**: A runtime environment that executes Java bytecode. It provides platform independence by converting bytecode into machine-specific code.
- **Components**: Part of JRE; includes a **Just-In-Time (JIT) compiler** to optimize performance.
- **Use**: Executes Java programs.

### JRE (Java Runtime Environment)

- **Definition**: A subset of JDK, providing the environment necessary to run Java applications.
- **Components**: Includes JVM + core libraries but lacks development tools.
- **Use**: For users who only want to run Java programs, not develop them.

### Comparison Table

| Feature          | JDK                               | JRE                               | JVM                               |
|------------------|-----------------------------------|-----------------------------------|-----------------------------------|
| **Purpose**       | Develop and run Java applications | Run Java applications             | Execute Java bytecode             |
| **Includes**      | JRE + development tools (compiler) | JVM + core libraries              | Part of JRE, responsible for execution |
| **Target Audience**| Developers                       | End-users                        | Internal component for running code |
| **Development**   | Enables development and execution | Only enables execution            | Execution engine inside JRE       |

### 36. **What is a constructor ? What are the types of it ?**
### Constructor in Java

- **Definition**: A constructor is a special method used to initialize new objects. It has the same name as the class and no return type.

### Types of Constructors

1. **Default Constructor**
    - **Description**: Automatically provided by Java if no constructors are explicitly defined.
    - **Characteristics**:
        - No parameters.
        - Initializes object with default values.
    - **Example**:
      ```java
      public class Example {
          // Default constructor provided by Java
      }
      ```

2. **No-Argument Constructor**
    - **Description**: A constructor that does not take any parameters. Can be explicitly defined by the programmer.
    - **Characteristics**:
        - Similar to the default constructor but explicitly defined.
    - **Example**:
      ```java
      public class Example {
          public Example() {
              // No-arg constructor
              System.out.println("No-argument constructor called");
          }
      }
      ```

3. **Parameterized Constructor**
    - **Description**: A constructor that accepts arguments to initialize object attributes with specific values.
    - **Characteristics**:
        - Takes parameters.
        - Allows setting initial state of the object.
    - **Example**:
      ```java
      public class Example {
          int x;
 
          public Example(int x) {
              this.x = x;
              System.out.println("Parameterized constructor called with x = " + x);
          }
      }
      ```

4. **Copy Constructor** (User-Defined)
    - **Description**: A constructor that creates a new object as a copy of an existing object.
    - **Characteristics**:
        - Not provided by default in Java; must be manually implemented.
        - Copies the values of another object’s attributes.
    - **Example**:
      ```java
      public class Example {
          int x;
 
          // Parameterized constructor
          public Example(int x) {
              this.x = x;
          }
 
          // Copy constructor
          public Example(Example obj) {
              this.x = obj.x;
              System.out.println("Copy constructor called");
          }
      }
      ```

### Key Points

- **Constructor Overloading**: Having multiple constructors in a class with different parameter lists.
  ```java
  public class Example {
      int x;
      String y;

      // No-arg constructor
      public Example() {
          this.x = 0;
          this.y = "Default";
      }

      // Parameterized constructor
      public Example(int x, String y) {
          this.x = x;
          this.y = y;
      }
  }
  ```

- **No Return Type**: Constructors do not have a return type, not even `void`.

- **Automatic Invocation**: Constructors are called automatically when a new object is created using the `new` keyword.
  ```java
  Example obj1 = new Example();           // Calls no-arg constructor
  Example obj2 = new Example(10, "Hello"); // Calls parameterized constructor
  Example obj3 = new Example(obj2);      // Calls copy constructor
  ```

### Summary

- **Purpose**: Initialize new objects with default or specific values.
- **Types**:
    - **Default Constructor**: Provided by Java if no constructors are defined.
    - **No-Argument Constructor**: Explicitly defined without parameters.
    - **Parameterized Constructor**: Defined with parameters to set initial values.
    - **Copy Constructor**: User-defined to create a new object as a copy of an existing one.
- **Features**:
    - Same name as the class.
    - No return type.
    - Supports constructor overloading for flexibility.

Constructors are essential for setting up the initial state of objects and ensuring that they are ready for use immediately after creation.


### 37. **Tell me about 'new' keyword in java. How it is significant in Object Creation ?**
### `new` Keyword in Java

- **Definition**: The `new` keyword in Java is used to create new instances (objects) of a class.
- **Significance**: It dynamically allocates memory for an object and initializes it by calling the class’s constructor.

### Role in Object Creation

1. **Memory Allocation**:
    - When `new` is used, it allocates memory for the object in the **heap**.
    - Every object has a unique memory address, and this is where the object’s instance variables are stored.

2. **Constructor Invocation**:
    - The `new` keyword automatically calls the constructor of the class to initialize the object.
    - Without `new`, constructors cannot be invoked, meaning objects cannot be created.

3. **Reference Assignment**:
    - The `new` keyword returns a reference (memory address) to the newly created object, which is then stored in a variable.
    - This reference allows access to the object's methods and fields.

### Example of Object Creation

```java
class Example {
    int x;

    Example(int x) {
        this.x = x;  // Constructor initializes the object
    }
}

public class Main {
    public static void main(String[] args) {
        Example obj = new Example(5); // 'new' allocates memory and calls the constructor
        System.out.println(obj.x);    // Access the object's data
    }
}
```

### Key Steps in Object Creation

1. **Class Declaration**: Define the class with fields, methods, and constructors.
2. **Using `new` Keyword**:
    - Memory is allocated for the object.
    - Constructor is invoked to initialize object properties.
    - A reference to the object is returned and stored in a variable.

### Significance of `new` Keyword

- **Dynamic Memory Allocation**: Objects are created at runtime, giving flexibility in memory management.
- **Object Initialization**: Ensures that every object is initialized properly by invoking the class constructor.
- **Object Access**: After using `new`, the reference can be used to access object methods and fields.

Without the `new` keyword, objects cannot be created in Java, making it fundamental for object-oriented programming.

### 38. **What is constructor chaining in Java ?**
### Constructor Chaining in Java

**Constructor Chaining** is a process where one constructor calls another constructor within the same class or from the superclass. This technique promotes code reuse and ensures that object initialization is performed consistently.

### Types of Constructor Chaining

1. **Within the Same Class** (`this` keyword)
2. **Between Superclass and Subclass** (`super` keyword)

---

### 1. Chaining Within the Same Class (`this`)

- **Purpose**: To call another constructor in the same class to avoid code duplication.
- **Syntax**: Use `this()` with appropriate parameters.
- **Rules**:
    - Must be the **first statement** in the constructor.
    - Can only call one constructor at a time.

**Example:**

```java
public class Vehicle {
    int wheels;
    String color;

    // No-argument constructor
    public Vehicle() {
        this(4); // Calls constructor with one parameter
    }

    // Parameterized constructor
    public Vehicle(int wheels) {
        this(wheels, "White"); // Calls constructor with two parameters
    }

    // Another parameterized constructor
    public Vehicle(int wheels, String color) {
        this.wheels = wheels;
        this.color = color;
    }

    public void display() {
        System.out.println("Wheels: " + wheels + ", Color: " + color);
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        v1.display(); // Outputs: Wheels: 4, Color: White

        Vehicle v2 = new Vehicle(2, "Red");
        v2.display(); // Outputs: Wheels: 2, Color: Red
    }
}
```

---

### 2. Chaining Between Superclass and Subclass (`super`)

- **Purpose**: To call a constructor from the superclass to ensure proper initialization of inherited properties.
- **Syntax**: Use `super()` with appropriate parameters.
- **Rules**:
    - Must be the **first statement** in the subclass constructor.
    - If not explicitly called, Java automatically inserts a no-argument `super()` call.

**Example:**

```java
// Superclass
class Animal {
    String name;

    // Parameterized constructor
    public Animal(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Animal Name: " + name);
    }
}

// Subclass
class Dog extends Animal {
    String breed;

    // Constructor chaining using super()
    public Dog(String name, String breed) {
        super(name); // Calls Animal(String name) constructor
        this.breed = breed;
    }

    @Override
    public void display() {
        super.display(); // Optionally call superclass method
        System.out.println("Breed: " + breed);
    }

    public static void main(String[] args) {
        Dog d = new Dog("Buddy", "Golden Retriever");
        d.display();
        // Outputs:
        // Animal Name: Buddy
        // Breed: Golden Retriever
    }
}
```

---

### Benefits of Constructor Chaining

- **Code Reusability**: Reduces duplication by reusing constructor logic.
- **Maintainability**: Easier to manage and update initialization code.
- **Consistency**: Ensures all constructors follow a standard initialization process.

### Best Practices

1. **Use `this()` and `super()` Appropriately**:
    - Use `this()` to call another constructor in the same class.
    - Use `super()` to call a constructor from the superclass.

2. **First Statement Rule**:
    - Always place `this()` or `super()` as the first statement in the constructor.

3. **Avoid Circular Calls**:
    - Ensure that constructor chaining does not create an infinite loop (e.g., Constructor A calls Constructor B, and Constructor B calls Constructor A).

4. **Leverage Default Constructors**:
    - If the superclass has a no-argument constructor, Java inserts `super()` automatically if you don't specify it.

### Common Mistakes

- **Not Following the First Statement Rule**:
  ```java
  public class Example {
      public Example() {
          System.out.println("Default Constructor");
          this(10); // Error: `this()` must be the first statement
      }

      public Example(int x) {
          System.out.println("Parameterized Constructor with x = " + x);
      }
  }
  ```

- **Missing Superclass Constructors**:
  If the superclass does not have a no-argument constructor and the subclass does not explicitly call a superclass constructor, it leads to a compilation error.

  ```java
  class Parent {
      public Parent(int x) {}
  }

  class Child extends Parent {
      public Child() {
          // Error: Must call Parent(int x) constructor
      }
  }
  ```

---

### Summary

- **Constructor Chaining** ensures that objects are initialized properly by systematically calling constructors within the same class or across the inheritance hierarchy.
- **`this()`** is used to invoke another constructor in the same class.
- **`super()`** is used to invoke a constructor from the superclass.
- **Adhering to the rules** of constructor chaining promotes clean, maintainable, and efficient code.

Constructors chaining is a fundamental concept in Java that enhances object-oriented design by promoting reuse and ensuring consistent initialization across classes.

### 39. **Explain boxing, un-boxing, auto-boxing and auto-unboxing.**
### Boxing, Unboxing, Auto-boxing, and Auto-unboxing in Java

In Java, **boxing** and **unboxing** are fundamental concepts that facilitate the interaction between primitive types and their corresponding wrapper classes. **Auto-boxing** and **auto-unboxing** are compiler features introduced in Java 5 to automate these conversions, making the code more concise and readable.

---

#### 1. **Boxing**

- **Definition**: Boxing is the manual process of converting a primitive data type (e.g., `int`, `double`) into its corresponding wrapper class object (`Integer`, `Double`).

- **Purpose**: Enables primitives to be used in contexts that require objects, such as collections (`ArrayList`, `HashMap`).

- **Example**:
  ```java
  int num = 10;
  Integer boxedNum = Integer.valueOf(num); // Boxing
  ```

---

#### 2. **Unboxing**

- **Definition**: Unboxing is the manual process of converting a wrapper class object back into its corresponding primitive data type.

- **Purpose**: Retrieves the primitive value from its wrapper object for operations that require primitives.

- **Example**:
  ```java
  Integer boxedNum = Integer.valueOf(10);
  int num = boxedNum.intValue(); // Unboxing
  ```

---

#### 3. **Auto-boxing**

- **Definition**: Auto-boxing is the automatic conversion performed by the Java compiler from a primitive type to its corresponding wrapper class object.

- **Purpose**: Simplifies code by eliminating the need for explicit boxing, enhancing readability and reducing boilerplate.

- **Example**:
  ```java
  int num = 10;
  Integer boxedNum = num; // Auto-boxing
  ```

---

#### 4. **Auto-unboxing**

- **Definition**: Auto-unboxing is the automatic conversion performed by the Java compiler from a wrapper class object to its corresponding primitive type.

- **Purpose**: Simplifies code by eliminating the need for explicit unboxing, enhancing readability and reducing boilerplate.

- **Example**:
  ```java
  Integer boxedNum = Integer.valueOf(10);
  int num = boxedNum; // Auto-unboxing
  ```

---

### Comparison Table

| **Feature**        | **Boxing**                                      | **Unboxing**                                    | **Auto-boxing**                                 | **Auto-unboxing**                               |
|--------------------|-------------------------------------------------|-------------------------------------------------|-------------------------------------------------|-------------------------------------------------|
| **Definition**     | Manual conversion from primitive to wrapper      | Manual conversion from wrapper to primitive      | Automatic conversion from primitive to wrapper   | Automatic conversion from wrapper to primitive   |
| **Syntax**         | `Integer boxed = Integer.valueOf(10);`          | `int num = boxed.intValue();`                    | `Integer boxed = 10;`                            | `int num = boxed;`                                |
| **Compiler Role**  | Explicitly invoked by the programmer             | Explicitly invoked by the programmer             | Handled automatically by the compiler             | Handled automatically by the compiler             |
| **Java Version**   | All Java versions                               | All Java versions                               | Introduced in Java 5                              | Introduced in Java 5                              |
| **Use Case**       | When manual control over conversion is needed    | When manual control over conversion is needed    | Simplifying code when using collections or APIs    | Simplifying code when retrieving values from objects|

---

### Practical Examples

#### **Boxing and Unboxing**

```java
public class BoxingExample {
    public static void main(String[] args) {
        // Boxing
        int primitiveInt = 5;
        Integer wrapperInt = Integer.valueOf(primitiveInt); // Manual boxing
        System.out.println("Boxed Integer: " + wrapperInt);

        // Unboxing
        Integer anotherWrapperInt = Integer.valueOf(10);
        int anotherPrimitiveInt = anotherWrapperInt.intValue(); // Manual unboxing
        System.out.println("Unboxed int: " + anotherPrimitiveInt);
    }
}
```

**Output:**
```
Boxed Integer: 5
Unboxed int: 10
```

#### **Auto-boxing and Auto-unboxing**

```java
import java.util.ArrayList;

public class AutoBoxingExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Auto-boxing: int to Integer
        list.add(15); // Automatically converts int to Integer
        list.add(25);

        // Auto-unboxing: Integer to int
        int sum = list.get(0) + list.get(1); // Automatically converts Integer to int
        System.out.println("Sum: " + sum);
    }
}
```

**Output:**
```
Sum: 40
```

---

### Key Points

- **Wrapper Classes**: Each primitive type has a corresponding wrapper class:
    - `int` ↔ `Integer`
    - `double` ↔ `Double`
    - `char` ↔ `Character`
    - `boolean` ↔ `Boolean`
    - ...and so on.

- **Collections and Generics**: Java collections (e.g., `ArrayList`, `HashMap`) cannot store primitive types directly. Boxing and auto-boxing allow primitives to be used within these collections by converting them to their wrapper class objects.

- **Performance Considerations**: While auto-boxing and auto-unboxing enhance code readability, excessive use can lead to performance overhead due to additional object creation and garbage collection.

---

### When to Use

- **Boxing**:
    - When manual control over the conversion process is required.
    - When working with legacy code that doesn't support auto-boxing.

- **Unboxing**:
    - When manual extraction of primitive values from wrapper objects is necessary.
    - When performing operations that require primitive types.

- **Auto-boxing**:
    - When writing cleaner and more concise code.
    - When working with collections and APIs that require objects.

- **Auto-unboxing**:
    - When retrieving and using primitive values from objects without explicit conversion.

---

### Conclusion

Understanding boxing, unboxing, auto-boxing, and auto-unboxing is essential for effective Java programming, especially when working with collections, generics, and APIs that expect object types. These concepts bridge the gap between primitive types and their object counterparts, enabling more flexible and readable code.