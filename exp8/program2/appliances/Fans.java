package exp8.program2.appliances;

import exp8.program2.ApplianceControl;

public class Fans implements ApplianceControl
{
    @Override
    public void turnOn()
    {
        System.out.println("Fans turned on!");
    }

    @Override
    public void turnOff()
    {
        System.out.println("Fans turned off!");
    }
}