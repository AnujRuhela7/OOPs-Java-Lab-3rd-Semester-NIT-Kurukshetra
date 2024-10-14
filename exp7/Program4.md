### Explanation:

1. **Final Method**:
    - The `FinalMethodClass` contains a method `display()` marked as `final`. This means it cannot be overridden in any subclass.
    - The `DerivedClass` attempts to override the `display()` method. If the overridden method is uncommented, it will cause a compile-time error stating that a final method cannot be overridden.

2. **Final Class**:
    - The `FinalClass` is declared as `final`, which means no class can inherit from it.
    - The commented `SubClass` attempts to extend `FinalClass`. If this code is uncommented, it will result in a compile-time error stating that a final class cannot be subclassed.

3. **Main Method**:
    - In the `main` method, an object of `DerivedClass` is created, and the `display()` method (from `FinalMethodClass`) is called.
    - An object of `FinalClass` is also created, and its method `show()` is called.

### Key Points:
- **Final Method**: A method declared with the `final` keyword cannot be overridden in derived classes.
- **Final Class**: A class declared with the `final` keyword cannot be extended or inherited.
- **Compile-Time Errors**: Attempting to override a final method or inherit from a final class results in compile-time errors, enforcing these restrictions at the code level.