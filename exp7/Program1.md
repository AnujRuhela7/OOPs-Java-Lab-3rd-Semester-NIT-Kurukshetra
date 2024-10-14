### Explanation:
1. **Class A and Class B**:
    - Both `A` and `B` have default constructors that print a message when they are invoked.

2. **Class C**:
    - Class `C` inherits from class `A`. As there is no constructor explicitly defined in class `C`, the compiler provides a default constructor.
    - Class `C` also has a member variable `B b = new B();`, which creates an instance of class `B` as part of the composition.

3. **What Happens When Creating an Object of Class C**:
    - When you create an object of class `C`, the following happens:
        - The default constructor of the superclass (`A`) is called automatically.
        - The member variable `b` (which is an object of class `B`) is initialized, and its constructor is invoked.
        - Therefore, the constructors of both `A` and `B` are executed, and the order of execution is important:
            - First, the superclass (`A`) constructor is called.
            - Then, the member object of class `B` is constructed.

### Key Points:
- **Inheritance**: The constructor of the superclass `A` is called automatically when an object of the derived class `C` is created.
- **Composition**: Class `C` contains an object of class `B`, demonstrating composition, where `C` has a member of type `B`.
- **Default Constructors**: When no constructor is explicitly defined for class `C`, a default no-argument constructor is automatically provided, which calls the superclass constructor and initializes member objects.