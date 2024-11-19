### **1. Custom Exception: `AgeRestrictionException`**

#### **Purpose**:
To represent an error condition when a user tries to access age-restricted content without meeting the age requirement.

#### **Definition**:
```java
class AgeRestrictionException extends Exception {
    public AgeRestrictionException(String message) {
        super(message);
    }
}
```

- **Extends `Exception`**: This makes it a checked exception, which means it must be explicitly handled using `try-catch` blocks or declared in the method signature using `throws`.
- **Constructor**: Takes a string `message` as input. This message describes the reason for the exception (e.g., "Access denied - You must be at least 18 years old to view this content").
- **`super(message)`**: Passes the message to the parent `Exception` class, which can then be retrieved later using `getMessage()`.

---

### **2. Class: `ContentAccessSystem`**

This class manages access to age-restricted content by checking a user’s age and throwing an exception if they don’t meet the required age.

---

#### **Method: `checkAgeForContent`**

#### **Definition**:
```java
public void checkAgeForContent(String contentName, int userAge, int requiredAge) throws AgeRestrictionException {
    if (userAge < requiredAge) {
        throw new AgeRestrictionException("Access denied - You must be at least " 
            + requiredAge + " years old to view '" + contentName + "'.");
    } else {
        System.out.println("Access granted! Enjoy watching '" + contentName + "'.");
    }
}
```

#### **Purpose**:
To determine whether a user can access a specific piece of content based on their age.

#### **Inputs**:
- `contentName`: The name of the content (e.g., "18+ Movie").
- `userAge`: The age of the user trying to access the content.
- `requiredAge`: The minimum age required to access the content.

#### **Process**:
1. **Age Check**:
    - If `userAge` is less than `requiredAge`, the method throws an `AgeRestrictionException` with an appropriate message.
    - Example: If a 16-year-old tries to watch an 18+ movie, the exception message might be:  
      `"Access denied - You must be at least 18 years old to view '18+ Movie'."`
2. **Access Granted**:
    - If `userAge` is greater than or equal to `requiredAge`, the method prints a success message:  
      `"Access granted! Enjoy watching '18+ Movie'."`

#### **Throws**:
The `throws` keyword in the method signature indicates that this method can throw an `AgeRestrictionException`, which must be handled by the calling code.

---

#### **Main Method**

The main method simulates different scenarios of users trying to access content with varying age restrictions.

#### **Definition**:
```java
public static void main(String[] args) {
    ContentAccessSystem system = new ContentAccessSystem();
```

1. **Instance Creation**:
    - An object of `ContentAccessSystem` is created to access its methods.

#### **Simulating Test Cases**:
Each test case uses a `try-catch` block to handle the exception thrown by the `checkAgeForContent` method.

---

##### **Test Case 1: User Meets the Age Requirement**

```java
System.out.println("Test Case 1: User meets the age requirement");
try {
    system.checkAgeForContent("18+ Movie", 20, 18);
} catch (AgeRestrictionException e) {
    System.err.println(e.getMessage());
}
```

- **Scenario**: A user aged 20 tries to watch an 18+ movie.
- **Expected Behavior**:
    - Since the user meets the minimum age requirement (`20 >= 18`), access is granted.
    - Output: `"Access granted! Enjoy watching '18+ Movie'."`
- **Exception Handling**:
    - No exception is thrown, so the `catch` block is not executed.

---

##### **Test Case 2: User Does Not Meet the Age Requirement**

```java
System.out.println("\nTest Case 2: User does not meet the age requirement");
try {
    system.checkAgeForContent("18+ Movie", 16, 18);
} catch (AgeRestrictionException e) {
    System.err.println(e.getMessage());
}
```

- **Scenario**: A user aged 16 tries to watch an 18+ movie.
- **Expected Behavior**:
    - The user's age is less than the required age (`16 < 18`), so an `AgeRestrictionException` is thrown.
    - Output (in the `catch` block):  
      `"Access denied - You must be at least 18 years old to view '18+ Movie'."`

---

##### **Test Case 3: User Meets a Higher Age Requirement**

```java
System.out.println("\nTest Case 3: User meets a higher age requirement");
try {
    system.checkAgeForContent("21+ Show", 25, 21);
} catch (AgeRestrictionException e) {
    System.err.println(e.getMessage());
}
```

- **Scenario**: A user aged 25 tries to watch a 21+ show.
- **Expected Behavior**:
    - The user's age meets the requirement (`25 >= 21`), so access is granted.
    - Output: `"Access granted! Enjoy watching '21+ Show'."`

---

##### **Test Case 4: User Does Not Meet a Higher Age Requirement**

```java
System.out.println("\nTest Case 4: User does not meet a higher age requirement");
try {
    system.checkAgeForContent("21+ Show", 19, 21);
} catch (AgeRestrictionException e) {
    System.err.println(e.getMessage());
}
```

- **Scenario**: A user aged 19 tries to watch a 21+ show.
- **Expected Behavior**:
    - The user's age is less than the required age (`19 < 21`), so an `AgeRestrictionException` is thrown.
    - Output (in the `catch` block):  
      `"Access denied - You must be at least 21 years old to view '21+ Show'."`

---

### **Key Concepts in the Code**

1. **Custom Exception Handling**:
    - Custom exceptions (`AgeRestrictionException`) provide meaningful error messages tailored to the specific problem (age restrictions in this case).

2. **Exception Propagation and Handling**:
    - The `checkAgeForContent` method declares that it can throw `AgeRestrictionException`.
    - The main method handles this exception using `try-catch`.

3. **Robust Design**:
    - The `ContentAccessSystem` class is reusable for different types of content with varying age restrictions.
    - Clear separation of logic (e.g., checking age, handling errors).

---

### **Sample Output**

```plaintext
Test Case 1: User meets the age requirement
Access granted! Enjoy watching '18+ Movie'.

Test Case 2: User does not meet the age requirement
Access denied - You must be at least 18 years old to view '18+ Movie'.

Test Case 3: User meets a higher age requirement
Access granted! Enjoy watching '21+ Show'.

Test Case 4: User does not meet a higher age requirement
Access denied - You must be at least 21 years old to view '21+ Show'.
```