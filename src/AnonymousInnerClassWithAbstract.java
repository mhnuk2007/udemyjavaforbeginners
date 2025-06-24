// Abstract class with an abstract method
abstract class A4 {
    // Abstract method to be implemented by subclass or anonymous class
    abstract void show();
}

public class AnonymousInnerClassWithAbstract {
    public static void main(String[] args) {

        // Creating an anonymous inner class that extends abstract class A4
        A4 obj = new A4() {
            @Override
            void show() {
                System.out.println("in inner class show"); // Implementation of the abstract method
            }
        };

        // Calling the implemented method
        obj.show(); // Output: in inner class show
    }
}
