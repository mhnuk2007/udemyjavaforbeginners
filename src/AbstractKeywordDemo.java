abstract class Car1 {
    public abstract void drive(); // Declaration without implementation
    public abstract void fly();


    public void playMusic() {
        System.out.println("Music is playing");
    }
}

abstract class WagonR extends Car1 {

    public void drive() {
        System.out.println("Driving ...");
    }
}
class UpdatedWagonR extends WagonR{
    public void fly() {
        System.out.println("Flying...");
    }
}

public class AbstractKeywordDemo {
    public static void main(String[] args) {
        Car1 car = new UpdatedWagonR();
        car.drive();         // prints: Driving ...
        car.playMusic();     // prints: Music is playing
        car.fly();           // prints: Flying...
    }
}
