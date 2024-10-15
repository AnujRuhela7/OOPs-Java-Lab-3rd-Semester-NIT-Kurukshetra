### Explanation:
1. **Interface (`ApplianceControl`)**:
    - The `ApplianceControl` interface defines two public methods, `turnOn()` and `turnOff()`, that any appliance must implement.

2. **Classes (`Light`, `Fan`, `AirConditioner`)**:
    - Each appliance class implements the `ApplianceControl` interface.
    - The `turnOn()` and `turnOff()` methods are overridden in each class to provide specific behavior (e.g., printing whether the appliance is on or off).

3. **Main Class (`MasterHomeController`)**:
    - In the `main()` method, objects for each appliance (Light, Fan, AirConditioner) are created.
    - The `turnOn()` and `turnOff()` methods are called for each appliance to demonstrate that these methods are automatically public, as required by the interface.


This demonstrates that the `turnOn()` and `turnOff()` methods, being part of the `ApplianceControl` interface, are automatically public, ensuring that the appliances expose their control functionality for external access.