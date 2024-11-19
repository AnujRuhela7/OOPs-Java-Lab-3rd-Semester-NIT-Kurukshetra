### Code Explanation

- **Encapsulation with Private Fields and Methods**: 
  - The `balance` field and `updateBalance` method are private, enforcing control over how the balance is modified.
- **Inner Class (Transaction)**:
  - `Transaction` is an inner class within `BankAccount`, representing a transaction operation on the account.
  - The `processTransaction` method in `Transaction` calls the outer class’s `updateBalance` method to adjust the balance.
- **Interaction between Outer and Inner Class**:
  - In the `performTransaction` method, an instance of `Transaction` is created, and `processTransaction` is called to modify `balance`.
  - This demonstrates how an inner class can modify an outer class’s private data and how the outer class can leverage the functionality of its inner class.

---

### Key Concepts Used in the Problems

1. **Encapsulation**:
    - Encapsulation is a core concept of object-oriented programming that involves wrapping data (fields) and methods (functions) within a class. It restricts direct access to some components of an object, enhancing security and modularity.
    - In our `BankAccount` class, we encapsulate the `balance` field and the `updateBalance` method, making them private so they can’t be accessed directly from outside the class.

2. **Access Modifiers**:
    - Java provides access modifiers (`private`, `protected`, `public`, and package-private) to control the visibility of classes, methods, and variables.
    - `private`: Limits visibility to the class itself. The `balance` field and `updateBalance` method in `BankAccount`, and the `transactionId` field and `generateTransactionId` method in the `Transaction` class, are all private, so they’re not directly accessible from outside their respective classes.

3. **Inner Classes**:
    - An inner class is a class defined within another class. Inner classes can access the private fields and methods of the outer class, creating a strong relationship between the two.
    - Here, `Transaction` is an inner class of `BankAccount`, giving it direct access to `BankAccount`’s private `balance` field and `updateBalance` method.
    - Inner classes are useful when you want to logically group classes that are used only in one place and allow the outer class to have fine-grained control over the inner class’s visibility.

4. **Accessing Private Members of Inner and Outer Classes**:
    - In Java, an outer class can access the private members of its inner class, and an inner class can access private members of its outer class. This bidirectional access is unique to inner classes.
    - In our example, the outer `BankAccount` class can access the private `transactionId` field and `generateTransactionId` method in `Transaction`. Similarly, `Transaction` can access `BankAccount`'s private `balance` field and `updateBalance` method.