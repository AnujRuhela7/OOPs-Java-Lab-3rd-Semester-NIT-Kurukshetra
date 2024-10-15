package exp8.program2;

import exp8.program2.appliances.AirConditioner;
import exp8.program2.appliances.Fans;
import exp8.program2.appliances.Lights;

public class MasterHomeController
{
    public static void main(String[] args)
    {
        Lights light = new Lights();
        Fans fan = new Fans();
        AirConditioner ac = new AirConditioner();

        System.out.println("Controlling Lights : ");
        light.turnOn();
        light.turnOff();

        System.out.println("\nControlling Fans : ");
        fan.turnOn();
        fan.turnOff();

        System.out.println("\nControlling Air Conditioner: ");
        ac.turnOn();
        ac.turnOff();
    }
}