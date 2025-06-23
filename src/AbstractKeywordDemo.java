class Car1 {
    public void drive() {
        // No implementation
    }

    public void playMusic() {
        System.out.println("Music is playing");
    }
}

public class AbstractKeywordDemo {
    public static void main(String[] args) {
        Car1 car = new Car1();
        car.drive();         // does nothing
        car.playMusic();     // prints: Music is playing
    }
}
