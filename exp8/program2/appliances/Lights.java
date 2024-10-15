package exp8.program2.appliances;

import exp8.program2.ApplianceControl;

public class Lights implements ApplianceControl
{
    @Override
    public void turnOn()
    {
        System.out.println("Lights turned on!");
    }

    @Override
    public void turnOff()
    {
        System.out.println("Lights turned off!");
    }
}