abstract class Car1 {
    public abstract void drive(); // Declaration without implementation


    public void playMusic() {
        System.out.println("Music is playing");
    }
}

class WagonR extends Car1{

    @Override
    public void drive() {
        System.out.println("Driving ...");
    }
}

public class AbstractKeywordDemo {
    public static void main(String[] args) {
        Car1 car = new WagonR();
        car.drive();         // prints: Driving ...
        car.playMusic();     // prints: Music is playing
    }
}
