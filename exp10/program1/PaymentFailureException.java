package exp10.program1;

class PaymentFailureException extends Exception
{
    public PaymentFailureException(String message)
    {
        super(message);
    }
}