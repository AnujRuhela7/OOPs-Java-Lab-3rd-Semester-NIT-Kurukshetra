### Explanation:
1. **Base Class (`Notification`)**:
   - This is an abstract class that defines an abstract `send()` method. The constructor of this class calls the `send()` method.

2. **Derived Class (`SMSNotification, EmailNotification`)**:
   - This class extends the `Notification` class and overrides the `send()` method to print the message `"Your OTP is 123456"`.
   - The `send()` method is called in the constructor of the base class, so when the `SMSNotification` object is created, it prints the message.

3. **Main Class (`NotificationDriver`)**:
   - In the `main()` method, an object of `SMSNotification` is created, which triggers the constructor chain and the `send()` method is automatically called.
   - Then, the `send()` method is called explicitly again to demonstrate its functionality.

In this example, the `send()` method is called twice—once from the constructor and once explicitly in the `main()` method.


The behavior you're observing, where `null` is printed initially if you don't call the parent class constructor in the `SMSNotification` class, relates to how constructors and method overriding work in Java, particularly when dealing with abstract methods and constructors.

Here’s a breakdown of what’s happening:

### Abstract Method in Base Class and Constructor Call
Let’s assume we have a base class `Notification` with an abstract method `send()` and a derived class `SMSNotification` that overrides `send()`.

```java
abstract class Notification {
    public Notification() {
        // Calling the overridden method from constructor
        send();
    }

    public abstract void send();
}

class SMSNotification extends Notification {
    private String message;

    // Constructor for SMSNotification
    public SMSNotification(String msg) {
        this.message = msg;
    }

    @Override
    public void send() {
        System.out.println("Sending SMS: " + message);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create object of derived class
        SMSNotification sms = new SMSNotification("Hello, this is your message!");
        sms.send();
    }
}
```

### What Happens Without Calling the Parent Constructor?

If you **do not explicitly call** the parent class constructor from the `SMSNotification` constructor, it is **automatically called** by Java as the first step in the derived class constructor. Specifically, it will call the default constructor of the base class (`Notification`), and in this case, that default constructor will execute `send()`.

But here’s the catch:
- **At the time the base class constructor (`Notification()`) calls the `send()` method**, the `SMSNotification` object hasn’t been fully initialized yet.
- Specifically, the instance variable `message` in `SMSNotification` hasn’t been assigned a value yet. At this point, it’s still `null`.

So when the base class constructor calls `send()`, it prints `null`, because the `message` variable has not been initialized. Later, when you explicitly call `send()` from the `main()` method (after the `SMSNotification` constructor has finished executing), the `message` has been initialized, and you see the correct message printed.

### Why Does This Happen?

1. **Order of Execution**:
    - When you create a `SMSNotification` object, the constructor of `Notification` (the parent class) is called **before** the constructor of `SMSNotification`.
    - The constructor of `Notification` calls the `send()` method, but at that moment, the constructor of `SMSNotification` has not been completed, so the `message` variable is still `null`.

2. **Calling an Overridden Method in a Constructor**:
    - In Java, if a base class constructor calls a method that is overridden in a derived class, the overridden version is executed.
    - However, this can lead to problems if the derived class’s fields are not yet initialized. That’s why `null` is printed initially, since `message` is not set yet.

### Solution: Initialize Fields Before Method Call

If you want to avoid this issue, one solution is to ensure that fields like `message` are initialized before the base class constructor is called. For example, you can refactor the code to initialize the message in the `SMSNotification` constructor **before** the base class constructor is invoked:

```java
class SMSNotification extends Notification {
    private String message;

    // Constructor for SMSNotification
    public SMSNotification(String msg) {
        // Initialize message before calling the parent's constructor
        super();  // (Optional, as it's automatically called)
        this.message = msg;
    }

    @Override
    public void send() {
        System.out.println("Sending SMS: " + message);
    }
}
```

Alternatively, you can delay calling methods like `send()` from the constructor until all necessary initializations are complete.

### Key Points:
- When the base class constructor calls an overridden method, the overridden version in the derived class is executed.
- At the time the base class constructor is called, the derived class fields may not yet be initialized, leading to `null` values.
- If possible, avoid calling overridden methods from constructors, or ensure that fields in the derived class are initialized before the base class constructor is invoked.

This issue is a classic example of why calling overridden methods in a constructor can be risky. It can lead to unexpected behavior, especially when derived class fields haven't been fully initialized yet.