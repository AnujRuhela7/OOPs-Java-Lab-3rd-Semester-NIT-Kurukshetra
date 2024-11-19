package exp10.program1;

class OutOfStockException extends Exception
{
    public OutOfStockException(String message)
    {
        super(message);
    }
}