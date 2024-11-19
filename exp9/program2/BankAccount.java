package exp9.program2;

public class BankAccount
{
    private double balance;

    private class Transaction
    {
        private String transactionId;

        private String generateTransactionId()
        {
            transactionId = "TXN" + System.currentTimeMillis();
            return transactionId;
        }

        public void displayTransactionId()
        {
            System.out.println("Transaction ID: " + transactionId);
        }
    }

    public void testAccessToInnerClass()
    {
        Transaction transaction = new Transaction();
        transaction.generateTransactionId();
        transaction.displayTransactionId();
    }

    public static void main(String[] args)
    {
        BankAccount account = new BankAccount();
        System.out.println("Testing Access to Inner Class Private Elements:");
        account.testAccessToInnerClass();
    }
}