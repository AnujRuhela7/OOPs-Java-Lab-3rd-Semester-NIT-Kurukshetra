### **1. What is polymorphism in Java?**

- **Answer:** Polymorphism in Java is a concept that allows objects of different types to be treated as objects of a common super type. It enables a single interface to represent different underlying forms (data types). In Java, polymorphism is achieved through method overriding and method overloading. Polymorphism allows the same method to perform different actions based on the object calling it.
- **Example:** A parent class reference can refer to a child class object.
- **Marking Scheme:** 2 marks (1 for definition, 1 for example)

---

### **2. What are the types of polymorphism in Java?**

- **Answer:** There are two main types of polymorphism in Java:
    1. **Compile-time (or Static) Polymorphism:** Achieved through method overloading and operator overloading, where the method to be executed is determined at compile time.
    2. **Runtime (or Dynamic) Polymorphism:** Achieved through method overriding, where the actual method to be executed is determined at runtime based on the object instance.
- **Marking Scheme:** 2 marks (1 for each type)

---

### **3. Explain method overloading and method overriding. How are they different?**

- **Answer:**
    - **Method Overloading:** It is a form of compile-time polymorphism where multiple methods have the same name but differ in parameters (number or type). It allows different behaviors for the same method name based on input parameters.
    - **Method Overriding:** It is a form of runtime polymorphism where a subclass provides a specific implementation of a method already defined in its superclass. The method in the child class must have the same name, return type, and parameters as in the parent class.
- **Differences:**
    - Overloading happens within the same class, whereas overriding requires inheritance between classes.
    - Overloading is resolved at compile time, while overriding is resolved at runtime.
- **Example for Overloading:** `public void add(int a, int b)`, `public void add(int a, int b, int c)`
- **Example for Overriding:** Parent class has `public void display()`, and the subclass overrides it as `public void display()`.
- **Marking Scheme:** 3 marks (1 for each concept, 1 for differences)

---

### **4. What is the role of the `@Override` annotation in polymorphism?**

- **Answer:** The `@Override` annotation in Java indicates that a method is intended to override a method in its superclass. It is not mandatory but serves as a useful form of documentation. If the superclass method signature is changed or the method does not exist in the superclass, the compiler will throw an error, helping to catch errors early.
- **Marking Scheme:** 2 marks (1 for explanation, 1 for importance)

---

### **5. Can a private method be overridden? Why or why not?**

- **Answer:** No, a private method cannot be overridden in Java because it is not visible to subclasses. Since private methods are accessible only within the class where they are defined, they cannot participate in inheritance and, therefore, cannot be overridden. If a subclass defines a method with the same signature as a private method in the superclass, it is treated as a new method in the subclass rather than an override.
- **Marking Scheme:** 2 marks (1 for reason, 1 for example or clarity)

---

### **6. What are virtual methods, and how are they relevant to polymorphism?**

- **Answer:** In Java, all non-static methods are virtual methods by default. A virtual method is a method whose behavior can be overridden within an inheriting class (i.e., it supports dynamic method dispatch). They are central to polymorphism because they allow Java to use method overriding to invoke the correct method based on the actual object type at runtime, enabling dynamic polymorphism.
- **Marking Scheme:** 2 marks (1 for virtual method concept, 1 for relevance to polymorphism)

---

### **7. Explain the `super` keyword in relation to polymorphism.**

- **Answer:** The `super` keyword is used in polymorphism to refer to members (methods or variables) of the superclass. In method overriding, it allows a subclass to call the overridden method from the superclass, enabling access to the superclass’s version of a method. This is useful in scenarios where a subclass method overrides a superclass method but still needs to invoke the original functionality of the superclass.
- **Example:** `super.display()` can call the `display` method of the superclass in an overridden method in the subclass.
- **Marking Scheme:** 2 marks (1 for concept, 1 for example)

---

### **8. Why can’t we override static methods in Java?**

