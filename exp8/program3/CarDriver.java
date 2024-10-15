package exp8.program3;

import exp8.program3.car.CarController;
import exp8.program3.car.SmartCar;

public class CarDriver
{
    public static void main(String[] args) {
        SmartCar car = new SmartCar(77);

        CarController controller = new CarController();

        System.out.println("Checking Engine: ");
        controller.controlEngine(car);

        System.out.println("\nChecking AC:");
        controller.controlAC(car);

        System.out.println("\nChecking Music:");
        controller.controlMusic(car);

        System.out.println("\nChecking Car Status:");
        controller.checkStatus(car);
    }
}