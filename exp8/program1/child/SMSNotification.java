package exp8.program1.child;

import exp8.program1.parent.Notification;

public class SMSNotification extends Notification
{
    private String message = "From AD-FLPKRT, Your order is shipped successfully.";

    @Override
    public void send()
    {
        System.out.println("SMS Notification : ");
        System.out.println(message);
    }
}