- **Answer:** Static methods belong to the class rather than to instances of the class, meaning they are resolved at compile time, not runtime. Since polymorphism in Java relies on dynamic binding (runtime resolution), static methods cannot be overridden as they don’t participate in inheritance in the same way as instance methods do. Instead, if a static method with the same signature is defined in a subclass, it hides the superclass method, rather than overriding it.
- **Marking Scheme:** 2 marks (1 for reason, 1 for explanation of hiding)

---

### **9. Can constructors be overridden in Java? Why or why not?**

- **Answer:** No, constructors cannot be overridden in Java because they are not inherited by subclasses. Each class has its own constructors, and they are called only when an instance of that class is created. While subclasses can call superclass constructors using the `super()` keyword, they cannot override them. Constructors are designed to initialize objects of a specific class, so overriding does not apply.
- **Marking Scheme:** 2 marks (1 for reason, 1 for the concept of inheritance)

---

### **10. What is the purpose of `instanceof` in polymorphic code?**

- **Answer:** The `instanceof` keyword in Java is used to check whether an object is an instance of a specific class or interface. It is particularly useful in polymorphic code, where you may need to verify an object's type before performing operations specific to that type. Using `instanceof` helps prevent `ClassCastException` errors by ensuring safe casting.
- **Example:** `if (object instanceof Dog) { ... }` checks if `object` is an instance of the `Dog` class before casting it.
- **Marking Scheme:** 2 marks (1 for purpose, 1 for example)

---

Here are detailed answers to the additional questions:

---

### **i) What is Dynamic Method Dispatch in Java?**

- **Answer:** Dynamic Method Dispatch, also known as runtime polymorphism, is a process in Java by which a call to an overridden method is resolved at runtime rather than compile time. This occurs when a superclass reference variable refers to a subclass object, and the method to be called is determined by the actual type of the object, not the type of the reference. Dynamic Method Dispatch enables polymorphic behavior, allowing the appropriate overridden method in the subclass to be executed based on the actual object type.

- **Example:**
  ```java
  class Animal {
      void sound() {
          System.out.println("Animal makes a sound");
      }
  }

  class Dog extends Animal {
      void sound() {
          System.out.println("Dog barks");
      }
  }

  public class Test {
      public static void main(String[] args) {
          Animal myAnimal = new Dog(); // Upcasting
          myAnimal.sound(); // Calls Dog's sound() method at runtime
      }
  }
  ```
  In this example, the `sound` method of `Dog` is called, even though the reference type is `Animal`. This is resolved dynamically at runtime.

---

### **ii) Can we invoke a static method of a superclass if a method with the same signature is defined in its child class?**

- **Answer:** Yes, we can invoke a static method of the superclass even if a method with the same signature is defined in its child class. However, this is not considered overriding, as static methods belong to the class rather than to any instance, and therefore they are not part of polymorphic behavior. Instead, when a subclass defines a static method with the same signature as a static method in the superclass, it hides the superclass's method rather than overriding it.

- **To invoke the superclass’s static method explicitly,** we can use the superclass name followed by the method name:
  ```java
  class Parent {
      static void display() {
          System.out.println("Static method in Parent class");
      }
  }

  class Child extends Parent {
      static void display() {
          System.out.println("Static method in Child class");
      }
  }

  public class Test {
      public static void main(String[] args) {
          Parent.display(); // Calls Parent's static method
          Child.display(); // Calls Child's static method
      }
  }
  ```
  In this example, `Parent.display()` calls the static method in `Parent`, and `Child.display()` calls the static method in `Child`. This demonstrates method hiding, not overriding.

- **Marking Scheme:** 3 marks (1 for explanation, 1 for distinction between hiding and overriding, 1 for example)

---
### iii) What do you mean by that Child class can hold the reference of Parent Class in java ?

In Java, **a parent class reference can hold an instance (or object) of a child class**, which is a key concept of inheritance and polymorphism. However, the reverse (a child class reference holding a parent class object) is not allowed.

