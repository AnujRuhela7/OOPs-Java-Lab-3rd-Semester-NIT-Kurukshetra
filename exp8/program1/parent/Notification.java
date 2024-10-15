package exp8.program1.parent;

public abstract class Notification
{
    public Notification()
    {
        System.out.println("Notification Constructor Called!");
        send();
    }

    abstract public void send();
}