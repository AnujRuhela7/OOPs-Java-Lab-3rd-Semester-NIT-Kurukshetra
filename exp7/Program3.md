### Explanation:

1. **Base Class (`BaseClass`)**:
    - The `BaseClass` defines three overloaded versions of the `display()` method:
        - One that takes an `int` argument.
        - One that takes a `double` argument.
        - One that takes a `String` argument.

2. **Derived Class (`DerivedClass`)**:
    - The `DerivedClass` inherits from `BaseClass` and adds a new overloaded version of the `display()` method, which takes a `boolean` argument.
    - By inheriting the `BaseClass`, the derived class has access to all three overloaded methods from the base class, along with its own version of the method.

3. **Test Class (`TestOverloading`)**:
    - An object of the `DerivedClass` is created.
    - The program then calls all four versions of the `display()` method:
        - `display(int a)` from the base class.
        - `display(double a)` from the base class.
        - `display(String message)` from the base class.
        - `display(boolean flag)` from the derived class.

### Key Points:
- **Method Overloading**: Multiple methods can have the same name but must differ in parameter types or the number of parameters.
- **Inheritance**: The derived class (`DerivedClass`) inherits the overloaded methods from the base class and adds its own overloaded version.
- **Polymorphism**: The derived class has access to all versions of the overloaded method, allowing different parameter types to invoke different versions of the `display()` method.