Here’s what this means and how it works:

### Explanation
When we say that "a parent class reference can hold an instance of a child class," it means that a reference variable of the parent class type can be assigned to an object of its subclass (child class). This is possible because a subclass inherits all the characteristics of its parent class, so it’s guaranteed to have at least the same structure and methods defined in the parent.

### Example

Let’s look at a basic example to clarify:

```java
class Parent {
    void display() {
        System.out.println("Display method in Parent class");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("Display method in Child class");
    }
    
    void childMethod() {
        System.out.println("Method specific to Child class");
    }
}

public class Test {
    public static void main(String[] args) {
        Parent ref = new Child(); // Parent reference holding Child instance
        ref.display(); // Calls the overridden display() in Child class
        
        // ref.childMethod(); // This line would cause an error
    }
}
```

### What Happens Here

1. **Declaration and Assignment:**
    - `Parent ref = new Child();` – Here, we create a `Child` object but assign it to a `Parent` reference. This is called **upcasting** (casting a subclass type to a superclass type), which is implicit in Java and does not require an explicit cast.

2. **Method Call (Polymorphism):**
    - When `ref.display();` is called, **dynamic method dispatch** (runtime polymorphism) allows Java to invoke the `display()` method of the `Child` class, not the `Parent` class, because the actual object type is `Child`.

3. **Access Restrictions:**
    - With a `Parent` reference (`ref`), only methods available in the `Parent` class can be called, even though the object is actually a `Child`. Therefore, `ref.childMethod();` would not compile because `childMethod()` is not defined in `Parent`.

### Why It’s Useful
Using a parent class reference to hold a child class instance is useful for writing generic, flexible code. For example, we can treat different subclasses in the same way through a common superclass type, which is essential in polymorphism.

### Key Points to Remember
- **Polymorphism**: This setup allows polymorphic behavior, where overridden methods in subclasses are called based on the actual object type at runtime.
- **Type Safety**: Only methods defined in the reference type (Parent) can be accessed, preventing accidental access to methods that might not be available in other subclasses.

Here are detailed answers to each question, covering key points that will allow you to evaluate students' understanding.

---

### **1) Abstract methods are static/non-static?**

- **Answer:** Abstract methods are **non-static**. They cannot be static because abstract methods are meant to be overridden by subclasses, and static methods cannot be overridden. Abstract methods are instance methods that must be implemented by a subclass to define specific behaviors.
- **Marking Scheme:** 2 marks (1 for identifying non-static, 1 for explanation)

---

### **2) Is it possible to have an abstract class without any abstract methods?**

- **Answer:** Yes, it is possible to have an abstract class without any abstract methods. Such a class can still be declared abstract to prevent instantiation directly or to serve as a base class that other subclasses can inherit. Sometimes, abstract classes without abstract methods act as "base" classes providing common functionality.
- **Marking Scheme:** 2 marks (1 for answer, 1 for explanation)

---

### **3) An abstract class cannot be instantiated, but we can still define a constructor for it. Explain.**

- **Answer:** Although an abstract class cannot be instantiated directly, it can have a constructor because it may need to initialize fields or perform setup tasks for subclasses. The constructor of an abstract class is called when a subclass object is created, allowing the superclass part of the subclass to be initialized.
- **Marking Scheme:** 2 marks (1 for answer, 1 for explanation)

---

### **4) Can a subclass be abstract even though its superclass is concrete?**

- **Answer:** Yes, a subclass can be declared as abstract even if its superclass is concrete. This would mean the subclass is still partially implemented and requires further subclassing to provide implementations for certain methods or additional behavior.
- **Marking Scheme:** 2 marks (1 for answer, 1 for explanation)

---

### **5) Examples of some in-built abstract classes in Java**

- **Answer:** Some examples of in-built abstract classes in Java are:
    - `AbstractList` (java.util) – provides partial implementation of the List interface
    - `HttpServlet` (javax.servlet.http) – serves as a base for creating HTTP servlets
    - `AbstractMap` (java.util) – partial implementation of the Map interface
