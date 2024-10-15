package exp8.program2.appliances;

import exp8.program2.ApplianceControl;

public class AirConditioner implements ApplianceControl
{
    @Override
    public void turnOn()
    {
        System.out.println("Air Conditioner turned on!");
    }

    @Override
    public void turnOff()
    {
        System.out.println("Air Conditioner turned off!");
    }
}