package exp10.program1;

public class OnlineStore
{

    public void checkStock(String item, int quantity) throws OutOfStockException
    {
        int stock = getStock(item);
        if (stock < quantity)
        {
            throw new OutOfStockException("The item '" + item + "' is out of stock.");
        }
    }

    private int getStock(String item)
    {
        return 10;
        // Suppose initial quantity is 10 for all products
    }

    public void processPayment(double paymentAmount) throws PaymentFailureException
    {
        double balance = getUserBalance();
        if (balance < paymentAmount)
        {
            throw new PaymentFailureException("Insufficient funds for the payment.");
        }
    }

    private double getUserBalance()
    {
        return 500.00;
        // Initial Balance = $500 ( Assumption )
    }

    public void placeOrder(String item, int quantity, double paymentAmount)
    {
        try
        {
            System.out.println("Placing order for " + quantity + " unit(s) of '" + item + "'.");
            checkStock(item, quantity);
            processPayment(paymentAmount);
            System.out.println("Order placed successfully!");
        }
        catch (OutOfStockException | PaymentFailureException e)
        {
            System.err.println("Order failed: " + e.getMessage());
        }
        finally
        {
            System.out.println("Order process ended.");
        }
    }

    public static void main(String[] args)
    {
        OnlineStore store = new OnlineStore();

        System.out.println("Test Case 1: Successful Order");
        store.placeOrder("Laptop", 2, 1000.00);

        System.out.println("\nTest Case 2: Out of Stock");
        store.placeOrder("Smartphone", 20, 500.00);

        System.out.println("\nTest Case 3: Payment Failure");
        store.placeOrder("Tablet", 1, 600.00);
    }
}