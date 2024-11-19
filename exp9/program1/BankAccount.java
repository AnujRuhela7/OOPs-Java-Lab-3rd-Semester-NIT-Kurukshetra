package exp9.program1;

public class BankAccount
{
    private double balance;

    public BankAccount(double initialBalance)
    {
        this.balance = initialBalance;
    }

    private void updateBalance(double amount)
    {
        balance += amount;
    }

    private class Transaction
    {
        public void processTransaction(double amount)
        {
            updateBalance(amount);
            System.out.println("Transaction processed: " + amount);
        }
    }

    public void performTransaction(double amount)
    {
        Transaction transaction = new Transaction();
        transaction.processTransaction(amount);
    }

    public void displayBalance()
    {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args)
    {
        BankAccount account = new BankAccount(500.0);
        System.out.println("Initial Balance:");
        account.displayBalance();

        System.out.println("\nPerforming Transaction of $200...");
        account.performTransaction(200);

        System.out.println("Updated Balance:");
        account.displayBalance();
    }
}