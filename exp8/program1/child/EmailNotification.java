package exp8.program1.child;

import exp8.program1.parent.Notification;

public class EmailNotification extends Notification
{
    private String message = "Deloitte: NLA | Congratulations on coming one step closer to discovering your impact with Deloitte!";

    @Override
    public void send()
    {
        System.out.println("Gmail : ");
        System.out.println(message);
    }
}