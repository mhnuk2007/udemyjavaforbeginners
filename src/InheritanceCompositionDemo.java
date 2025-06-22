// Engine class (used via composition)
class Engine {
    void start() {
        System.out.println("🔧 Engine is starting...");
    }
}

// Car class (base class)
class Car {
    Engine engine = new Engine(); // Car has-a Engine

    void drive() {
        engine.start();  // using Engine
        System.out.println("🚗 Car is driving...");
    }
}

// ElectricCar class (inherits Car)
class ElectricCar extends Car {
    void charge() {
        System.out.println("🔋 ElectricCar is charging...");
    }
}

// Main program
public class InheritanceCompositionDemo {
    public static void main(String[] args) {
        ElectricCar myTesla = new ElectricCar();

        System.out.println("=== ElectricCar Actions ===");
        myTesla.drive();   // from Car (uses Engine)
        myTesla.charge();  // from ElectricCar
    }
}