- **Marking Scheme:** 2 marks (1 for each example, up to 2 marks)

---

### **6) Can an abstract class implement an interface?**

- **Answer:** Yes, an abstract class can implement an interface. When it does so, it is not required to provide implementations for all of the interface's methods; the responsibility to implement remaining methods can be delegated to the subclasses.
- **Marking Scheme:** 2 marks (1 for answer, 1 for explanation)

---

### **7) Can an abstract class extend another abstract class?**

- **Answer:** Yes, an abstract class can extend another abstract class. The subclass abstract class can inherit abstract methods from its superclass, and it may or may not implement those methods. It can also declare additional abstract methods of its own.
- **Marking Scheme:** 2 marks (1 for answer, 1 for explanation)

---

### **8) Why does the below code show error?**

```java
interface A {
    void printHello();
}

class B implements A {
    void printHello() {
        System.out.println("hello");
    }
}
```

- **Answer:** The code shows an error because the `printHello` method in class `B` does not properly override the method in interface `A`. In Java, methods in an interface are implicitly `public`, so the implementation of `printHello` in class `B` should also be `public`. The correct code is:
  ```java
  class B implements A {
      public void printHello() {
          System.out.println("hello");
      }
  }
  ```
- **Marking Scheme:** 2 marks (1 for identifying the issue, 1 for correct explanation)

---

### **9) What is Comparable in Java?**

- **Answer:** `Comparable` is an interface in Java (java.lang package) that provides a way to define a natural ordering for objects of a class. A class that implements `Comparable` must implement the `compareTo` method, which determines the ordering of objects. This is useful for sorting objects, as it allows a class to be sorted by the `Collections.sort` or `Arrays.sort` methods.
- **Marking Scheme:** 2 marks (1 for definition, 1 for the purpose)

---

### **10) How can we use `Arrays.sort()` to sort objects of a user-defined class?**

- **Answer:** To use `Arrays.sort()` for sorting objects of a user-defined class, the class must either implement the `Comparable` interface or a custom `Comparator` must be provided.
    - **Using `Comparable`:** Implement the `compareTo` method within the class.
    - **Using `Comparator`:** Pass a `Comparator` instance to `Arrays.sort()`.
- **Example:**
  ```java
  class Student implements Comparable<Student> {
      int id;
      String name;

      public int compareTo(Student other) {
          return this.id - other.id;
      }
  }
  ```
- **Marking Scheme:** 2 marks (1 for each approach)

---

### **11) Abstract Class vs. Interface**

- **Answer:**
    - **Abstract Class**: Can have both abstract and non-abstract methods, as well as fields with initial values. Supports constructors.
    - **Interface**: All methods are abstract by default (in older Java versions); fields are `public`, `static`, and `final`.
    - **Usage**: Use an abstract class when subclasses share a common behavior; use an interface to define common behavior across unrelated classes.
- **Marking Scheme:** 3 marks (1 for each main difference)

---

### **12) How is multiple inheritance possible using interfaces?**

- **Answer:** Multiple inheritance is possible in Java through interfaces because a class can implement multiple interfaces. This allows a class to inherit behaviors from multiple sources without the diamond problem, as interfaces only define method signatures without implementation.
- **Marking Scheme:** 2 marks (1 for explanation, 1 for reasoning on no diamond problem)

---

### **13) What is the diamond problem?**

- **Answer:** The diamond problem is an ambiguity that occurs in languages allowing multiple inheritance, where a class inherits from two classes that have a common superclass. Java avoids this problem by not supporting multiple inheritance with classes, only with interfaces. In interfaces, there’s no ambiguity since interfaces don’t provide method implementations (prior to Java 8).
- **Marking Scheme:** 2 marks (1 for definition, 1 for Java’s solution)

---
### **Checked vs. Unchecked Exceptions in Java**

