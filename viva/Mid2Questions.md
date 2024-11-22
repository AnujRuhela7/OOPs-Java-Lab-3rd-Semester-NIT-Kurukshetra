Here's a comprehensive answer key for all the questions, with detailed explanations for each answer. I've also included a marking scheme that you can use to score the answers based on the depth and accuracy of students' responses.

---

### **1. Exception Handling**

1. **What is an exception in Java, and why is it important to handle exceptions?**
    - *Answer:* An exception is an event that disrupts the normal flow of a program's instructions during execution. It is important to handle exceptions to prevent the program from crashing and to allow for graceful recovery, like displaying error messages or retrying operations.
    - *Marking Scheme:* 2 marks (1 mark for defining an exception, 1 mark for explaining why it’s important)

2. **Explain the difference between checked and unchecked exceptions.**
    - *Answer:* Checked exceptions are exceptions that are checked at compile-time, meaning the programmer must handle them, e.g., `IOException`. Unchecked exceptions are checked at runtime and typically indicate programming errors, e.g., `NullPointerException`.
    - *Marking Scheme:* 2 marks (1 for checked exceptions, 1 for unchecked exceptions)

3. **How does the `try-catch` block work in Java?**
    - *Answer:* In Java, the `try` block contains code that might throw an exception. If an exception occurs, control is transferred to the `catch` block, where the exception is handled. This structure allows programs to manage errors without terminating.
    - *Marking Scheme:* 2 marks (1 mark for explaining `try` block, 1 for `catch` block)

4. **What is the purpose of the `finally` block?**
    - *Answer:* The `finally` block contains code that will execute regardless of whether an exception is thrown or not. It is commonly used for cleanup actions, like closing files or releasing resources.
    - *Marking Scheme:* 2 marks (1 for explaining purpose, 1 for cleanup example)

5. **Can a `finally` block execute even if there is a return statement in the `try` or `catch` block?**
    - *Answer:* Yes, the `finally` block will execute even if there is a return statement in the `try` or `catch` blocks. This is because the `finally` block is designed to execute under all circumstances.
    - *Marking Scheme:* 1 mark (correct answer)

---

### **2. Inheritance**

11. **What is inheritance, and why is it used in Java?**
- *Answer:* Inheritance is a mechanism where a new class (subclass) acquires the properties and behavior of an existing class (superclass). It is used for code reusability and to establish a hierarchy, allowing for polymorphic behavior.
- *Marking Scheme:* 2 marks (1 for definition, 1 for purpose)

12. **Explain the difference between single and multiple inheritance. Why doesn’t Java support multiple inheritance?**
- *Answer:* Single inheritance allows a class to inherit from one superclass, whereas multiple inheritance would allow a class to inherit from multiple classes. Java doesn’t support multiple inheritance with classes to avoid ambiguity caused by the "diamond problem" where a class inherits from two classes that have the same method.
- *Marking Scheme:* 3 marks (1 for single, 1 for multiple, 1 for reason)

13. **How does the `super` keyword work?**
- *Answer:* The `super` keyword in Java is used to refer to the superclass's methods or variables. It is commonly used to call the superclass’s constructor or to access members of the superclass that are hidden by subclass members.
- *Marking Scheme:* 2 marks (1 for basic usage, 1 for constructor call example)

---

### **3. Interface**

21. **What is an interface, and how is it different from an abstract class?**
- *Answer:* An interface in Java is a blueprint of a class with abstract methods that a class must implement. Unlike abstract classes, interfaces support multiple inheritance and cannot contain any instance variables.
- *Marking Scheme:* 2 marks (1 for definition, 1 for key difference)

22. **Can interfaces contain concrete methods in Java?**
- *Answer:* Yes, since Java 8, interfaces can have concrete methods using `default` and `static` methods. These methods can have bodies and are not required to be overridden.
- *Marking Scheme:* 2 marks (1 for `default`, 1 for `static`)

23. **Explain default and static methods in an interface.**
- *Answer:* Default methods in an interface are instance methods with a body and can be overridden by implementing classes. Static methods belong to the interface itself and can be called without an instance of the interface.
- *Marking Scheme:* 2 marks (1 for default, 1 for static)

---

### **4. Fundamental Classes**

31. **What is the `Object` class, and why is it important in Java?**
- *Answer:* The `Object` class is the root of the class hierarchy in Java, meaning every class in Java inherits from `Object`. It provides fundamental methods like `toString()`, `equals()`, and `hashCode()` which can be overridden.
- *Marking Scheme:* 2 marks (1 for definition, 1 for importance)

32. **How does the `equals()` method work, and how does it differ from `==`?**
- *Answer:* The `equals()` method is used to compare the content of two objects, whereas `==` checks if two references point to the same object in memory. `equals()` can be overridden to define object equality based on content.
- *Marking Scheme:* 2 marks (1 for `equals()`, 1 for `==`)

33. **What is the purpose of the `hashCode()` method?**
- *Answer:* The `hashCode()` method provides an integer representation of an object’s memory address, used in hashing-based collections like `HashMap` to quickly locate objects.
- *Marking Scheme:* 2 marks (1 for purpose, 1 for collection example)

---

### **5. Wrapper Classes**

41. **What are wrapper classes in Java, and why are they used?**
- *Answer:* Wrapper classes allow primitive types to be used as objects. They are useful in collections, like `ArrayList`, which only store objects and not primitives.
- *Marking Scheme:* 2 marks (1 for definition, 1 for use)

42. **How is autoboxing different from unboxing?**
- *Answer:* Autoboxing is the automatic conversion of a primitive to a corresponding wrapper type, e.g., `int` to `Integer`. Unboxing is the reverse, converting an `Integer` to `int`.
- *Marking Scheme:* 2 marks (1 for each)

43. **Explain the role of the `Integer` class.**
- *Answer:* The `Integer` class wraps the `int` primitive in an object and provides utility methods for conversion, parsing, and comparison of integers.
- *Marking Scheme:* 2 marks (1 for definition, 1 for utility)

---

### **6. Multithreading**

51. **What is multithreading, and why is it used?**
- *Answer:* Multithreading allows concurrent execution of multiple threads, enhancing performance, particularly on multi-core processors. It’s useful in applications like video games or servers where tasks can run concurrently.
- *Marking Scheme:* 2 marks (1 for definition, 1 for use)

52. **How do you create a thread in Java?**
- *Answer:* Threads can be created by extending the `Thread` class and overriding its `run()` method, or by implementing the `Runnable` interface and passing an instance to a `Thread` object.
- *Marking Scheme:* 2 marks (1 for each method)

53. **Difference between the `Thread` class and the `Runnable` interface?**
- *Answer:* The `Thread` class provides built-in thread functionalities, while the `Runnable` interface allows a class to define only the `run()` method. Using `Runnable` allows multiple inheritance and better separation of tasks and threading mechanics.
- *Marking Scheme:* 2 marks (1 for each)

---

### **General Marking Scheme**

- **Correct and Complete Answer**: Full marks if the student answers with a complete explanation and example.
- **Partially Correct**: Half marks if they give a partial answer or miss details.
- **Incorrect or Vague Answer**: No marks if they do not explain the core concepts.

---

This answer key provides clear guidelines to help you assess answers consistently. Let me know if you need more help!