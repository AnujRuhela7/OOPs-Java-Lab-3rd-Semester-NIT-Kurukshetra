package exp8.program3.car;

import exp8.program3.carComponents.ACControl;
import exp8.program3.carComponents.CarControl;
import exp8.program3.carComponents.EngineControl;
import exp8.program3.carComponents.MusicControl;

/*
 * NOTE TO STUDENTS:
 * It is not strictly necessary to implement this CarController class in order to control the car components.
 * You can directly create an object of the SmartCar class and call the methods on it to control the engine, AC, and music system.
 *
 * The purpose of this CarController class is purely for understanding the concept of how you can pass an interface object as a parameter
 * and then use the class that implements that particular interface to invoke the methods.
 * This demonstrates the power of polymorphism and how it allows flexibility in writing your code.
 */

public class CarController
{
    public void controlEngine(EngineControl engine)
    {
        engine.startEngine();
        engine.stopEngine();
    }

    public void controlAC(ACControl ac)
    {
        ac.turnOnAC();
        ac.turnOffAC();
    }

    public void controlMusic(MusicControl music)
    {
        music.playMusic();
        music.pauseMusic();
    }

    public void checkStatus(CarControl car)
    {
        car.checkCarStatus();
    }
}