In Java, exceptions are categorized into two main types: **Checked** and **Unchecked Exceptions**. Understanding these categories is essential for handling exceptions effectively and writing robust code.

---

#### **Checked Exceptions**
Checked exceptions are exceptions that are checked at **compile time**. This means that if a method has code that might throw a checked exception, the method must either **handle the exception with a `try-catch` block** or declare it in the method signature using the `throws` keyword. If neither of these is done, the compiler will throw an error.

Checked exceptions typically represent conditions that a reasonable program might want to **anticipate and recover from**, such as issues with external resources (e.g., files, network connections) or user input errors.

- **Key Characteristics of Checked Exceptions:**
    - Must be declared in the method header if not caught within the method.
    - Checked by the compiler, so it ensures that the programmer is aware of potential exceptions.
    - Typically, these are recoverable exceptions.

- **Examples of Checked Exceptions:**
    1. **IOException**: Thrown when there is an I/O operation failure, such as when attempting to read a file that doesn’t exist or when there’s a failure in network communication.
    2. **SQLException**: Thrown when there is an issue with accessing the database, such as a failed SQL query or issues with the database connection.
    3. **ClassNotFoundException**: Thrown when an application tries to load a class through its name, but the class cannot be found in the classpath.

- **Example Code with a Checked Exception:**
  ```java
  import java.io.BufferedReader;
  import java.io.FileReader;
  import java.io.IOException;

  public class FileExample {
      public static void main(String[] args) {
          try {
              BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
              String line = reader.readLine();
              System.out.println(line);
              reader.close();
          } catch (IOException e) {
              System.out.println("An error occurred while reading the file.");
          }
      }
  }
  ```

---

#### **Unchecked Exceptions**
Unchecked exceptions are exceptions that are checked at **runtime**, rather than compile time. These exceptions inherit from `RuntimeException` and do not require explicit handling or declaration in the method signature. Unchecked exceptions usually represent programming errors or logical issues in the code, such as accessing invalid array indices, dividing by zero in integer division, or null pointer dereferencing.

Unchecked exceptions are generally **not meant to be handled explicitly**, as they indicate issues that the program typically cannot recover from without fixing the underlying code. They are often caused by logical errors that need to be corrected during development.

- **Key Characteristics of Unchecked Exceptions:**
    - Do not need to be declared in the method signature.
    - Not checked by the compiler, meaning they can occur unexpectedly at runtime.
    - Usually represent programming errors or logical flaws.

- **Examples of Unchecked Exceptions:**
    1. **NullPointerException**: Thrown when the program attempts to access or modify an object reference that points to `null`.
    2. **ArrayIndexOutOfBoundsException**: Thrown when trying to access an invalid index of an array (either negative or beyond the array length).
    3. **ArithmeticException**: Thrown when an illegal arithmetic operation occurs, such as dividing an integer by zero.

- **Example Code with an Unchecked Exception:**
  ```java
  public class DivideExample {
      public static void main(String[] args) {
          int number = 10;
          int divisor = 0;
          try {
              int result = number / divisor;
              System.out.println(result);
          } catch (ArithmeticException e) {
              System.out.println("Cannot divide by zero.");
          }
      }
  }
  ```

---

### **Summary Table of Differences**

| Feature                      | Checked Exception                     | Unchecked Exception                |
|------------------------------|---------------------------------------|------------------------------------|
| **Type**                     | Compile-time exception                | Runtime exception                  |
| **Required to handle or declare** | Yes                                  | No                                 |
| **Common Causes**            | External resource failures, user errors | Logical errors, programming bugs   |
| **Inheritance**              | Extends `Exception` (but not `RuntimeException`) | Extends `RuntimeException`         |
| **Examples**                 | `IOException`, `SQLException`, `ClassNotFoundException` | `NullPointerException`, `ArithmeticException`, `ArrayIndexOutOfBoundsException` |

By understanding checked and unchecked exceptions, developers can better design programs that either handle errors gracefully or prevent errors by validating data and logic before execution.