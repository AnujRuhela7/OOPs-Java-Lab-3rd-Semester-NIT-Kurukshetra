package exp8.program1;

import exp8.program1.child.SMSNotification;

public class NotificationDriver
{
    public static void main(String[] args)
    {
        SMSNotification sms = new SMSNotification();
        sms.send();
    }
}