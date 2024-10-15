package exp8.program3.car;

import exp8.program3.carComponents.CarControl;

public class SmartCar extends Vehicle implements CarControl
{
    private boolean isEngineOn = false;
    private boolean isACOn = false;
    private boolean isMusicPlaying = false;

    public SmartCar(int speed)
    {
        super(speed);
    }

    @Override
    public void turnOnAC()
    {
        isACOn = true;
        System.out.println("AC turned on.");
    }

    @Override
    public void turnOffAC()
    {
        isACOn = false;
        System.out.println("AC turned off.");
    }


    @Override
    public void startEngine()
    {
        isEngineOn = true;
        System.out.println("Engine started.");
    }

    @Override
    public void stopEngine()
    {
        isEngineOn = false;
        System.out.println("Engine stopped.");
    }

    @Override
    public void playMusic()
    {
        isMusicPlaying = true;
        System.out.println("Playing music.");
    }

    @Override
    public void pauseMusic()
    {
        isMusicPlaying = true;
        System.out.println("Music paused.");
    }

    @Override
    public void checkCarStatus()
    {
        System.out.println("Car Status : ");
        System.out.println("Engine : " + (isEngineOn ? "ON" : "OFF"));
        System.out.println("AC : " + (isACOn ? "ON" : "OFF"));
        System.out.println("Music : " + (isMusicPlaying ? "Playing" : "Stopped"));
        System.out.println("Speed : " + getSpeed() + " km/h");
    }
}