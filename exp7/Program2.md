### Explanation:

1. **Base Class**:
    - `Base` class has a **non-default constructor** that takes a `String` argument. This constructor is invoked when a `Base` object is created or when it's called from a derived class.

2. **Derived Class**:
    - **Default Constructor (`Derived()`)**: This constructor calls the `super()` method, which invokes the base class constructor with a default message `"Default call from Derived"`.
    - **Non-default Constructor (`Derived(String message)`)**: This constructor calls the `super(message)` to pass the provided message to the base class constructor.

3. **Constructor Chaining**:
    - In both constructors of the `Derived` class, the `super()` call is used to invoke the constructor of the base class (`Base`).
    - When an object of `Derived` is created using either the default or non-default constructor, the respective constructor of the base class is executed first, followed by the body of the derived class constructor.

### Key Points:
- **Explicit Call to `super()`**: If the base class only has a non-default constructor, you **must** explicitly call `super()` with appropriate arguments from the derived class constructor.
- **Constructor Chaining**: The base class constructor is always called before the derived class constructor finishes execution.