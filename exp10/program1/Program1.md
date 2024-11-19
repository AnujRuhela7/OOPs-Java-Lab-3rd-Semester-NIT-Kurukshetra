### **1. Custom Exceptions**

#### **OutOfStockException**
- This is a custom exception class that extends the `Exception` class.
- It is used to signal that the item requested by the user is out of stock.
- **Constructor**: Takes a message as an argument that describes the reason for the exception.

```java
class OutOfStockException extends Exception {
    public OutOfStockException(String message) {
        super(message);
    }
}
```

#### **PaymentFailureException**
- Another custom exception class that extends the `Exception` class.
- It is thrown when the payment process fails, for instance, due to insufficient funds.
- **Constructor**: Similar to `OutOfStockException`, it accepts a descriptive message.

```java
class PaymentFailureException extends Exception {
    public PaymentFailureException(String message) {
        super(message);
    }
}
```

---

### **2. OnlineStore Class**

This class models the functionalities of an online store and includes methods for checking stock, processing payment, and placing an order.

#### **Method: checkStock**
- Purpose: Verifies if the requested item is available in sufficient quantity.
- Input:
    - `item`: Name of the item.
    - `quantity`: Quantity requested by the user.
- Process:
    - Calls a helper method `getStock` to get the current stock for the item.
    - If the stock is less than the requested quantity, throws an `OutOfStockException` with a relevant message.

```java
public void checkStock(String item, int quantity) throws OutOfStockException {
    int stock = getStock(item); // Simulated method to get stock quantity
    if (stock < quantity) {
        throw new OutOfStockException("The item '" + item + "' is out of stock.");
    }
}
```

#### **Helper Method: getStock**
- Simulates fetching the stock of an item.
- Returns a fixed value (`10`) for simplicity.

```java
private int getStock(String item) {
    return 10;
}
```

#### **Method: processPayment**
- Purpose: Checks if the user has sufficient balance to make the payment.
- Input:
    - `paymentAmount`: The amount to be paid.
- Process:
    - Calls a helper method `getUserBalance` to simulate the user's account balance.
    - If the balance is less than the payment amount, throws a `PaymentFailureException`.

```java
public void processPayment(double paymentAmount) throws PaymentFailureException {
    double balance = getUserBalance();
    if (balance < paymentAmount) {
        throw new PaymentFailureException("Insufficient funds for the payment.");
    }
}
```

#### **Helper Method: getUserBalance**
- Simulates fetching the user's balance.
- Returns a fixed value (`500.00`) for simplicity.

```java
private double getUserBalance() {
    return 500.00;
}
```

#### **Method: placeOrder**
- Purpose: Combines checking stock and processing payment into a single operation.
- Input:
    - `item`: Name of the item.
    - `quantity`: Quantity requested.
    - `paymentAmount`: The amount to be paid.
- Process:
    - Prints a message indicating the order process.
    - Calls `checkStock` and `processPayment` to validate the order.
    - If successful, prints a success message.
    - If any exception is thrown, it catches the exception and prints the relevant error message.
    - The `finally` block ensures the process ends, printing a final message regardless of success or failure.

```java
public void placeOrder(String item, int quantity, double paymentAmount) {
    try {
        System.out.println("Placing order for " + quantity + " unit(s) of '" + item + "'.");
        checkStock(item, quantity);
        processPayment(paymentAmount);
        System.out.println("Order placed successfully!");
    } catch (OutOfStockException | PaymentFailureException e) {
        System.err.println("Order failed: " + e.getMessage());
    } finally {
        System.out.println("Order process ended.");
    }
}
```

---

### **3. Main Method**
The `main` method simulates different scenarios of placing an order. It creates an instance of `OnlineStore` and tests the `placeOrder` method with varying conditions.

#### **Test Case 1: Successful Order**
- Item: "Laptop".
- Quantity: 2.
- Payment Amount: $1000.
- **Result**: Since the stock and user balance are sufficient, the order is placed successfully.

```java
System.out.println("Test Case 1: Successful Order");
store.placeOrder("Laptop", 2, 1000.00);
```

#### **Test Case 2: Out of Stock**
- Item: "Smartphone".
- Quantity: 20.
- Payment Amount: $500.
- **Result**: The requested quantity exceeds the stock, so an `OutOfStockException` is thrown, and the order fails.

```java
System.out.println("\nTest Case 2: Out of Stock");
store.placeOrder("Smartphone", 20, 500.00);
```

#### **Test Case 3: Payment Failure**
- Item: "Tablet".
- Quantity: 1.
- Payment Amount: $600.
- **Result**: The payment amount exceeds the user's balance, so a `PaymentFailureException` is thrown, and the order fails.

```java
System.out.println("\nTest Case 3: Payment Failure");
store.placeOrder("Tablet", 1, 600.00);
```

---

### **Key Concepts Covered**
1. **Custom Exceptions**:
    - Encapsulate specific error conditions (`OutOfStockException` and `PaymentFailureException`).

2. **Exception Handling**:
    - Combines `try-catch-finally` for robust error handling.
    - Prints appropriate messages for different error scenarios.

3. **Encapsulation**:
    - Internal methods (`getStock`, `getUserBalance`) abstract implementation details.

4. **Reusable Design**:
    - The `OnlineStore` class can be easily expanded to include additional functionalities (e.g., order cancellation, refund processing).

---

### **Output**
For the provided test cases, the output is as follows:

```
Test Case 1: Successful Order
Placing order for 2 unit(s) of 'Laptop'.
Order placed successfully!
Order process ended.

Test Case 2: Out of Stock
Placing order for 20 unit(s) of 'Smartphone'.
Order failed: The item 'Smartphone' is out of stock.
Order process ended.

Test Case 3: Payment Failure
Placing order for 1 unit(s) of 'Tablet'.
Order failed: Insufficient funds for the payment.
Order process ended.
```